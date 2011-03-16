import com.google.appengine.api.blobstore.BlobKey
import com.google.appengine.api.images.ImagesServiceFactory
import com.google.appengine.api.images.Composite
import com.xaymaca.appengine.IdExchange
import com.xaymaca.appengine.BlobCreator
import com.google.appengine.api.datastore.Entity
import com.google.appengine.api.images.ImagesService.OutputEncoding
import com.google.appengine.api.images.ImagesService
import com.google.appengine.api.images.Composite.Anchor




List<Composite> compList = new ArrayList()

def idx = new IdExchange()

def xml = request.getInputStream().getText()

//log.info "the grail? "  + xml






def compose =new XmlSlurper().parseText(xml)
def allCompositions = compose.composite



for (composite in allCompositions ) {
    
    String imageKey = composite.@imgKey.toString() 
    def blobKeyString = new BlobKey(idx.idToBlob(imageKey))
    def image =  images.makeImageFromBlob(blobKeyString)
    int xOffset = Integer.valueOf(composite.@xOffset.toString() ) 
    int yOffset = Integer.valueOf(composite.@yOffset.toString() )
    float opacity = Float.valueOf(composite.@opacity.toString()) 
    def anchorString = composite.@anchor.toString()
    Enum anchor
    if(anchorString != null && anchorString != "") {
        anchor = Composite.Anchor.valueOf(anchorString.toUpperCase())
        log.info "anchor  is a " + anchor.getClass()
    }

    Composite composition = ImagesServiceFactory.makeComposite(image, xOffset, yOffset, opacity, anchor)
    compList.add(composition)
    
}

int width = Integer.valueOf(compose.finalImage.@width.toString())
int height = Integer.valueOf(compose.finalImage.@height.toString())
long color = Long.decode(compose.finalImage.@color.toString()) 
def encodeString = compose.finalImage.@encodeAs.toString()
Enum encodeAs 

if(encodeString != null && encodeString != "") {
    encodeAs = ImagesService.OutputEncoding.valueOf(encodeString.toUpperCase())
   
    log.info "encodeAs is a " + encodeAs.getClass()
}

def newImage

if(encodeAs != null && encodeAs != '') {
    newImage = images.composite(compList, width, height, color, encodeAs )  
}

else {
    
    newImage = images.composite(compList, width, height, color )  
  
}



byte[] binImage   = newImage.imageData
    
String imgType = newImage.getFormat()
def extention = imgType.toLowerCase()
def mime = "image/" + extention
            
def creator = new BlobCreator()  
def newKey = creator.addBlob("img.${extention}","george",binImage, mime)
    

if(newKey != null ) {
    //log.info "we hotness! " + "oldkey " + blobKeyString + " new key " + newKey
        
    def uuid =  UUID.randomUUID().toString()
    //  log.info " uuid is " + uuid
           
    def imageIDs = new Entity("ImageIDs")
    imageIDs.shortID =  uuid
    imageIDs.blobKey = newKey
    imageIDs.save()
    
    
    // set response type
    response.setContentType( "text/xml" )

    // render image out
    //sout << pic.imageData
 
    def responseXML = """
    <?xml version="1.0" encoding="UTF-8"?>
    <image>
    <key>${uuid}</key>
    <fileURL>/image/${uuid}/</fileURL> 
    </image>
    
    """
    out << responseXML
}










/*

<compose>
<composite imgKey="" xOffset="10" yOffset="0"  opacity="0.5" anchor="BOTTOM_RIGHT" />
<composite imgKey="" xOffset="5" yOffset="0"  opacity="0.5" anchor="CENTER_CENTER" />
<finalImage width="300" height="200" color="green" encodeAs="PNG" /> 
</compose>


 */