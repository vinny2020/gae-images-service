package com.xaymaca.restapi

import org.junit.Test
import groovyx.net.http.HttpResponseException
import org.apache.http.entity.mime.MultipartEntity
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.Method.POST
import static groovyx.net.http.ContentType.*
import org.apache.http.entity.mime.content.StringBody
import org.apache.http.entity.mime.content.FileBody;

/**
 * Created by wonderful programmer that uses  IntelliJ IDEA.
 * User: xaymaca
 * Date: 3/17/11
 * Time: 1:11 PM
 */
class UploadImageTest {

    String imageType = 'image/jpeg'
    File imgFile = new File('/Users/xaymaca/Pictures/IMG_2029.jpg')
    FileBody cbFile = new FileBody(imgFile, imageType)
    StringBody oneParam = new StringBody("Submit")

    @Test public void upload() {

        def baseUrl = "http://xaymacastudios.appspot.com/image/new"
        assert streamTransform(baseUrl) != null
        println streamTransform(baseUrl)
    }

    @Test public void test_new_images() {


        def baseUrl = "http://xaymacastudios.appspot.com/image/new"




        for (i in 1..50) {
            //println i + ":"
            streamTransform(baseUrl)
        }


    }

    private def streamTransform(baseUrl) {


        def http = new HTTPBuilder(baseUrl)
        def resp = null
        try {

            resp = http.request(POST, XML) { req ->

                def mpEntity = new MultipartEntity()
                mpEntity.addPart("photo", cbFile)
                mpEntity.addPart("submit", oneParam)
                // mpEntity.addPart("type", type)

                req.entity = mpEntity


            }


        }
        catch (HttpResponseException ex) {
            // default failure handler throws an exception:
            println "Unexpected response error: ${ex.response.contentType}"
        }

        return resp


    }
}
