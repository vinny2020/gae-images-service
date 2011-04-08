package com.xaymaca.appengine

/**
 * Created by IntelliJ IDEA.
 * User: xaymaca
 * Date: 2/11/11
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
class FlickrHelper {


   List retrieveSelects(String flickUser) {
       List urls   = new ArrayList()
       def photoset_id = "72157614529783914"
       def dragonset_id = "72157622163739281"

       String url = "http://api.flickr.com/services/rest/?api_key=561b95e0a56e34b48208bfc4f541a65e&method=flickr.photosets.getPhotos&per_page=20&extras=url_s,&photoset_id=${photoset_id}"
       //println "the link is " + url
       String xml = new URL(url).text
       //println "xml is "  + xml
       def photoset = new XmlSlurper().parseText(xml).photoset
       for(photo in photoset.photo) {
         String   urlString =    photo.@url_s
       urls.add(urlString)
      }
    return  photoIDs

  }




  String retrieveRandomFrontImage(){
        Map info  = new HashMap()
      String   urlString;

       //List urls   = new ArrayList()
       def photoset_id = "72157614529783914"
      // def dragonset_id = "72157622163739281"
       def urls = new ArrayList()
      // String url = "http://api.flickr.com/services/rest/?api_key=561b95e0a56e34b48208bfc4f541a65e&method=flickr.photosets.getPhotos&per_page=20&extras=url_s,&photoset_id=${photoset_id}"
       String url = "http://api.flickr.com/services/rest/?api_key=561b95e0a56e34b48208bfc4f541a65e&method=flickr.groups.pools.getPhotos&group_id=34427469792@N01&per_page=20&extras=url_m,url_l"
       //println "the link is " + url
       String xml = new URL(url).text
       //println "xml is "  + xml
       def photos = new XmlSlurper().parseText(xml).photos
       for(photo in photos.photo) {

            urlString  =    photo.@url_m

       urls.add(urlString)
      }

      Integer which1 =  Math.floor(Math.random() * 20)
      //println "which : "  + which1




    return urls.get(which1)
  }









}
