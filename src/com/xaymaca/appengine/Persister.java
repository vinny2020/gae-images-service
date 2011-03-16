
package com.xaymaca.appengine;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.xaymaca.appengine.IdExchange;
import java.util.Random;

/**
 *
 * @author xaymaca
 */
public class Persister {
    

    String blobKey;
    static Random generator = new Random();



    String[] letterz = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    private static final Logger log = Logger.getLogger(Persister.class.getName());


    public Persister(String key) {
      
        this.blobKey = key;
        
        
    }
    
    
    public String persist() {



    String rand1 = letterz[generator.nextInt(25)];
    String rand2 = letterz[generator.nextInt(25)];
    //  log.info " uuid is " + uuid
           
    Entity imageIDs = new Entity("ImageIDs");
    imageIDs.setProperty("blobKey", this.blobKey);
    datastore.put(imageIDs);

    String uuid = new Long(imageIDs.getKey().getId()).toString() + rand1 + rand2;

     imageIDs.setProperty("shortID", uuid);
    datastore.put(imageIDs);
    IdExchange idx = new IdExchange();
    if (idx.blobToId(this.blobKey) == null) {
      log.info("we have a persist failure, trying again...");

    imageIDs.setProperty("blobKey", this.blobKey);
    datastore.put(imageIDs);
     imageIDs.setProperty("shortID", uuid);
     datastore.put(imageIDs);

     if (idx.blobToId(this.blobKey) == null) {
      log.severe( "we have a 2nd persist failure, giving up...");
     }
      
      
    } 
    //check to see if it's in there
    
    return uuid;
    }

}
