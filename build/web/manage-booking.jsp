<%-- 
    Document   : manage-booking
    Created on : Apr 21, 2018, 7:21:09 PM
    Author     : mac
--%>

<%@page import="model.Booking"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.BookingData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKSPACE.COM</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/place.css">
        <link rel="stylesheet" type="text/css" href="css/manage-booking.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit:100,200,400" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>

    <body>

        <%@ include file="header-nav.jsp" %>
        <%
            ServletContext sc = getServletContext();
            Connection conn = (Connection) sc.getAttribute("conn");
            String place_name = request.getParameter("place_name");
            Booking bk = new Booking(conn);
            ArrayList<BookingData> bk_set = bk.queryBookingAll_Place(place_name);
        %>
        <div class="container content-wrap">
            <div class="content">
                <div class="main-topic">
                    <h3>Your booking table : <%= place_name%></h3>
                    <a href="manage-place.jsp">
                        <button class="btn btn-danger"> <i class="fas fa-caret-left"></i> กลับสู่หน้าจัดการสถานที่ </button>
                    </a>
                    <hr>
                </div>
                <div class="show_all_booking">
                    <% for (BookingData bk_data : bk_set) {%>
                    <div class="booking">
                        <div class="label-top" style="color: red;">การจองหมายเลข #<%= bk_data.getBooking_id()%></div>
                        <div class="row one-of_books">
                            <div class="col-md-2">
                                <div class="label">ชื่อผู้จอง</div>
                                <div class="contenter"><%= bk_data.getName_of_customer()%></div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">สถานะการชำระเงิน</div>
                                <div class="contenter">
                                    <% if (bk_data.getStatus_accept_booking().equals("not_accept")) { %>
                                    <span style="color:red;font-size:1em;">กรุณารอการอนุมัติจากเจ้าของสถานที่</span>
                                    <% } else if (bk_data.getStatus_payment().equals("yes")) {%>
                                    <span style="color:red;font-size:1em;">ชำระเงินแล้ว</span>
                                    <% } else {%>
                                    <span style="color:red;font-size:1em;">ยังไม่ได้ชำระเงิน</span>
                                    <%}%>
                                </div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">ช่วงเวลาที่จอง</div>
                                <div class="contenter"><%= bk_data.getTime_checkin().substring(0, bk_data.getTime_checkin().length() - 2)%> <br>ถึง <%= bk_data.getTime_checkout().substring(0, bk_data.getTime_checkout().length() - 2)%> </div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">จำนวนคน</div>
                                <div class="contenter"><%= bk_data.getPeople()%></div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">รายละเอียดการจอง</div>
                                <div class="contenter"><%= bk_data.getBooking_description()%></div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">สถานะการจอง</div>
                                <div class="contenter">
                                    <% if( bk_data.getStatus_accept_booking().equals("accept") ){ %>
                                    <span style="color:green;font-size:1.2em;">accept</span>
                                    <% } else{%>
                                    <a href="approvebooking.do?booking_id=<%= bk_data.getBooking_id()%>"><button class="btn btn-warning" >คลิกเพื่ออนุมัติ</button></a>
                                    <% } %>    
                                </div>
                            </div>
                        </div>
                        <hr>
                    </div>
                    <% }%>
                </div>
            </div>
            <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
            <script type="text/javascript" src="js/bootstrap.min.js"></script>
            <script type="text/javascript" src="js/main.js"></script>
            <script type="text/javascript" src="js/place.js"></script>
            <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
    </body>

</html>