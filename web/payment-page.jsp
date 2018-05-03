<%-- 
    Document   : booking-page
    Created on : Apr 16, 2018, 2:23:26 PM
    Author     : mac
--%>

<%@page import="model.BookingData"%>
<%@page import="model.Booking"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.PlaceData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKSPACE.COM</title>
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
            int booking_id = Integer.parseInt(request.getParameter("booking_id"));
            ServletContext sc = getServletContext();
            Connection conn = (Connection) sc.getAttribute("conn");
            Booking bk = new Booking(conn);
            BookingData bk_data_result = bk.queryByBooking_id(booking_id);
        %>


        <div class="container content-wrap">
            <div class="content">
                <div class="row">
                    <form action="payment.do" method="post">
                        <div class="col-sm-6">
                            <input type="hidden" name="place_name" value="<%= bk_data_result.getPlace_name()%>" />
                             <input type="hidden" name="cost" value="<%= bk_data_result.getCost() %>" />
                             <input type="hidden" name="booking_id" value="<%= bk_data_result.getBooking_id() %>" />
                            <h5>รายละเอียดการชำระเงิน</h5>
                            <hr>
                            <div class="row">
                                <div class="col-sm-6">
                                    Booking ID #<%= bk_data_result.getBooking_id()%>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="label">ชำระเงินให้กับ</div>
                                    <div class="" style="font-weight: 200;"><%= bk_data_result.getPlace_name()%> </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="label">จำนวนเงิน</div>
                                    <div class="" style="font-weight: 200;"><%= bk_data_result.getCost()%></div>
                                </div>

                            </div>
                            <hr>
                            <div class="from-group">
                                <span class="label">ช่องทางการชำระเงิน</span>
                                <div class="pic-credit">
                                    <img class="img-credit" src="asset/web/credit.png">
                                </div>
                            </div>
                            <div class="from-group" style="margin-bottom: 1em;">
                                <span class="label">หมายเลขบัตรเครดิต/เดบิต</span>
                                <div class="input">
                                    <input type="input" class="form-control" name="">
                                </div>
                            </div>
                            <div class="from-group" style="margin-bottom: 1em;">
                                <span class="label">ชื่อบนบัตร</span>
                                <div class="input">
                                    <input type="input" class="form-control" name="">

                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    วันหมดอายุ
                                    <div class="input">
                                        <input type="input" class="form-control" name="">
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    รหัส CVC/CVV
                                    <div class="input">
                                        <input type="password" class="form-control" name="">
                                    </div>
                                </div>
                            </div>
                            <div class="warning-text" style="font-weight: 200;font-size:0.8em;margin-top: 5px;color:red;"> เมื่อกดจองเเล้วไม่สามารถของเงินคืนได้หากต้องการยกเลิกการจองได้</div>
                            <div class="fixed-bottom">
                                <button type="submit" class="book_button"> Booking </button>
                            </div>
                        </div>
                    </form>

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

    function show_disable() {
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