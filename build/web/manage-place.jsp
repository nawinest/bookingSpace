<%-- 
    Document   : manage-place
    Created on : Apr 21, 2018, 5:00:48 PM
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
                <div class="main-topic">
                    <h3>Manage your place</h3>
                    <hr>
                </div>
                <div class="show-place">
                    <table class="table"  style="border-radius: 10px;">
                        <thead class="thead-dark"">
                            <tr>
                                <th>ชื่อสถานที่</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>

                                <td>John</td>
                                <td>
                                    <a href="manage-booking.jsp"><button class="btn btn-primary">ดูการจอง</button></a>
                                    <a href="#"><button class="btn btn-warning">ลงโฆษณา</button></a>
                                </td>

                            </tr>

                        </tbody>
                    </table>
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
