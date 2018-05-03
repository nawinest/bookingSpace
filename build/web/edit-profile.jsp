<%-- 
    Document   : edit-profile
    Created on : Apr 16, 2018, 2:27:07 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> BOOKSPACE.COM </title>
        <link rel="stylesheet" type="text/css" href="css/edit-profile-page.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
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
                        <h4>แก้ไขโปรไฟล์</h4>
                        <div class="topper-topic" style="color: #e237a0;"></div>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="nav flex-column col-md-3" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                        <a class="nav-link custom-tab active" id="v-pills-profile-tab" data-toggle="pill" href="#v-pills-profile" role="tab" aria-controls="v-pills-profile" aria-selected="true">แก้ไขรายละเอียดโปรไฟล์</a>
                        
                    </div>
                    <div class="tab-content col-md-9" id="v-pills-tabContent">
                        <div class="tab-pane fade show active editprofile" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                            <div class="header-top">
                                <div class="top-hello">

                                </div>
                                แก้ไขโปรโฟล์
                                <hr>



                                <form action="update.do" method="post">
                                    <div class="from-wrap">
                                        <div class="form-group row">
                                            <label for="staticEmail" class="col-sm-2 col-form-label">ชื่อ</label>
                                            <div class="col-sm-10">
                                                <div class="form-control-plaintext" id="staticEmail"><%= session.getAttribute("name")%></div>
                                                <!--<div class="opa-1">ในส่วนของอีเมลของท่านไม่สามารถแก้ไขได้</div>-->
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
                                            <div class="col-sm-10">
                                                <div class="form-control-plaintext" id="staticEmail"> <%= session.getAttribute("email")%></div>
                                                <div class="opa-1">ในส่วนของอีเมลของท่านไม่สามารถแก้ไขได้</div>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="firstname" class="col-sm-2 col-form-label">ชื่อ</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="inputFirstname" name="fname" placeholder="FirstName">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="lastname" class="col-sm-2 col-form-label">นามสกุล</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="inputLastname" name="lname" placeholder="Last Name">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="phone" class="col-sm-2 col-form-label">เบอร์โทรศัพท์</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="inputLastname" name="phone" placeholder="Phone">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="b-wrap" id="btn-update">
                                        <input class="edit"  type="submit" name="" value="Edit">

                                    </div>
                                </form>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>


        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
       
        <!--<script type="text/javascript" src="js/edit-profile.js"></script>-->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
    </body>
</html>
