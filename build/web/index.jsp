<%-- 
    Document   : index
    Created on : Apr 16, 2018, 1:52:10 PM
    Author     : mac
--%>

<%@page import="model.Place"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.PlaceImage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.PlaceData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKSPACE.COM</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/searchlistStyle.css">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>
    <body style="background: linear-gradient(-90deg, #e237a0, #3c1f55);">
        <%@ include file="header-nav.jsp" %>
        <!--<div class="separator-button"></div>-->
        <div class="header-content">
            <div class="container" style="text-align:center;">
                <!--                <h1 class="text-header" id="demo"></h1>
                                <p>- best place | best deal </p>-->
                <h1 style="font-size:3em;">บุ๊คสเปซ.คอม</h1>
                <p>คุณกำลังมองหาสถานที่เพื่อทำกิจกรรมใช่หรือใหม่ ?</p>
                <div class="bt-f">
                    <a href="search-list.jsp"><button class="button_submit"> <i class="fas fa-search"></i> ค้นหาสถานที่ </button>
                    </a>
                </div>
            </div>
        </div>
        <div class="_content">
            <div class="container section-show-sponser search-top">
                <div class="container">
                    <div class="section_sponser">
                        <div class="topic-sponser tp">
                            <h3 class="top-section"><i class="fas fa-fire"></i> The recomended place</h3>
                            <p class="th-text sub-menu" style="opacity: 0.7"> a best place where a most review point</p>
                        </div>
                    </div>
                </div>

                <div class="show-sponser">
                    <div class="row">
                        <%
                            ServletContext sc = getServletContext();
                            Connection conn = (Connection) sc.getAttribute("conn");
                            Place place = new Place(conn);
                            ArrayList<PlaceData> place_set = place.queryPlaceSponser();
                            for (PlaceData pd : place_set) {

                        %>
                        <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
                            <div class="show_sponser_1 spon">
                                <%  ArrayList<PlaceImage> pathImage = pd.getPlace_img();
                                    String pathImage_1 = "";
                                    PlaceImage pimage = pathImage.get(0);
//                                    pathImage_1 = "http://localhost:8080/" + request.getContextPath() +   "/image/" + pimage.getImg_name();
                                    pathImage_1 = "http://group20.tomcat.it.kmitl.ac.th//image/" + pimage.getImg_name();
                                    System.out.println(pathImage_1);

                                %>
                                <div class="show-pic-spon sponpic1" style="background-image: url('<%= pathImage_1%>')">

                                </div>
                                <div class="content-sponser">
                                    <div class="owner_place"><b><%= pd.getOwner_name()%></b> Place ' s owner</div>
                                    <div class="name_place"><%= pd.getPlace_name()%></div>
                                    <div class="address_place"><i class="fas fa-map-marker-alt"></i> <%= pd.getPlace_address()%></div>

                                    <div class="cost_place"><%= pd.getPrice_pday()%><span class="price_spon"> <b></b></span> per day</div>

                                    <hr>
                                    <a href="place_query.do?place_name=<%= pd.getPlace_name()%>"><button class="button-submit-2">See This!</button></a>
                                </div>
                            </div>
                        </div>
                        <% }%>
                    </div>
                </div>
            </div>
        </div>


        <!-- section about us -->
        <div class="about_us">
            <div class="container">
                <div class="topic-about-me tp">
                    <!-- <h3 class="top-section"> Who are we ?</h3> -->
                    <div class="content-us" style="padding:  2em;">
                        <div class="bg-white-t">
                            <div class="justify-content-center">
                                <img src="asset/web/logo.png" width="50%">
                            </div>
                            <div class="justify-content-center" style="font-weight: 300; padding: 1.25em;">
                                <div class="content-sub" width="50%">
                                    We are number one online marketplace for event venue covering different event types from seminar to party to support industry in Thailand. We have been growing very fast with our increasing number of users and partnered venues.We are number one online marketplace for event venue covering different event types from seminar to party to support MICE industry in Thailand. We have been growing very fast with our increasing number of users and partnered venues.
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- finish section about us -->


        <div class="footer-nw">
            <div class="sub-bg-footer">
                <div class="container">
                    <div class="col-12">
                        @CopyRight 2018 it_kmitl project
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>
</html>
