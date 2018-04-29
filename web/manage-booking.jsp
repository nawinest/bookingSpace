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
        <title>JSP Page</title>
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
            Booking bk = new Booking(conn);

            String username_user = (String) session.getAttribute("username");
            ArrayList<BookingData> bk_set = bk.queryBookingAll_User(username);


        %>
        <div class="container content-wrap">
            <div class="content">
                <div class="main-topic">
                    <h3>Your booking table : ร้านสตาร์บัค</h3>
                    <a href="manage-place.jsp">
                        <button class="btn btn-danger"> <i class="fas fa-caret-left"></i> กลับสู่หน้าจัดการสถานที่ </button>
                    </a>
                    <hr>
                </div>
                <div class="show_all_booking">
                    <div class="booking">
                        <div class="label-top" style="color: red;">การจองหมายเลข #44422</div>
                        <div class="row one-of_books">
                            <div class="col-md-2">
                                <div class="label">ชื่อผู้จอง</div>
                                <div class="contenter">Jonatan ticktok</div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">วันที่จอง</div>
                                <div class="contenter">31-มีนาคม-2554</div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">จำนวนชั่วโมง</div>
                                <div class="contenter">4</div>
                            </div>
                            <div class="col-md-2">
                                <div class="label">จำนวนคน</div>
                                <div class="contenter">14</div>
                            </div>
                            <div class="col-md-4">
                                <div class="label">รายละเอียดการจอง</div>
                                <div class="contenter">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</div>
                            </div>
                        </div>
                        <hr>
                    </div>
                </div>
            </div>
            <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
            <script type="text/javascript" src="js/bootstrap.min.js"></script>
            <script type="text/javascript" src="js/main.js"></script>
            <script type="text/javascript" src="js/place.js"></script>
            <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
    </body>

</html>