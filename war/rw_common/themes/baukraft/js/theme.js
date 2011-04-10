jQuery.noConflict();

jQuery(document).ready(function($) {

    $( 'body:has(.blog-entry)' ).addClass( 'blog' );
    $('#navbar li:last-child').css({"background":"none", "padding-right": "0"});

});
