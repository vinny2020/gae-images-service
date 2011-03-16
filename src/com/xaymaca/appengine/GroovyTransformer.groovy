package com.xaymaca.appengine

import com.google.appengine.api.images.Image
import java.util.logging.Logger

/**
 * Created by wonderful programmer that uses  IntelliJ IDEA.
 * User: xaymaca
 * Date: 3/2/11
 * Time: 1:05 AM
 */
class GroovyTransformer {

    private static final Logger log = Logger.getLogger(GroovyTransformer.class.getName());

    //TODO take the params as args, also image and transform type

    private static INSTANCE = new GroovyTransformer();

    private GroovyTransformer() {


    }


    public static GroovyTransformer getInstance() {

        return INSTANCE;
    }


    Image singleTranform(String type, Map parameters, Image image) {


        log.info "using these parametere " + parameters

        switch (type) {



            case "verticalflip":
                doflip("vertical", image)
            break
            case "horizontalflip":
                doflip("horizontal", image)
            break
            case "rotate":
                doRotate(parameters.rotateDegrees as Integer, image)
            break
            case "crop":
                doCrop(parameters, image)
            break
            case "lucky":
                doLucky(image)
            break
            case "resize":
                doResize(parameters,image)
            break
            default:
            log.info "wrong type was " + type

        }

    }




    //single transformations


    def doResize(Map params, Image image) {

        return image.resize(params.resizeX as Integer, params.resizeY as Integer)

    }

    def doCrop(Map params, Image image) {
        return image.crop(params.leftX as float , params.topY as float , params.rightX as float , params.bottomY as float )

    }

    def doflip(String orientation, Image image) {

        Image imageTransformed = null


        switch (orientation) {

            case "horizontal":
                imageTransformed = image.horizontalFlip()
                break

            case "vertical":
                imageTransformed = image.verticalFlip()
                break

            default:
            System.out.println("wrong parameter");

        }

        return imageTransformed

    }

    def doRotate(Integer turn, Image image) {

        return image.rotate(turn)
    }

    def doLucky(Image image) {

        return image.imFeelingLucky()


    }


    def doURL(Image image) {
        // return google's url


    }

    //TODO method for each transform type


}
