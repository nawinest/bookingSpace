<%-- 
    Document   : search-list
    Created on : Apr 16, 2018, 2:29:49 PM
    Author     : mac
--%>

<%@page import="model.PlaceImage"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.PlaceData"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <style>
        .button-submit:focus{
            outline:0;
        }
    </style>

    <body>
        <%@ include file="header-nav.jsp" %>
        <%--<%= request.getAttribute("message") %>--%>
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
                            <form name="from_search_place" action="searchplace.do" method="get" onsubmit="return validateFormSearch()">
                                <div class="row">
                                    <div class="col-md-4">

                                        <div>
                                            <span class="select-wrapper">
                                                <select class="form-control no-radius" name="search_objective">
                                                    <option value="any" selected="true"> คุณต้องการทำกิจกรรมอะไร ? </option>
                                                    <option value="good_meeting">ประชุม </option>
                                                    <option value="good_seminar">สัมมนา </option>
                                                    <option value="good_workshop">เวิร์คช็อป </option>
                                                    <option value="good_openproduct">งานเปิดตัวสินค้า </option>
                                                    <option value="good_party">ปาร์ตี้ </option>
                                                    <option value="good_photo">ถ่ายภาพ / บันทึกภาพ </option>
                                                    <option value="good_concert">มินิคอนเสิร์ต</option>
                                                </select>
                                            </span>
                                        </div>
                                    </div>

                                    <div class="col-md-4">
                                        <select class="form-control no-radius" name="search_zone">
                                            <option value="%">--- Select Area ---</option>
                                            <option value="Silom - Sathorn">Silom - Sathorn</option>
                                            <option value="Rama 4 - Lumpini">Rama 4 - Lumpini</option>
                                            <option value="Chidlom - Ratchadamri">Chidlom - Ratchadamri</option>
                                            <option value="Asoke - Phrom Phong">Asoke - Phrom Phong</option>
                                            <option value="Thonglor - Phra Khanong">Thonglor - Phra Khanong</option>
                                            <option value="Phayathai - Sam Yan">Phayathai - Sam Yan</option>
                                            <option value="Ratchadaphisek - Huaykwang">Ratchadaphisek - Huaykwang</option>
                                            <option value="Phetchaburi - Rama 9">Phetchaburi - Rama 9</option>
                                            <option value="Din Daeng - Ratchaprarop">Din Daeng - Ratchaprarop</option>
                                            <option value="Ari - Mo Chit">Ari - Mo Chit</option>
                                            <option value="Vipavadee - Donmuang">Vipavadee - Donmuang</option>
                                            <option value="Ladprao">Ladprao</option>
                                            <option value="Sisak - Prachachuen">Sisak - Prachachuen</option>
                                            <option value="Ratchayothin - New Bridge">Ratchayothin - New Bridge</option>
                                            <option value="Kaset - Nawamin">Kaset - Nawamin</option>
                                            <option value="Ngam Wong Wan - Chaengwattana">Ngam Wong Wan - Chaengwattana</option>
                                            <option value="Watcharapol - Sai Mai">Watcharapol - Sai Mai</option>
                                            <option value="Ramindra - Suwinthawong">Ramindra - Suwinthawong</option>
                                            <option value="Rangsit - Pathum Thani">Rangsit - Pathum Thani</option>
                                            <option value="Rattanathibet - Bangyai">Rattanathibet - Bangyai</option>
                                            <option value="Ladkrabang - Suvarnabhumi">Ladkrabang - Suvarnabhumi</option>
                                            <option value="Bangna - Srinakarin">Bangna - Srinakarin</option>
                                            <option value="Onnut - Punnawithi">Onnut - Punnawithi</option>
                                            <option value="Udom Suk - Bearing">Udom Suk - Bearing</option>
                                            <option value="Ramkhamhaeng - Bangkapi">Ramkhamhaeng - Bangkapi</option>
                                            <option value="Samrong - Thepharak">Samrong - Thepharak</option>
                                            <option value="Charoenkrung - Rama 3">Charoenkrung - Rama 3</option>
                                            <option value="Thonburi - Wongwian Yai">Thonburi - Wongwian Yai</option>
                                            <option value="Talat Phlu - Bang Wa">Talat Phlu - Bang Wa</option>
                                            <option value="Rama 2 - Ekachai">Rama 2 - Ekachai</option>
                                            <option value="Charansanitwong">Charansanitwong</option>
                                            <option value="Ratchaphruek">Ratchaphruek</option>
                                            <option value="Bangbuathong - Kanchanaphisek">Bangbuathong - Kanchanaphisek</option>
                                            <option value="Suksawat - Rat Burana">Suksawat - Rat Burana</option>
                                        </select>
                                    </div>
                                    <div class="col-md-4">
                                        <div>
                                            <span class="select-wrapper">
                                                <select class="form-control no-radius" name="search_people">
                                                    <option value="0" selected="true"> จำนวนคน </option>
                                                    <option value="0">0-10 </option>
                                                    <option value="10">10+ </option>
                                                    <option value="20">20+ </option>
                                                    <option value="50">50+ </option>
                                                    <option value="100">100+ </option>

                                                </select>
                                            </span>
                                        </div>
                                    </div>

                                </div>
                                <div class="row" style="margin-top: 0.5em;">
                                    <div class="col-md-3 align-self-end" style="margin-bottom: -0.6em;">
                                        <button class="button-submit" type="summit" value="" name="">FIND PLACE !</button>
                                    </div>
                                </div>
                            </form>
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

                <%
                    if (request.getAttribute("searched") != null) {
                        ArrayList<PlaceData> list_forShow = (ArrayList<PlaceData>) request.getAttribute("place_all");
                        for (PlaceData pd : list_forShow) {

                %>
                <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                    <div class="show_sponser_1 spon">
                        <%                         
                           ArrayList<PlaceImage> pathImage = pd.getPlace_img();
                           String pathImage_1 = "";  
                           PlaceImage pimage = pathImage.get(0);
                           pathImage_1 = "http://localhost:8080/"+request.getContextPath()+"/image/"+pimage.getImg_name();
                           System.out.println(pathImage_1);
                           
                        %>
                        <div class="show-pic-spon sponpic1" style="background-image: url('<%= pathImage_1 %>')">
                            
                        </div>
                        <div class="content-sponser">
                            <div class="owner_place"><b><%= pd.getOwner_name()%></b> Place ' s owner</div>
                            <div class="name_place"><%= pd.getPlace_name()%></div>
                            <div class="cost_place"><%= pd.getPrice_pday()%><span class="price_spon"> <b></b></span> per day</div>

                            <hr>
                            <a href="place.jsp?place_name=<%= pd.getPlace_name() %>"><button class="button-submit-2">See This!</button></a>
                        </div>
                    </div>
                </div>
                <% }
                    }%>



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