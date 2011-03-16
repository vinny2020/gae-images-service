
package com.xaymaca.appengine;

import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.api.urlfetch.FetchOptions;
import com.google.appengine.api.urlfetch.HTTPHeader;
import com.google.appengine.api.urlfetch.HTTPMethod;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;
import com.google.appengine.api.utils.SystemProperty;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xaymaca
 */
public class BlobCreator {
  // need to return error code.  
    
private static final boolean PRODUCTION_MODE = SystemProperty.environment.value() == SystemProperty.Environment.Value.Production;
    
private static final String URL_PREFIX = PRODUCTION_MODE ? "" : "http://127.0.0.1:8080";

private CacheFetch cacheFetch = CacheFetch.createCacheFetch();

    public Map addBlob(String memkey, String cmd, byte[] imageBytes,String imageType) {
       Map map = new HashMap();
      String answer = null;
      String tempanswer;
      if( memkey== "new")  {
        tempanswer = null;
      }
        else {
       tempanswer = cacheFetch.get(memkey) ;
      }

      if(tempanswer== null)  {
          Logger.getLogger(BlobCreator.class.getName()).log(Level.INFO, "nothing in cache " + tempanswer);
          try {
              answer = sendToBlobStore(memkey, cmd, imageBytes, imageType);
          } catch (IOException ex) {
              Logger.getLogger(BlobCreator.class.getName()).log(Level.SEVERE, null, ex);
          }

          //try again
          if (answer == null) {
              try {
                  answer = sendToBlobStore(memkey, cmd, imageBytes, imageType);
              } catch (IOException ex) {
                  Logger.getLogger(BlobCreator.class.getName()).log(Level.SEVERE, null, ex);
              }
          }

           //try 3rd time
          if (answer == null) {
              try {
                  answer = sendToBlobStore(memkey, cmd, imageBytes, imageType);
              } catch (IOException ex) {
                  Logger.getLogger(BlobCreator.class.getName()).log(Level.SEVERE, null, ex);
              }
          }

           //try 4th time
          if (answer == null) {
              try {
                  answer = sendToBlobStore(memkey, cmd, imageBytes, imageType);
              } catch (IOException ex) {
                  Logger.getLogger(BlobCreator.class.getName()).log(Level.SEVERE, null, ex);
              }
          }

           //try 5th time
          if (answer == null) {
              try {
                  answer = sendToBlobStore(memkey, cmd, imageBytes, imageType);
              } catch (IOException ex) {
                  Logger.getLogger(BlobCreator.class.getName()).log(Level.SEVERE, null, ex);
              }
          }






      }
        else {
          Logger.getLogger(BlobCreator.class.getName()).log(Level.INFO, "we got this from the cache : " + tempanswer);
          map.put("cached", true);
          map.put("blobKey", tempanswer);
          return map;

      }




        if(answer != null) {
            Logger.getLogger(BlobCreator.class.getName()).log(Level.INFO, "adding do cache: key " + memkey + " and value" + answer);
            cacheFetch.put(memkey,answer);
            map.put("cached", false);
            map.put("blobKey", answer);
        }



        return map;
}

private String sendToBlobStore(String memkey, String cmd, byte[] imageBytes, String imageType) throws IOException {
    String answer = null;
    String urlStr = URL_PREFIX+BlobstoreServiceFactory.getBlobstoreService().createUploadUrl("/insertBlob.groovy");
    URLFetchService urlFetch = URLFetchServiceFactory.getURLFetchService();
    HTTPRequest req = new HTTPRequest(new URL(urlStr), HTTPMethod.POST, FetchOptions.Builder.withDeadline(5.0));
    
    String boundary = makeBoundary();
    
    req.setHeader(new HTTPHeader("Content-Type","multipart/form-data; boundary=" + boundary));
    
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    
    write(baos, "--"+boundary+"\r\n");
    writeParameter(baos, "a_name", memkey);
    write(baos, "--"+boundary+"\r\n");
    writeImage(baos, cmd, imageBytes, imageType);
    write(baos, "--"+boundary+"--\r\n");

    req.setPayload(baos.toByteArray());
    try {
      HTTPResponse resp =  urlFetch.fetch(req);
      if(resp != null) {
//          List headerList = resp.getHeaders();
//          Iterator it = headerList.listIterator();
//          while(it.hasNext()) {
//              HTTPHeader header = (HTTPHeader) it.next();
//              if(header.getName().equals("myKey")) {
//                  answer = header.getValue();
//                  Logger.getLogger(BlobCreator.class.getName()).log(Level.INFO, "answer is {0}", answer);
//                  return answer;
//              }
//          }
          System.out.println("answer is " +new String (resp.getContent()));
         answer =   new String (resp.getContent());
          
                  
                  }
    } catch (IOException e) {
        // Need a better way of handling Timeout exceptions here - 10 second deadline
        System.out.println("Possible timeout? "+ e.getLocalizedMessage());
        
        
         answer = null;
        
       
    }
   
    return answer;
}

private static Random random = new Random();    

private static String randomString() {
    return Long.toString(random.nextLong(), 36);
}

private String makeBoundary() {
    return "---------------------------" + randomString() + randomString() + randomString();
}        

private void write(OutputStream os, String s) throws IOException {
    os.write(s.getBytes());
}

private void writeParameter(OutputStream os, String name, String value) throws IOException {
    write(os, "Content-Disposition: form-data; name=\""+name+"\"\r\n\r\n"+value+"\r\n");
}

private void writeImage(OutputStream os, String name, byte[] bs, String imageType) throws IOException {
    write(os, "Content-Disposition: form-data; name=\""+name+"\"; filename=\"image.jpg\"\r\n");
   // Logger.getLogger(BlobCreator.class.getName()).log(Level.INFO, "Content-Disposition: form-data; name=\"" + name + "\"; filename=\"image.jpg\"\r\n");
    write(os, "Content-Type: " + imageType + "\r\n\r\n");
    os.write(bs);
    write(os, "\r\n");
}

}
