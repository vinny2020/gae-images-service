/* Extend jQuery with functions for PUT and DELETE requests. */

function _ajax_request(url, data, callback, type, method) {
    if (jQuery.isFunction(data)) {
        callback = data;
        data = {};
    }
    return jQuery.ajax({
        type: method,
        url: url,
        data: data,
        success: callback,
        dataType: type
        });
}

jQuery.extend({
    put: function(url, data, callback, type) {
        return _ajax_request(url, data, callback, type, 'PUT');
    },
    delete_: function(url, data, callback, type) {
        return _ajax_request(url, data, callback, type, 'DELETE');
    }
});


// REST tests


function displayMethods(imageID){

//display of the urls :

$('#rest1').html(' Method: Get, URL: <b> /image/simpletransform/' + imageID + '/300/false/ </b> ')
$('#rest3').html(' Method: Get, URL: <b> /image/flip/' + imageID + '/horizontal/ </b> ')
$('#rest4').html(' Method: Get, URL: <b> /image/flip/' + imageID + '/vertical/ </b>')
$('#rest5').html(' Method: Get, URL: <b> /image/rotate/' + imageID + '/90/ </b>')
$('#rest6').html(' Method: Get, URL: <b> /image/crop/' + imageID + '/0.1/0.1/0.9/0.9/ </b>')
$('#rest7').html(' Method: Get, URL: <b>/image/resize/' + imageID + '/200/300/ </b>')
$('#rest8').html(' Method: Get, URL: <b> /image/lucky/' + imageID + '/ </b>')


}

//load random image


function showFlickr(flickrURL) {

 //alert('flickr url is ' + flickrURL);

/*    $.ajax({
       url: flickrURL

       })
    .success(function(){ $('#randomflick').attr( 'src', flickrURL ) })
    .error(function(){   $('#flickrErr').html( 'Error; flickr API call timed out' )   }) ;*/

     $('#randomflick').attr( 'src', flickrURL )


    }



$(document).ready(function() {





var url1 = 'http://hcongruent.appspot.com/image/fromUrl/' + fURL;

var key2 ;
var trueError ;



//store an image from a url

$.get(url1, function(data){

key2 = jQuery(data).contents().find( 'key' ).text() ;

$('#output2').html("<b>Image is now stored in the app engine blobstore as : " + key2 + "</b>" ) ;

displayMethods(key2);


var string2 = (new XMLSerializer()).serializeToString(data);

$('#xmloutput2').text(string2);
if(key2 != null) {
var imgurl2 = '/image/' + key2 + '/'
$('#img2').attr( 'src', imgurl2 );




function populate(a) {
trueError = a;
       // alert(trueError)
       // alert($(trueError).filter('h1').unwrap('h1').text() )
       return $(trueError).filter('h1').unwrap('h1').text()
}


//transformations

function clicktotransform(url, index ) {



$('#load' + index).one('click',function() {

transformImage(url, index) ;

});




}



function transformImage(url, index)  {


 var start_time = new Date().getTime();
 var total_time


// and remember the jqxhr object for this request
      $.ajax({
            type: 'GET',
            url: url,
          //  data: {url:$('#url')},
          //  dataType: "HTML",
            success: function(data){


$('#output' + index ).html("Image key is: " + $(data).contents().find( 'key' ).text()) ;

var thekey = $(data).contents().find( 'key' ).text() ;
var thexml = (new XMLSerializer()).serializeToString(data);

$('#xmloutput' + index).text(thexml);
$('#img' + index).show(12);
$('#img' + index ).attr( 'src', '/image/' + thekey + '/' );



            },

            error: function(jqXHR, textStatus, errorThrown) {

            var dispayErr =  populate(jqXHR.responseText);

             $('#output' + index).html('<span style="font-color:red">Error!</span>')
             $('#img' + index).remove();
             $('#xmloutput' + index).html(dispayErr).css('font-color','red')

            },
            complete: function(jqXHR, textStatus) {

           // total_time =  new Date().getTime() - start_time ;
            // alert('function took ' + total_time/1000 + ' seconds to load') ;

            }

    })






}






// simple transform method : getServingUrl()
//register click events

 clicktotransform('/image/simpletransform/' + key2 + '/500/false/', 1)
 clicktotransform('/image/flip/' + key2 + '/horizontal/', 3)
 clicktotransform('/image/flip/' + key2 + '/vertical/', 4)
 clicktotransform('/image/rotate/' + key2 + '/90/', 5)
 clicktotransform('/image/crop/' + key2 + '/0.1/0.1/0.9/0.9/', 6)
 clicktotransform('/image/resize/' + key2 + '/200/300/', 7)
 clicktotransform('/image/lucky/' + key2 + '/', 8)








}

});

});









