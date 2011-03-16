<%
        import  com.xaymaca.appengine.FlickrHelper

        def flickr = new FlickrHelper()


        fURL = flickr.retrieveRandomFrontImage();

%>
<html>
<head>
    <title>
        Functional Google Image REST API TEST
    </title>
    <script type="text/javascript" language="javascript">

    fURL = "${fURL}"
    </script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
    <script type="text/javascript" src="/js/jqueryRestTest.js"></script>
    <style type="css">
        button {
        width:12;background-color:gray;
        }
    </style>


</head>
<body>

The Google Image REST tester <br/>


<!--
 TEST 1:    Upload a local  image  to the blobstore

<a href="/george/image/page2.gtpl"> Upload testing tool</a> (updated)        <br/>-->

Random image:<br/>




<br/>
<br/>
<br/>
<br/>

Part I: Storage:
<br/>
<br/>

<br/>
<br/>

TEST 1: Upload this random Flickr Image to the blobstore for further processing:<br/>
<img id="randomflick" src="/images/ajax-loader.gif" alt="random flickr image"/> <br/>
<div id="flickrErr"></div>

<script type="text/javascript" language="javascript">
    jQuery(document).ready(function() {
   showFlickr(fURL);
    });
</script>

<br/>
<br/>





<div id="output2"></div>
<img id="img2" src="/images/ajax-loader.gif" alt="example image 2"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput2">
</div>
<br/>
<br/>
<br/>
<br/>

Part II: Manipulations:
<br/>
<br/>


TEST 2: <span style="font-weight:bold">getServingUrl() method (with image id)</span>


<button id="load1" type="button">Load Me!</button><br/>

<p id="rest1"></p>


<div id="output1"></div>
<img style="display:none;" id="img1" src="/images/ajax-loader.gif" alt="example image "/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput1">
</div>
<br/>
<br/>
<br/>
<br/>


TEST 3: <span style="font-weight:bold">Flip horizontal</span>

<button id="load3" type="button">Load Me!</button><br/>
<p id="rest3"></p>


<div id="output3"></div>
<img style="display:none;" id="img3" src="/images/ajax-loader.gif" alt="example image  3"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput3">
</div>
<br/>
<br/>
<br/>
<br/>


TEST 4: <span style="font-weight:bold">Flip Verticle</span>
<button id="load4" type="button">Load Me!</button><br/>

<p id="rest4"></p>
<br/>

<div id="output4"></div>
<img style="display:none;" id="img4" src="/images/ajax-loader.gif" alt="example image 4"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput4">
</div>

<br/>
<br/>
<br/>
<br/>


TEST 5: <span style="font-weight:bold">Rotate 90 degrees</span>
<button id="load5" type="button">Load Me!</button><br/>

<p id="rest5"></p>

<div id="output5"></div>
<img style="display:none;" id="img5" src="/images/ajax-loader.gif" alt="example image 5"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput5">
</div>

<br/>
<br/>
<br/>
<br/>

TEST 6: <span style="font-weight:bold">Crop</span>
<button id="load6" type="button">Load Me!</button><br/>

<p id="rest6"></p>

<div id="output6"></div>
<img style="display:none;" id="img6" src="/images/ajax-loader.gif" alt="example image 6"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput6">
</div>

<br/>
<br/>
<br/>
<br/>

TEST 7: <span style="font-weight:bold">Scale Image (300x200) </span>
<button id="load7" type="button">Load Me!</button><br/>

<p id="rest7"></p>

<div id="output7"></div>
<img style="display:none;" id="img7" src="/images/ajax-loader.gif" alt="example image 7"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput7">
</div>

<br/>
<br/>
<br/>
<br/>

TEST 8: <span style="font-weight:bold">I Feel lucky</span>
<button id="load8" type="button">Load Me!</button><br/>

<p id="rest8"></p>

<div id="output8"></div>
<img style="display:none;" id="img8" src="/images/ajax-loader.gif" alt="example image 8"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput8">
</div>

<br/>
<br/>
<br/>
<br/>
<div id="log" ></div>

</body>
</html>





