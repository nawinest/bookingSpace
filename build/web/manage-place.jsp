<%-- 
    Document   : manage-place
    Created on : Apr 21, 2018, 5:00:48 PM
    Author     : mac
--%>

<%@page import="java.util.List"%>
<%@page import="model.Place"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
                <div class="main-topic">
                    <h3>Manage your place</h3>
                    
                </div>
                <div class="show-place">
                    <div class="show_all_place">
                        <div class="place">
                            <%
                                ServletContext sc = getServletContext();
                                Connection conn = (Connection) sc.getAttribute("conn");
                                Place p = new Place(conn);
                                String owner_name = (String) session.getAttribute("owner");
                                List<String> rs_place_name = p.queryPlaceByNameProvider(owner_name);
                                for (String place_name : rs_place_name) {


                            %>
                            คุณ : <%=owner_name%>
                            <hr>
                            <div class="row one-of_books">
                                <div class="col-md-8">
                                    <div class="topic_s">ชื่อสถานที่</div>
                                    <div class="place_name">
                                        <%=place_name%>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <a href="manage-booking.jsp?place_name=<%=place_name%>">
                                        <div class="bt bt-booking" >ดูการจอง</div>
                                    </a>
                                    <a href="#">
                                        <div class="bt bt-ads">ลงโฆษณา</div>
                                    </a>
                                </div>
                            </div>
                            <hr>
                            <% }%>
                        </div>       
                    </div>
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
