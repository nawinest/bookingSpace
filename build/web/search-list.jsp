<%-- 
    Document   : search-list
    Created on : Apr 16, 2018, 2:29:49 PM
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
        <link rel="stylesheet" type="text/css" href="css/stylelogin.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/searchlistStyle.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>

    <body>
        <%@ include file="header-nav.jsp" %>

        <div class="container">
            <div class="row" width="100%">
                <div class="toggle-btn">
                    <div id="show-collapse" data-toggle="collapse" data-target="#multiCollapse">
                        Search more <i class="fas fa-angle-double-down"></i>
                    </div>
                </div>
            </div>
        </div>
        <div class="wrap-list_page collapse" id="multiCollapse">
            <div class="container list_page">
                <div class="row">
                    <div class="col-md-12">
                        <div class="hero-search">

                            <div class="row">
                                <div class="col-md-4">
                                    <div class="label-search">
                                    </div>
                                    <div>
                                        <span class="select-wrapper">
                                            <select class="form-control no-radius">
                                                <option value="0" disabled="" selected="true"> คุณต้องการทำกิจกรรมอะไร ? </option>
                                                <option value="1">ประชุม </option>
                                                <option value="1">สัมมนา </option>
                                                <option value="1">เวิร์คช็อป </option>
                                                <option value="1">งานเปิดตัวสินค้า </option>
                                                <option value="1">ปาร์ตี้ </option>
                                                <option value="1">ถ่ายภาพ / บันทึกภาพ </option>
                                                <option value="1">มินิคอนเสิร์ต</option>
                                            </select>
                                        </span>
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <div class="label-search">
                                    </div>
                                    <div>
                                        <span class="select-wrapper">
                                            <select class="form-control no-radius">
                                                <option value="0" disabled="" selected="true"> กิจกรรมถูกจัดที่ย่านใด ? </option>
                                                <option value="1">ประชุม </option>
                                                <option value="1">สัมมนา </option>
                                                <option value="1">เวิร์คช็อป </option>
                                                <option value="1">งานเปิดตัวสินค้า </option>
                                                <option value="1">ปาร์ตี้ </option>
                                                <option value="1">ถ่ายภาพ / บันทึกภาพ </option>
                                                <option value="1">มินิคอนเสิร์ต</option>
                                            </select>
                                        </span>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="label-search">
                                    </div>
                                    <div>
                                        <span class="select-wrapper">
                                            <select class="form-control no-radius">
                                                <option value="0" disabled="" selected="true"> จำนวนคน </option>
                                                <option value="1">0-10 </option>
                                                <option value="1">10+ </option>
                                                <option value="1">20+ </option>
                                                <option value="1">50+ </option>
                                                <option value="1">100+ </option>

                                            </select>
                                        </span>
                                    </div>
                                </div>

                            </div>
                            <div class="row" style="margin-top: 0.5em;">
                                <div class="col-md-3 align-self-end" style="margin-bottom: -0.6em;">
                                    <input class="button-submit" type="summit" value="FIND PLACE !" name="">
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-12 bottom-hero">
                    ต้องการลงพื้นที่ของท่าน
                </div>
            </div>
        </div>
        <!-- section tab content -->
        <div class="container nav-wrap">
            <div class="navigator-tab">
                <ul class="tabs">
                    <li class="tab-link current" data-tab="tab-1">ดูแบบลิสต์</li>
                    <li class="tab-link" data-tab="tab-2">ดูผ่านแผนที่</li>
                </ul>
            </div>
        </div>
        <div id="tab-1" class="container tab-content current">
            <div class="row">
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <div class="show-pic-spon sponpic1">
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                            <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                            <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                            <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            <hr>
                            <button class="button-submit-2">Booking</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <div class="show-pic-spon sponpic1">
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                            <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                            <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                            <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            <hr>
                            <button class="button-submit-2">Booking</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <div class="show-pic-spon sponpic1">
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                            <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                            <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                            <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            <hr>
                            <button class="button-submit-2">Booking</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <div class="show-pic-spon sponpic1">
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                            <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                            <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                            <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            <hr>
                            <button class="button-submit-2">Booking</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <div class="show-pic-spon sponpic1">
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                            <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                            <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                            <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            <hr>
                            <button class="button-submit-2">Booking</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <div class="show-pic-spon sponpic1">
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                            <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                            <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                            <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            <hr>
                            <button class="button-submit-2">Booking</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <div class="show-pic-spon sponpic1">
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                            <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                            <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                            <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            <hr>
                            <button class="button-submit-2">Booking</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="tab-2" class="container tab-content">
            <div class="row">
                <div class="col-sm-12">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3875.810902355874!2d100.7771276152767!3d13.72989559036163!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x311d664988a1bedf%3A0xcc678f180e221cd0!2sKMITL!5e0!3m2!1sth!2sth!4v1522948810265" width="100%" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                </div>
            </div>
        </div>
        <!-- footer -->
        <div class="footer-nw">
            <div class="sub-bg-footer">
                <div class="container">
                    <div class="col-12">
                        <h5>
                            Contact Us
                        </h5>
                        <p style="font-size: 0.75rem">
                            Email: 59070088@it.kmitl.ac.th
                            <br> Phone Number: +66970699888
                        </p>
                        <div class="sub-main">
                            <button class="button-two"><span>Become Partner</span></button>
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