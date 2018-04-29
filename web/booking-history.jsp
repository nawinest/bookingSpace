<%-- 
    Document   : booking-history
    Created on : Apr 16, 2018, 2:25:28 PM
    Author     : mac
--%>

<%@page import="model.BookingData"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Booking"%>
<%@page import="java.util.List"%>
<%@page import="model.Place"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/bookingpage_style.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
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
        <div class="line-separate"></div>
        <div class="container">
            <div class="row">
                <ol class="tab_on">
                    <li>Your booking history</li>
                    <li id="wallet-showing" style="color:#ec0186;">
                        <span class="hidden-xs">แสดงรายการ: </span> ประวัติการสั่งซื้อ
                    </li>
                </ol>
                <div class="col-lg-10 offset-lg-1">
                    <% for (BookingData bk_data : bk_set) {%>
                    <div class="row ticket-info ticket-warp">

                        <div class="col-sm-12">
                            <h3 class="place-name">การจองหมายเลข <span style="color:#ec0186;">#<%= bk_data.getBooking_id()%></span></h3>
                            <a class="txt-b" href="place_query.do?place_name=<%= bk_data.getPlace_name()%>"><i class="far fas fa-map-marker-alt"></i> คลิกดูรายละเอียดสถานที่ </a>

                            <hr>
                            <div class="row" style="margin-bottom:1em;">
                                <div class="col-sm-12">
                                    ชื่อสถานที่ : <%= bk_data.getPlace_name()%>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="label"> ราคารวม </div>
                                    <p class="ticket-full-price"><%= bk_data.getCost()%></p>
                                </div>
                                <div class="col-sm-4">
                                    <div class="label"> เวลาที่ทำการจอง </div>
                                    <p class="ticket-booking-time"><%= bk_data.getBooking_time().substring(0, bk_data.getBooking_time().length() - 2)%></p>
                                </div>
                                <div class="col-sm-4">
                                    <div class="label"> สถานะการจอง  
                                        <p><span <% if (bk_data.getStatus_accept_booking().equals("not_accept")) { %> style="color:red;" <%} else {%> style="color:green" <%}%>>
                                                <%= bk_data.getStatus_accept_booking()%>
                                            </span></p>
                                    </div>
                                </div>
                            </div>
                            <div class="purchase_status">
                                สถานะการชำระเงิน : 
                                <% if (bk_data.getStatus_accept_booking().equals("not_accept")) { %>
                                <span style="color:red;font-size:0.8em;">กรุณารอการอนุมัติจากเจ้าของสถานที่</span>
                                <% } else if (bk_data.getStatus_payment().equals("yes")) {%>
                                <span style="color:red;font-size:0.8em;">ชำระเงินแล้ว</span>
                                <div class="warning-info" style="font-size:0.65em;">คำเตือนหากท่านกด Cancel หรือยกเลิกท่านจะไม่สามารถได้รับเงินคืน</div>

                                <% } else {%>
                                <span style="color:red;font-size:0.8em;">ยังไม่ได้ชำระเงิน</span>
                                <%}%>
                            </div>
                            <!--<p class="ticket-buyer-name"><%= session.getAttribute("name")%></p>-->

                            <div class="place-info">
                       
                                <i class="far fa-calendar-alt"></i> <%= bk_data.getTime_checkin().substring(0, bk_data.getTime_checkin().length() - 2)%> - <%= bk_data.getTime_checkout().substring(0, bk_data.getTime_checkout().length() - 2)%>
                                <br>
                            </div>
                                
                            <% if (bk_data.getStatus_payment().equals("no") && bk_data.getStatus_accept_booking().equals("accept")) {%>
                            <a href="payment-page.jsp?booking_id=<%= bk_data.getBooking_id()%>"> <button class="booking_payment">คลิกเข้าสู่หน้าชำระเงิน</button></a>
                            <% } %>
                            

                            <div class="manage-btn">
                                <a href="deletebooking.do?delete=true&booking_id=<%=bk_data.getBooking_id()%>">
                                    <button class="btn-can2" >Cancel</button>
                                </a>
                            </div>
                        </div>
                    </div>
                    <%}%>

                </div>
            </div>
            <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
            <script type="text/javascript" src="js/bootstrap.min.js"></script>
            <script type="text/javascript" src="js/main.js"></script>
    </body>
</html>
