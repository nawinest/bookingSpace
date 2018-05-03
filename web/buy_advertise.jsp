<%-- 
    Document   : buy_advertise.jsp
    Created on : Apr 29, 2018, 3:20:54 PM
    Author     : mac
--%>

<%@page import="model.Place"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/booking-page.css">
        <title>BOOKSPACE.COM</title>
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit:100,200,400" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
        <!-- scripted for  datepicker -->
        <link href="https://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.0.0/flatly/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
    </head>

    <body>
        <%@ include file="header-nav.jsp" %>
        <%
            ServletContext sc = getServletContext();
            Connection conn = (Connection) sc.getAttribute("conn");
            String place_name = request.getParameter("place_name");
        %>
        <div class="container content-wrap">
            <div class="content">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="topper-topic" style="color: #e237a0;">กรุณากรอกรายละเอียดการลงโฆษณาให้ครบถ้วน </div>
                        <!-- <h4>Apartment 1 of 4 with green terrace in Roma Nort</h4> -->
                    </div>
                </div>
                <hr>
                <form method="POST" action="advertise.do?place_name=<%= place_name %>">
                    <div class="content2">
                        <div class="row">
                            <div class="col-sm-6">
                                <h5>ลงโฆษณาสถานที่ให้กับ : <br><span style="color: #e237a0;display: box;"> <%= place_name %> </span></h5>
                                <hr>
                                <div class="from-group">
                                    <span class="label">เลือกวันเวลาที่ท่านต้องการลงโฆษณา</span>
                                    <div class="input">
                                        <div class="row">
                                            <div class="col-md-6">
                                                วันเริ่มต้น
                                                <input type='text' class="form-control date-picker" id='datetimepicker1' name="start-time" />
                                            </div>
                                            <div class="col-md-6">
                                                วันสิ้นสุด
                                                <input type='text' class="form-control date-picker" id='datetimepicker2' name="date_expire" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <hr>
                                <div class="type_ads">
                                    กรุณาคลิกรวมราคา
                                    <span class="btn btn-warning" onClick="show_cost_ads()"> รวมราคา : </span>
                                    <input type="text" id="coster" value="none" name="cost" disabled style="border-style: none;max-width:74px;"> bath
                                    <hr>
                                </div>
                                <div class="type_ads">
                                    ประเภทการโฆษณา : โฆษณาตัวที่ 1
                                    <p style="font-weight: 200;font-size: 0.9em;">
                                        รายละเอียดการโฆษณา : เป็นโฆษณาตัวที่แสดงสถานที่ของคุณก่อนใครไม่ต้องเสริชก็จะเห็นสถานที่ก่อน จำกัดเพียง 10 ที่เท่านั้น
                                        <br> <span style="color: #e237a0;display: box;">ราคาต่อ 1 วัน : 1200</span>
                                    </p>

                                </div>
                                <div class="fixed">
                                    <button type="submit" class="book_button"> Request For Ads </button>
                                </div>
                            </div>
                        </div>
                    </div>

                </form>

            </div>
        </div>
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/booking.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
        <!-- scripted choosen-->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script> -->
        <!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.21.0/moment.min.js" type="text/javascript"></script>
        <script src="js/bootstrap-datetimepicker.min.js"></script>
        <script type="text/javascript">
                                            $(function () {
                                                // $('#datetimepicker1').datetimepicker();

                                                $('#datetimepicker1').datetimepicker({
                                                    format: 'MM/DD/YYYY'
                                                });
                                                $('#datetimepicker2').datetimepicker({
                                                    useCurrent: false,
                                                    format: 'MM/DD/YYYY'//Important! See issue #1075
                                                });
                                                $("#datetimepicker1").on("dp.change", function (e) {
                                                    $('#datetimepicker2').data("DateTimePicker").minDate(e.date);
                                                });
                                                $("#datetimepicker2").on("dp.change", function (e) {
                                                    $('#datetimepicker1').data("DateTimePicker").maxDate(e.date);
                                                });


                                            });
                                            function show_cost_ads() {
                                                $('#coster').val((datediff(parseDate($('#datetimepicker1').val()), parseDate($('#datetimepicker2').val()))) * 1200);
                                            }
                                            function parseDate(str) {
                                                console.log(str);
                                                var mdy = str.split('/');
                                                return new Date(mdy[2], mdy[0] - 1, mdy[1]);
                                            }

                                            function datediff(first, second) {
                                                // Take the difference between the dates and divide by milliseconds per day.
                                                // Round to nearest whole number to deal with DST.
                                                return Math.round((second - first) / (1000 * 60 * 60 * 24));
                                            }
        </script>
    </body>

</html>