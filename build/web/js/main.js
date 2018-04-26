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

function validateFormSearch() {
    var search_objective = document.forms["from_search_place"]["search_objective"].value;
    var search_zone = document.forms["from_search_place"]["search_zone"].value;
    var search_people = document.forms["from_search_place"]["search_people"].value;
    if (search_objective == "any") {
        alert("กรุณาใส่คำค้นหาให้ครบ");
        return false;
    }
}
