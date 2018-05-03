<%-- 
    Document   : signup-provider
    Created on : Apr 20, 2018, 8:15:43 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKSPACE.COM</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/stylelogin.css">
        <link rel="stylesheet" type="text/css" href="css/signup-provider.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>

    <body>
        <%@ include file="header-nav.jsp" %>
        <div class="form container">
            <div class="login-bookspace-signup">
                <div class="header-signup">
                    <!-- <img src="asset/web/icon-login.svg"> -->
                    <p class="top-header">
                        Be a provider
                    </p>
                    <p class="opaseven"> register now for free!! and wait for approve</p>
                    <hr>
                </div>
                <form action="signup-provider.do" method="post">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="grousp">
                                <label for="user" class="label" >Username</label>
                                <input id="user" type="text" class="input-signup" name="username">
                            </div>
                            <div class="group medium leftout">
                                <label for="password" class="label">password</label>
                                <input id="password" type="password" class="input-signup" placeholder="....." name="password">
                            </div>
                            <div class="group medium rightout">
                                <label for="password" class="label">password again</label>
                                <input id="password" type="password" class="input-signup" placeholder="....." name="password2">
                            </div>
                            <div class="grousp">
                                <label for="id-card" class="label">ID Card Number</label>
                                <input id="id-card" type="text" class="input-signup" name="idCard">
                            </div>
                            <div class="grousp">
                                <label for="Phone Number" class="label">Phone Number</label>
                                <input id="Phone Number" type="text" class="input-signup" name="phone">
                            </div>

                        </div>
                        <div class="col-md-6">
                            <div class="grousp">
                                <label for="Address" class="label">Address</label>
                                <textarea class="input-signup" cols="4" name="address"></textarea>
                            </div>
                            <div class="grousp">
                                <label for="Owner's place" class="label">Owner's name</label>
                                <input id="" type="text" class="input-signup" name="owner">
                            </div>
                            
                            <div class="grousp last">
                                <label for="email" class="label"> E-mail address</label>
                                <input id="" type="text" class="input-signup" name="email">
                            </div
                            
                        </div>
                    </div>
                    <div class="button submit fixed-bottom">
                        <button class="button-submit">Request for be a Host <i class="fas fa-angle-double-right"></i></button>
                    </div>
                </form>
            </div>
        </div>
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>

</html>
