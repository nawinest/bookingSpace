<%-- 
    Document   : booking-page
    Created on : Apr 16, 2018, 2:23:26 PM
    Author     : mac
--%>

<%@page import="model.PlaceData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/booking-page.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit:100,200,400" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
        <!-- scripted for  datepicker -->
        <link href="https://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
        <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.0.0/flatly/bootstrap.min.css">-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
    </head>

    <body>
        <%@ include file="header-nav.jsp" %>
        <%
            PlaceData pd_rs = (PlaceData) request.getAttribute("data_set");

        %>


        <div class="container content-wrap">
            <div class="content">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="topper-topic" style="color: #e237a0;">กรอกรายละเอียดการจองไปที่ </div>
                        <h3><%= pd_rs.getPlace_name()%></h3>
                        <div class="address_place" style="font-weight: 200;"><i class="fas fa-map-marker-alt" style="color: #e237a0;"></i> <%= pd_rs.getPlace_address()%></div>
                        <hr>
                        <div class="priceall">

                            <% if (pd_rs.getPrice_pday() != 0.0) {%>
                            <div class="pday pclass"><%= pd_rs.getPrice_pday()%> <span> ต่อวัน </span></div>
                            <%} else {%>
                            <div class="pday pclass not_support">  ไม่เปิดจองแบบวัน</span></div>
                            <%}%>
                            <% if (pd_rs.getPrice_phour() != 0.0) {;%>

                            <div class="phour pclass"><%= pd_rs.getPrice_phour()%> <span> ต่อชั่วโมง </span></div>
                            <%} else {%>
                            <div class="pday pclass not_support">  ไมเปิดจองแบบชั่วโมง</span></div>
                            <%}%>

                        </div>
                    </div>
                </div>
                <hr>
                <div class="" style="margin-left: 1em;">กรุณาเลือกประเภทการจองของท่าน</div>    
                <ul class="nav nav-tabs">
                    
                    <li class="nav-item">
                        <a class="nav-link " <% if (pd_rs.getPrice_pday() != 0.0) {%> data-toggle="tab" <%}else{%> onclick="show_disable()"<%}%> href="#home">จองแบบรายวัน</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " <% if (pd_rs.getPrice_phour() != 0.0) {%> data-toggle="tab" <%}else{%> onclick="show_disable()"<%}%> href="#menu1">จองแบบรายชั่วโมง</a>
                    </li>

                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div class="tab-pane container" id="home">
                        <div class="from-booking">
                            <form method="POST" action="booking.do?type=day">
                                <%
                                    session.setAttribute("place_name", pd_rs.getPlace_name());
                                    session.setAttribute("cost_pday", pd_rs.getPrice_pday());
                                    session.setAttribute("cost_phour",pd_rs.getPrice_phour());
                                %>
                                <div class="content2">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <h5>รายละเอียดงานอีเว้นท์ของท่าน</h5>
                                            <div class="from-group" style="margin-bottom: 1em;">
                                                <span class="label">จำนวนผู้เข้าร่วม *</span>
                                                <div class="input">
                                                    <input type="input" class="form-control" name="people">
                                                </div>
                                            </div>
                                            <div class="from-group">
                                                <span class="label">บอกรายละเอียดเกี่ยวกับอีเว้นท์ของท่าน (optional)</span>
                                                <div class="input">
                                                    <textarea class="form-control" rows="5" name="event_description"></textarea>
                                                </div>
                                            </div>
                                            <div class="from-group">
                                                <span class="label">เลือกวันเวลาที่ท่านต้องการจอง</span>
                                                <div class="input">
                                                    <div class="row">
                                                        <div class="col-md-6" style="font-weight: 200">
                                                            เวลาเริ่มจอง
                                                            <input type='text' class="form-control date-picker" id='datetimepicker1' name="start-time" />
                                                        </div>
                                                        <div class="col-md-6"  style="font-weight: 200">
                                                            เวลาสิ้นสุดการจอง
                                                            <input type='text' class="form-control date-picker" id='datetimepicker2' name="end-time" />
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="fixed-bottom">
                                    <button type="submit" class="book_button"> Booking </button>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="tab-pane container" id="menu1">
                        <div class="tab-pane active container" id="home">
                            <div class="from-booking">
                                <form method="POST" action="booking.do?type=hour">
                                    <%
                                        session.setAttribute("place_name", pd_rs.getPlace_name());
                                    %>
                                    <div class="content2">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <h5>รายละเอียดงานอีเว้นท์ของท่าน</h5>
                                                <div class="from-group" style="margin-bottom: 1em;">
                                                    <span class="label">จำนวนผู้เข้าร่วม *</span>
                                                    <div class="input">
                                                        <input type="input" class="form-control" name="people">
                                                    </div>
                                                </div>
                                                <div class="from-group">
                                                    <span class="label">บอกรายละเอียดเกี่ยวกับอีเว้นท์ของท่าน (optional)</span>
                                                    <div class="input">
                                                        <textarea class="form-control" rows="5" name="event_description"></textarea>
                                                    </div>
                                                </div>
                                                <div class="from-group">
                                                    <span class="label">เลือกวันเวลาที่ท่านต้องการจอง</span>
                                                    <div class="input">
                                                        <div class="row">
                                                            <div class="col-md-12" style="font-weight: 200">
                                                                วันที่ต้องการจอง
                                                                <input type='text' class="form-control date-picker" id='datetimepicker3' name="daypicker" />
                                                            </div>
                                                            
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-6"  style="font-weight: 200">
                                                                เวลาเริ่มจอง
                                                                <input type='text' class="form-control date-picker" id='timepicker1' name="start-time" />
                                                            </div>
                                                            <div class="col-md-6"  style="font-weight: 200">
                                                                เวลาสินสุดการจอง
                                                                <input type='text' class="form-control date-picker" id='timepicker2' name="end-time" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="fixed-bottom">
                                        <button type="submit" class="book_button"> Booking </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                   
                </div>


            </div>
        </div>
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/booking.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
        <!-- scripted choosen-->
        <!--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.21.0/moment.min.js" type="text/javascript"></script>
        <script src="js/bootstrap-datetimepicker.min.js"></script>
        <script type="text/javascript">
            $(function () {
                // $('#datetimepicker1').datetimepicker();
                $('#datetimepicker1').datetimepicker({
                    format: 'YYYY/MM/DD',

                });
                $('#datetimepicker2').datetimepicker({
                    format: 'YYYY/MM/DD',

                });
                $('#datetimepicker3').datetimepicker({
                    format: 'YYYY/MM/DD',

                });
                 $('#timepicker1').datetimepicker({
                    format: 'HH:mm',

                });
                 $('#timepicker2').datetimepicker({
                    format: 'HH:mm',

                });



            });
            
            function show_disable(){
                alert("Sorry , this place not support in this booking type");
            }
        </script>
        <script type="text/javascript">
            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', 'UA-36251023-1']);
            _gaq.push(['_setDomainName', 'jqueryscript.net']);
            _gaq.push(['_trackPageview']);

            (function () {
                var ga = document.createElement('script');
                ga.type = 'text/javascript';
                ga.async = true;
                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(ga, s);
            })();
        </script>
    </body>

</html>