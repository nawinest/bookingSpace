<%-- 
    Document   : booking-page
    Created on : Apr 16, 2018, 2:23:26 PM
    Author     : mac
--%>

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
    </head>

    <body>
        <%@ include file="header-nav.jsp" %>
        <div class="container content-wrap">
            <div class="content">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="topper-topic" style="color: #e237a0;">กรอกรายละเอียดการจองไปที่ </div>
                        <h4>Apartment 1 of 4 with green terrace in Roma Nort</h4>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-sm-6">
                        <h5>รายละเอียดงานอีเว้นท์ของท่าน</h5>
                        <div class="from-group" style="margin-bottom: 1em;">
                            <span class="label">จำนวนผู้เข้าร่วม *</span>
                            <div class="input">
                                <input type="input" class="form-control" name="">
                            </div>
                        </div>
                        <div class="from-group">
                            <span class="label">บอกรายละเอียดเกี่ยวกับอีเว้นท์ของท่าน (optional)</span>
                            <div class="input">
                                <textarea class="form-control" rows="5"></textarea>
                            </div>
                        </div>
                        <div class="from-group">
                            <input type="text">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                Date formats: yyyy-mm-dd, yyyymmdd, dd-mm-yyyy, dd/mm/yyyy, ddmmyyyyy
            </div>
            <br />
            <div class="row">
                <div class='col-sm-3'>
                    <div class="form-group">
                        <div class='input-group date' id='datetimepicker1'>
                            <input type='text' class="form-control" />
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span>
                            </span>
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
    </body>
</html>
