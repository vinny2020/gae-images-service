/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xaymaca.appengine;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xaymaca
 */
public class IdExchange {

    private static final Logger log = Logger.getLogger(IdExchange.class.getName());
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

    public String idToBlob(String imgKey) {
        String blobKey;
        String imageKey = imgKey;
        //log.log(Level.INFO, "we got this param {0}", imageKey);

        Query query = new Query("ImageIDs");
        query.addFilter("shortID", Query.FilterOperator.EQUAL, imageKey);
        PreparedQuery pq = datastore.prepare(query);
        Entity imageInfo = pq.asSingleEntity();

        if (imageInfo ==null) {
            log.log(Level.WARNING, "the id is not persisted ", imageKey); 
        }
        
        else {
           log.log(Level.INFO, "we got this object {0}", imageInfo);  
        }
       

        blobKey = imageInfo.getProperty("blobKey").toString();


     //   log.log(Level.INFO, "retrieved this blog key {0}", blobKey);
        return blobKey;



    }

    public String blobToId(String blobKey) {

        String imageKey;



        System.out.println("we got this param " + blobKey);

        //check the cache first

        CacheFetch cacheFetch =  CacheFetch.createCacheFetch();
        //cacheFetch.get()

        Query query = new Query("ImageIDs");
        query.addFilter("blobKey", Query.FilterOperator.EQUAL, blobKey);
        PreparedQuery pq = datastore.prepare(query);
        Entity imageInfo = pq.asSingleEntity();

        System.out.println("short id is " + imageInfo.getProperty("shortID"));
        System.out.println("Info is " + imageInfo);

        imageKey = (String) imageInfo.getProperty("shortID");

        log.info("retrieved this image key " + imageKey);

        return imageKey;



    }
}
