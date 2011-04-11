<%
        import  com.xaymaca.appengine.FlickrHelper

        def flickr = new FlickrHelper()


        fURL = flickr.retrieveRandomFrontImage();

%><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Persisted Images</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="generator" content="RapidWeaver" />
		<!-- User defined head content such as meta tags and encoding options -->
        <script type="text/javascript" src="../rw_common/themes/baukraft/javascript.js"></script>
        <!-- Google AJAX Libraries - jQuery 1.4.3 -->
        <script src="http://www.google.com/jsapi"></script>
        <script type="text/javascript">
            google.load("jquery", "1.4.3");
        </script>
        <!-- Fontface -->
        <style type="text/css" media="all">

            @font-face {
                font-family: 'LiberationSerifRegular';
                src: url('../rw_common/themes/baukraft/fonts/liberationserif-regular-webfont.eot');
                src: local('‚ò∫'), url('../rw_common/themes/baukraft/fonts/liberationserif-regular-webfont.woff') format('woff'),
                url('../rw_common/themes/baukraft/fonts/liberationserif-regular-webfont.ttf') format('truetype'),
                url('%pathto(fonts/liberationserif-regular-webfont.svg#webfontW3XDV1aI)%') format('svg');
                font-weight: normal;
                font-style: normal;
            }

            @font-face {
                font-family: 'LiberationSerifBold';
                src: url('../rw_common/themes/baukraft/fonts/liberationserif-bold-webfont.eot');
                src: local('‚ò∫'), url('../rw_common/themes/baukraft/fonts/liberationserif-bold-webfont.woff') format('woff'),
                url('../rw_common/themes/baukraft/fonts/liberationserif-bold-webfont.ttf') format('truetype'),
                url('%pathto(fonts/liberationserif-bold-webfont.svg#webfontDS0SHySh)%') format('svg');
                font-weight: normal;
                font-style: normal;
            }

        </style>
        <!-- jquery custom code -->
        <script type="text/javascript" src="../rw_common/themes/baukraft/js/theme.js"></script>
        <script type="text/javascript" src="../rw_common/themes/baukraft/js/DD_belatedPNG_0.0.8a.js"></script>
        <link rel="stylesheet" href="../rw_common/themes/baukraft/css/reset.css" type="text/css" media="screen" charset="utf-8" />
        <link rel="stylesheet" href="../rw_common/themes/baukraft/css/960.css" type="text/css" media="screen" charset="utf-8" />
        <link rel="stylesheet" href="../rw_common/themes/baukraft/css/text.css" type="text/css" media="screen" charset="utf-8" />
        <link rel="stylesheet" href="../rw_common/themes/baukraft/styles.css" type="text/css" media="screen" charset="utf-8" />
        <link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/text/default.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/header_font_size/medium.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/header/visibility/on.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/header_image/header_image00.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/container_font_size/medium.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/sidebar/sidebar_right.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/sidebar_font_size/medium.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/footer_font_size/medium.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="../rw_common/themes/baukraft/css/breadcrumb/position/top.css" />
		<!-- Style variations - these are set up in the theme.plist -->
        <!-- User defined styles -->
        <!-- User defined javascript -->
            <script type="text/javascript" language="javascript">

    fURL = "${fURL}"
    </script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
    <script type="text/javascript" src="/js/jqueryRestTest.js"></script>
    <style type="css">
        button {
        <!--width:12;background-color:gray;-->
        }
    </style>


        <!--[if IE]>
            <link rel="stylesheet" href="../rw_common/themes/baukraft/css/styles-ie6.css" type="text/css" media="screen" charset="utf-8" />
        <![endif]-->
        <!--[if IE 6]>
            <script type="text/javascript" src="../rw_common/themes/baukraft/js/theme-ie.js"></script>
            <script type="text/javascript" src="../rw_common/themes/baukraft/js/DD_belatedPNG_0.0.8a.js"></script>
            <script>
                DD_belatedPNG.fix('#bg, #navcontainer-01 li, img');
            </script>
        <![endif]-->
    </head>

<body>

<div id="bg"></div>
        <div id="pageHeader" class="container_16 clearfix">
            <div id="navcontainer-01" class="grid_16">
                <div id="navbar">
                    <ul><li><a href="../" rel="self"><span>GAE Images Service Demo</span></a></li><li><a href="/test/index.gtpl" rel="self" class="current"><span>Persisted Images</span></a></li><li><a href="/test/stream.gtpl" rel="self"><span>Streamed Images</span></a></li></ul>
                </div>
            </div><!-- #navcontainer-01 -->
            <div id="title" class="grid_16">
                <div id="logo">

                </div><!-- #logo -->
                <h1>GAE Images Service Demo</h1>
            </div>
            <h2 id="slogan" class="grid_16"></h2>
        </div><!-- End page header -->
        <div id="headerImageContainer" class="container_16">
            <div id="headerImage">
            </div>
        </div>
        <div id="top-breadcrumbcontainer" class="clearfix container_16">

        </div><!-- #breadcrumbcontainer -->
        <div id="container" class="content container_16">
            <div id="contentContainer" class="grid_12">
                <div id="content">

The Google Image REST tester <br/>

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

    </div><!-- End content -->
            </div><!-- End main content wrapper -->
            <div id="sidebarContainer" class="grid_4">
                <div class="sideHeader">
                    <h2></h2>
                </div><!-- Sidebar header -->
                <div id="sidebar">
                    <!-- sidebar content you enter in the page inspector -->
                    <div id="plugin">
                         <!-- sidebar content such as the blog archive links -->
                    </div><!-- #plugin -->
                </div><!-- End sidebar content -->
            </div><!-- End sidebar wrapper -->
        </div><!-- End container -->
        <div id="bottom-breadcrumbcontainer" class="clearfix container_16">

        </div><!-- #breadcrumbcontainer -->
        <div id="footer" class="container_16">
            <p>&copy; 2011 Xaymaca Studios <a href="#" id="rw_email_contact">Contact Me</a><script type="text/javascript">var _rwObsfuscatedHref0 = "mai";var _rwObsfuscatedHref1 = "lto";var _rwObsfuscatedHref2 = ":xa";var _rwObsfuscatedHref3 = "yma";var _rwObsfuscatedHref4 = "ca@";var _rwObsfuscatedHref5 = "gma";var _rwObsfuscatedHref6 = "il.";var _rwObsfuscatedHref7 = "com";var _rwObsfuscatedHref = _rwObsfuscatedHref0+_rwObsfuscatedHref1+_rwObsfuscatedHref2+_rwObsfuscatedHref3+_rwObsfuscatedHref4+_rwObsfuscatedHref5+_rwObsfuscatedHref6+_rwObsfuscatedHref7; document.getElementById('rw_email_contact').href = _rwObsfuscatedHref;</script></p>
        </div><!-- End Footer -->

</body>
</html>





