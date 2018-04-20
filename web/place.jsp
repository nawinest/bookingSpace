<%-- 
    Document   : place
    Created on : Apr 16, 2018, 2:28:22 PM
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
        <link rel="stylesheet" type="text/css" href="css/place.css">
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
                <div class="pic-place">
                    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel" data-interval="false">
                        <div class="carousel-inner content-pic">
                            <div class="carousel-item active">
                                <img class="d-block w-100" src="asset/place/1.jpeg" alt="First slide">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="asset/place/2.jpg" alt="Second slide">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="asset/place/3.jpg" alt="Third slide">
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
                <div class="name-location">
                    รายละเอียดของสถานที่
                </div>
                <div class="show-description">
                    <div class="row">
                        <div class="col-md-8">
                            <div class="row">
                                <div class="col-sm-12">
                                    <span class="district-place"> 129 พระราม 9 แขวง ห้วยขวาง เขต ห้วยขวาง Bangkok 10310 </span>
                                    <h2>Apartment 1 of 4 with green terrace in Roma Nort</h2>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div>Status <span class="status"> มีห้องว่าง </span></div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> จุดเด่นของสถานที่ </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="short-descript-place">
                                                เป็นสถานที่ใจกลางเมือง อยู่ใกล้ bts สถานีสยาม
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> สิ่งอำนวยความสะดวก </div>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <div class="ament-wifi amentities"><i class="fas fa-wifi"></i> wifi : <span class="haveable"> yes </span></div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="ament-food amentities"><i class="fas fa-utensils"></i> อาหาร : <span class="haveable"> yes </span></div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="ament-parking amentities"><i class="fas fa-car"></i> ที่จอดรถ : <span class="haveable"> yes </span></div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="ament-room amentities"><i class="fas fa-bed"></i> ห้องพัก : <span class="haveable"> yes </span></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> ตำแหน่งของสถานที่ </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="short-descript-place" id="map">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> ที่อยู่ </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="location-place descriptioner">
                                                129 พระราม 9 แขวง ห้วยขวาง เขต ห้วยขวาง Bangkok 10310
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> ความจุ </div>
                                    <div class="row">
                                        <div class="col-sm-3 capacity-info">
                                            <div class="tocenter">
                                                <div class="icon standing-icon" width="40px" height="40px" data-toggle="tooltip" data-placement="top" title="ยืน"><span class=""></span></div>
                                            </div>
                                            <div class="size">20</div>
                                        </div>
                                        <div class="col-sm-3 capacity-info">
                                            <div class="icon banquat-icon" width="40px" height="40px" data-toggle="tooltip" data-placement="top" title="โต๊ะกลมงานเลี้ยง"><span class=""></span></div>
                                            <div class="size">20</div>
                                        </div>
                                        <div class="col-sm-3 capacity-info">
                                            <div class="icon theator-icon" width="40px" height="40px" data-toggle="tooltip" data-placement="top" title="Theator"><span class=""></span></div>
                                            <div class="size">20</div>
                                        </div>
                                        <div class="col-sm-3 capacity-info">
                                            <div class="icon board-icon" width="40px" height="40px" data-toggle="tooltip" data-placement="top" title="บอร์ดการประชุม"><span class=""></span></div>
                                            <div class="size">20</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> แสดงความคิดเห็น </div>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <label for="comment">Comment:</label>
                                        </div>
                                        <div class="col-sm-9">
                                            <form>
                                                <div class="form-group no-margin-bottom">
                                                    <textarea class="form-control" rows="5" id="comment" placeholder="กรุณาแสดงความคิดเห็นอย่างสุภาพ"></textarea>
                                                </div>
                                                <div class="comment-button">Comment !</div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> ความคิดเห็น </div>
                                    <div class="row comment-wrap">
                                        <div class="col-sm-2">
                                            <div class="pic-profile-wrap">
                                                <img class="user-photo" src="asset/web/user.png">
                                            </div>
                                        </div>
                                        <div class="col-sm-10">
                                            <h6 class="name_user">สมชาย ขนดก</h6>
                                            <p class="comment">สมชายว่ามันดีมากๆ เลยครับ Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                            <hr>
                                        </div>
                                    </div>
                                    <div class="row comment-wrap">
                                        <div class="col-sm-2">
                                            <div class="pic-profile-wrap">
                                                <img class="user-photo" src="asset/web/user.png">
                                            </div>
                                        </div>
                                        <div class="col-sm-10">
                                            <h6 class="name_user">สมชาย ขนดก</h6>
                                            <p class="comment">สมชายว่ามันดีมากๆ เลยครับ Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                            <hr>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <hr>
                        </div>
                        <!-- for booking tab -->
                        <div class="col-md-4">
                            <div class="booking">
                                <div class="booking-in">
                                    <div class="price">
                                        <div class="price-label">
                                            <div>
                                                <span class="price-all"> 800฿ / per hour</span>
                                                <br>
                                                <span class="policy">ต่อชั่วโมง | ค่าเช่าสถานที่เท่านั้น • ขั้นต่ำ 4 ชั่วโมง</span>
                                            </div>
                                        </div>
                                        <hr>
                                    </div>
                                    <a href="">
                                        <button class="booking-button">จองพื้นที่ <i class="fas fa-angle-double-right"></i></button>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="booking-2 fixed-lean">
        <a href="">
            <button class="booking-button-buttom">จองพื้นที่
                <br><i class="fas fa-angle-double-right"></i></button>
        </a>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript" src="js/place.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
</body>
</html>
