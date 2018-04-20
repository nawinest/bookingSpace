var i = 0;
var txt = 'คุณกำลังมองหาสถานที่เพื่อทำกิจกรรมใช่หรือไม่ ?'; /* The text */
var speed = 50; /* The speed/duration of the effect in milliseconds */
var topic = "";

function typeWriter() {
    if (i < txt.length) {
        topic += txt.charAt(i)
        $("#demo").html(topic);
        i++;
        setTimeout(typeWriter, speed);
    }
}

$(document).ready(typeWriter());
$(document).ready(function() {

    $('ul.tabs li').click(function() {
        var tab_id = $(this).attr('data-tab');

        $('ul.tabs li').removeClass('current');
        $('.tab-content').removeClass('current');

        $(this).addClass('current');
        $("#" + tab_id).addClass('current');
    });




});


$( "#btn-update" ).click(function() {
  alert( "updated !" );
});