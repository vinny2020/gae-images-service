<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="robots" content="all"/>
    <meta name="generator" content="RapidWeaver"/>

    <title>image api example</title>
    <!-- <link rel="stylesheet" type="text/css" media="screen" href="/rw_common/themes/urban/styles.css"  />
        <link rel="stylesheet" type="text/css" media="print" href="/rw_common/themes/urban/print.css"  />
        <link rel="stylesheet" type="text/css" media="handheld" href="/rw_common/themes/urban/handheld.css"  />
        <link rel="stylesheet" type="text/css" media="screen" href="/rw_common/themes/urban/css/sidebar/sidebar_right.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="/rw_common/themes/urban/css/header/buildings_industrial.css" />

    -->
    <script type="text/javascript" src="/rw_common/themes/urban/javascript.js"></script>

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
<h1>Image transformation without saving into the Blobstore</h1>


TEST 1: <span style="font-weight:bold">Flip horizontal</span>


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


TEST 2: <span style="font-weight:bold">Flip Vertical</span>

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


</body>
</html>