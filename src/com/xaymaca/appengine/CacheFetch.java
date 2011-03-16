package com.xaymaca.appengine;


import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.cache.Cache;
import javax.cache.CacheException;
import javax.cache.CacheFactory;
import javax.cache.CacheManager;


/**
 * Created by a wonderful Programmer known as:
 * Vincent Stoessel
 * vstoessel@huronconsultinggroup.com
 * on 2/9/11 at  11:31 PM
 */
public class CacheFetch {

    private static Cache cache;

    private CacheFetch() {
        if(cache==null) {
            initCache();
        }

    }

    public static CacheFetch createCacheFetch() {
        return new CacheFetch();
    }


    public void initCache() {
        try

        {

            CacheFactory cacheFactory = CacheManager.getInstance().getCacheFactory();
            cache = cacheFactory.createCache(Collections.emptyMap());



        } catch (CacheException e) {
            Logger.getLogger(CacheFetch.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    public String get(String key) {
        String value = null;
        byte[] val = (byte[]) cache.get(key);
        if (val !=null ) {
            value = new String(val);
        }

        return value;

    }

    public void put(String key, String value) {

        byte[] val = value.getBytes();
        if(key != null && val != null)  cache.put(key, val);
    }


}
