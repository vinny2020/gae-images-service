jQuery.noConflict();

jQuery(document).ready(function($) {
    $('#navbar ul li').hover(function(){
        $(this).find('ul:first').addClass('visible');
        },function(){
        $(this).find('ul:first').removeClass('visible');
        });
});
