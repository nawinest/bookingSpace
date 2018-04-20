<%-- 
    Document   : booking-history
    Created on : Apr 16, 2018, 2:25:28 PM
    Author     : mac
--%>

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
                    <div class="row ticket-info ticket-warp">
                        <div class="col-sm-12 col-md-6 img-tab">
                            <div>
                                <img class="logo_place" src="https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/hires/2017/whatisspacet.jpg">
                            </div>
                        </div>
                        <div class="col-sm-12 col-md-6">
                            <h3 class="place-name"> NapLab : Co-working Space</h3>
                            <hr>
                            <p class="ticket-full-price">ฟรี</p>
                            <p class="ticket-buyer-name">Nawin Phunsawat</p>
                            <div class="place-info">
                                <a class="txt-b" href="#"><i class="far fa-calendar-alt"></i> 24 มีนาคม 2018 | 12:00</a>
                                <br>
                                <a class="txt-b" href="#"><i class="far fas fa-map-marker-alt"></i> C. P. Tower, Silom, Bang Rak, Bangkok, Thailand </a>
                            </div>
                            <div class="manage-btn">
                                <button class="btn-can">Cancel</button>
                            </div>
                        </div>
                    </div>
                    <div class="row ticket-info ticket-warp">
                        <div class="col-sm-12 col-md-6 img-tab">
                            <div>
                                <img class="logo_place" src="https://www.jpl.nasa.gov/images/nustar/20171030/nustar20171030-16.jpg">
                            </div>
                        </div>
                        <div class="col-sm-12 col-md-6">
                            <h3 class="place-name"> NapLab : Co-working Space</h3>
                            <hr>
                            <p class="ticket-full-price">ฟรี</p>
                            <p class="ticket-buyer-name">Nawin Phunsawat</p>
                            <div class="place-info">
                                <a class="txt-b" href="#"><i class="far fa-calendar-alt"></i> 24 มีนาคม 2018 | 12:00</a>
                                <br>
                                <a class="txt-b" href="#"><i class="far fas fa-map-marker-alt"></i> C. P. Tower, Silom, Bang Rak, Bangkok, Thailand </a>
                            </div>
                            <div class="manage-btn">
                                <button class="btn-can">Cancel</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
            <script type="text/javascript" src="js/bootstrap.min.js"></script>
            <script type="text/javascript" src="js/main.js"></script>
    </body>
</html>
