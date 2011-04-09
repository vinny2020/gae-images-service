<html>
<head></head>
<body>
<h2>Simple, Streaming Image Transformations</h2>


<p>
    Description
    Apply a simple transformation to an image without having to save it in the Blobstore (for working with stored images go <u>here</u>)


</p>

        <p>
 The POSTed url takes on the general form of:   <b>/stream/\${OPERATION}/\${PARAMETER}/</b>    <br/>  <br/>

for example, the following url will scale an image to 300x200 pixels: http://hcongruent.appspot.com/stream/resize/300/200/ (see curl example below)
            <br/>avalable \${OPERATION}s and their corresponding \${PARAMETER}s are: <br/>

            <ul>
             <li><b>resize</b> <br/>parameters: /resizeX/resizeY/</li>
             <li><b>rotate</b> <br/>parameters: /rotateDegrees/ (<i>must</i> be a multipile of 90)</li>
             <li><b>verticalflip</b> <br/>parameters: none</li>
             <li><b>horizontalflip</b> <br/>parameters: none</li>
             <li><b>crop</b> <br/>parameters: /leftX/topY/rightX/bottomY/</li>
             <li><b>lucky</b> <br/>parameters: none</li>
            </ul>


        </p>




Available Formats:  <br/>
BINARY         <br/>
                <br/>
HTTP Method:      <br/>
POST
<br/>
Requires Authentication
False

Headers <br/>
None

 <p>
Parameters
For a simple transformation we need to send the following parameters in a multi-part form format: <br/>
     submit = submit and  photo={Image BINARY file}
in the sample url below:
<br/>
<br/>
     note: replace 'hcongruent' with your GAE application id
     <br/> <br/>

 <code>curl -v  -F "photo=@my_local_Image.jpg" -F "submit=submit" http://hcongruent.appspot.com/stream/resize/300/200/ -o image.jpg</code>

</p>


<p>

Responses  <br/>
If you receive a HTTP 200 OK header, you can assume the image was successfully uploaded. Still check the key field for null.
All non-http errors well be set to 500<br/>

Sample XML Response:  <br/>
NONE:
    <br/>You will get a direct binary response (image) that must be handled appropriately (use curl's -o to save the image locally)
</p>

<% context.getServerInfo() %>
	
</body>
</html>