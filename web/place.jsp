<%-- 
Document   : place
Created on : Apr 16, 2018, 2:28:22 PM
Author     : mac
--%>

<%@page import="model.CommentData"%>
<%@page import="model.Comment"%>
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

        <% PlaceData pd_rs = (PlaceData) request.getAttribute("data_set");
            System.out.println(pd_rs);
        %>
        <div class="container content-wrap">
            <div class="content">
                <div class="pic-place">
                    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel" data-interval="false">
                        <div class="carousel-inner content-pic">
                            <% ArrayList<PlaceImage> place_img = pd_rs.getPlace_img();
                                for (int i = 0; i < place_img.size(); i++) {
                                    String act = "";
                                    if (i == 0) {
                                        act = "active";
                                    }
                            %>
                            <div class="carousel-item <%= act%>">
                                <!--<img class="d-block w-100" src="<%= "http://localhost:8080/" + request.getContextPath() + "/image/" + place_img.get(i).getImg_name()%>" alt="">-->
                                <img class="d-block w-100" src="<%= "http://group20.tomcat.it.kmitl.ac.th//image/" + place_img.get(i).getImg_name()%>" alt="">
                            </div>

                            <% }%>
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
                                    <span class="district-place"> <%= pd_rs.getPlace_address()%> </span>
                                    <h2><%= pd_rs.getPlace_name()%></h2>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div>Status <span class="status <%= pd_rs.getPlace_status() + "_cl"%>"> <%= pd_rs.getPlace_status()%> </span></div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> รายละเอียดของสถานที่ </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="short-descript-place">
                                                <%= pd_rs.getPlace_description()%>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> จุดเด่นของสถานที่ </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="short-descript-place">
                                                <%= pd_rs.getPlace_featured()%>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <hr>
                            <!--                            <div class="row">
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
                                                        </div>-->
                            <!--<hr>-->
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
                                            <div class="size"><%= pd_rs.getStand_capacity()%></div>
                                        </div>
                                        <div class="col-sm-3 capacity-info">
                                            <div class="icon banquat-icon" width="40px" height="40px" data-toggle="tooltip" data-placement="top" title="โต๊ะกลมงานเลี้ยง"><span class=""></span></div>
                                            <div class="size"><%= pd_rs.getBanquat_capacity()%></div>
                                        </div>
                                        <div class="col-sm-3 capacity-info">
                                            <div class="icon theator-icon" width="40px" height="40px" data-toggle="tooltip" data-placement="top" title="Theator"><span class=""></span></div>
                                            <div class="size"><%= pd_rs.getMeeting_capacity()%></div>
                                        </div>
                                        <div class="col-sm-3 capacity-info">
                                            <div class="icon board-icon" width="40px" height="40px" data-toggle="tooltip" data-placement="top" title="บอร์ดการประชุม"><span class=""></span></div>
                                            <div class="size"><%= pd_rs.getSit_capacity()%></div>
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
                                            <form action="comment.do" method="post">
                                                <div class="form-group no-margin-bottom">
                                                    <textarea class="form-control" rows="5" name="comment_description" id="comment" placeholder="กรุณาแสดงความคิดเห็นอย่างสุภาพ"></textarea>
                                                </div>
                                                <input type="hidden" name ="place_name" value="<%= pd_rs.getPlace_name()%>">
                                                <!--<div class="comment-button">Comment !</div>-->
                                                <button class="comment-button" type="submit">แสดงความคิดเห็น </button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="label-des"> ความคิดจากสมาชิก </div>
                                    <%
                                        ServletContext sc = getServletContext();
                                        Connection conn = (Connection) sc.getAttribute("conn");
                                        Comment cd = new Comment(conn);
                                        ArrayList<CommentData> cd_set = cd.queryAllCommentOfPlace(pd_rs.getPlace_name());
                                        for (CommentData comment_data : cd_set){
                                    %>
                                    <div class="row comment-wrap">
                                        <div class="col-sm-10">
                                            <h6 class="name_user"><%= comment_data.getName() %></h6>
                                            <p class="comment">โพสตเมื่อ <%= comment_data.getTimecomment() %></p>
                                            <p class="comment" style='font-size:0.9em;'><%= comment_data.getComment_description() %></p>
                                            <hr>
                                        </div>
                                    </div>
                                    
                                    <%}%>


                                </div>
                            </div>
                            <hr>
                        </div>
                        <!-- for booking tab -->
                        <div class="col-md-4">
                            <div class="booking">
                                <div class="booking-in">
                                    


                                    <a href="createbooking_page.do?place_name=<%= pd_rs.getPlace_name()%>">
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
        <a href="createbooking_page.do?place_name=<%=  pd_rs.getPlace_name()%>">
            <button class="booking-button-buttom">จองพื้นที่
                <br><i class="fas fa-angle-double-right"></i></button>
        </a>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript" src="js/place.js"></script>
    <%@include file="setMap.jsp" %>

    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
</body>
</html>
