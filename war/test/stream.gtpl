<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Streamed Images</title>
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
            <style type="text/css">


        label{
        width: 22px;
        text-align: left;
        margin-right: 0.5em;
        display: inline;
        }
        .submit input
        {
        margin-left: 4.5em;
        }

        fieldset
        {
        border: 1px solid #781351;
        width: 160px
        }

        legend
        {
        color: #fff;
        background: #ffa20c;
        border: 1px solid #781351;
        padding: 2px 6px
        }
        .row {
        width: 480px
        }

    </style>
    </head>
   <body>
           <div id="bg"></div>
        <div id="pageHeader" class="container_16 clearfix">
            <div id="navcontainer-01" class="grid_16">
                <div id="navbar">
                    <ul><li><a href="../" rel="self"><span>GAE Images Service Demo</span></a></li><li><a href="/test/index.gtpl" rel="self"><span>Persisted Images</span></a></li><li><a href="/test/stream.gtpl" rel="self" class="current"><span>Streamed Images</span></a></li></ul>
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
<h1>Image transformation without saving into the Blobstore</h1>

Summary:
<pre>
post  "/stream/resize/@resizeX/@resizeY/"
post  "/stream/crop/@leftX/@topY/@rightX/@bottomY/"
post  "/stream/rotate/@rotateDegrees/"
post  "/stream/verticalflip/"
post  "/stream/horizontalflip/"
post  "/stream/lucky/"

</pre>


TEST 1: <span style="font-weight:bold">Flip horizontal</span> (/stream/horizontalflip/)




<br/>

<form action="/streamTransform.groovy"
      method="post" enctype="multipart/form-data">
    <input type="file" name="photo"/>
    <input type="hidden" name="type" value="horizontalflip"/>
    <input type="submit" value="Submit"/>
</form>

<!--<button id="load3" type="button">Load Me!</button><br/>-->  <br/>

<p id="rest3"></p>


<div id="output3"></div>
<img style="display:none;" id="img3" src="/images/ajax-loader.gif" alt="example image  3"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput3">
</div>
<br/>
<br/>


TEST 2: <span style="font-weight:bold">Flip Vertical</span> (/stream/verticalflip/)

<br/>

<form action="/streamTransform.groovy"  method="post" enctype="multipart/form-data">
    <input type="file" name="photo"/>
    <input type="hidden" name="type" value="verticalflip"/>
    <input type="submit" value="Submit"/>
</form>
<!--<button id="load4" type="button">Load Me!</button><br/>-->

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


TEST 3: <span style="font-weight:bold">Rotate 90 degrees</span>
<br/>

<form action="/streamTransform.groovy"
      method="post" enctype="multipart/form-data">
    <input type="file" name="photo"/>
    <input type="hidden" name="type" value="rotate"/>
    <input type="submit" value="Submit"/>
    <fieldset style="width:400px">
        <legend>Rotate Degrees</legend>


        <label for="rotateDegrees1"/> 90 <input type="radio" value="90" name="rotateDegrees" id="rotateDegrees1"/>
        <label for="rotateDegrees2"/>180 <input type="radio" value="180" name="rotateDegrees" id="rotateDegrees2"/>
        <label for="rotateDegrees3"/>270 <input type="radio" value="270" name="rotateDegrees" id="rotateDegrees3"/>

    </fieldset>
</form>
<!--<button id="load5" type="button">Load Me!</button><br/>-->  <br/>

<p id="rest5"></p>

<div id="output5"></div>
<img style="display:none;" id="img5" src="/images/ajax-loader.gif" alt="example image 5"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput5">
</div>


<br/>
<br/>
<br/>

TEST 4: <span style="font-weight:bold">Crop  </span>
<br/>

<form action="/streamTransform.groovy"
      method="post" enctype="multipart/form-data">
    <input type="file" name="photo"/>
    <input type="hidden" name="type" value="crop"/>
    <input type="submit" value="Submit"/>
    <fieldset style="width:500px">
        <legend>Crop parameters</legend>
        <p>
            <label for="leftX"/> leftX <input type="text" size="3" name="leftX" id="leftX" value="0.1"/>
            <label for="topY"/> topY <input type="text" size="3" name="topY" id="topY" value="0.1"/>
            <label for="rightX"/> rightX <input type="text" size="3" name="rightX" id="rightX" value="0.9"/>
            <label for="bottomY"/> bottomY <input type="text" size="3" name="bottomY" id="bottomY" value="0.9"/>
        </p>
    </fieldset>
</form>
<!--<button id="load6" type="button">Load Me!</button><br/>-->
<br/>

<p id="rest6"></p>

<div id="output6"></div>
<img style="display:none;" id="img6" src="/images/ajax-loader.gif" alt="example image 6"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput6">
</div>


<br/>
<br/>

TEST 5: <span style="font-weight:bold">Scale Image (300x200) </span>
<br/>

<form action="/streamTransform.groovy"
      method="post" enctype="multipart/form-data">
    <input type="file" name="photo"/>
    <input type="hidden" name="type" value="resize"/>
    <input type="submit" value="Submit"/>
    <fieldset>
        <legend>Resize</legend>

        <label style="width:2px" for="resizeX"/>X <input type="text" size="3" name="resizeX" id="resizeX"
                                                         value="300"/><br/>
        <label style="width:2px" for="resizeY"/>Y <input type="text" size="3" name="resizeY" id="resizeY" value="200"/>
        <br/>
    </fieldset>
</form>
<!--<button id="load7" type="button">Load Me!</button>-->
<br/>

<p id="rest7"></p>

<div id="output7"></div>
<img style="display:none;" id="img7" src="/images/ajax-loader.gif" alt="example image 7"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput7">
</div>

<br/>
<br/>

TEST 6: <span style="font-weight:bold">I Feel lucky</span>
<br/>

<form action="/streamTransform.groovy"
      method="post" enctype="multipart/form-data">
    <input type="file" name="photo"/>
    <input type="hidden" name="type" value="lucky"/>
    <input type="submit" value="Submit"/>
</form>
<!--<button id="load8" type="button">Load Me!</button>-->
<br/>

<p id="rest8"></p>

<div id="output8"></div>
<img style="display:none;" id="img8" src="/images/ajax-loader.gif" alt="example image 8"/>

<div style="width:300px;font-weight:bold;font-family: Times New Roman, Times, serif;" id="xmloutput8">
</div>

<br/>
<br/>
<br/>

<div id="log"></div>

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