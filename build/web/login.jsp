<%-- 
    Document   : login.jsp
    Created on : Apr 16, 2018, 2:12:57 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKSPACE.COM</title>
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="css/stylelogin.css"/>
       
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>
    <style>
        <%@include file="css/login_2.css"%>
    </style>
    <body>
        <%@ include file="header-nav.jsp" %>
        <div class="login-from-wrapper">
            <div class="login-bookspace">
                <div class="header">
                    <img src="asset/web/icon-login.svg">
                </div>
                <form action="login.do" method="POST">
                    <div class="form-login">
                        <div class="group">
                            <label for="user" class="label">Username</label>
                            <input id="user" type="text"  name="username" class="input_username inputer">
                        </div>
                        <div class="group">
                            <label for="pass" class="label" >Password</label>
                            <input id="pass" type="password"  name="password" class="input_password inputer">
                        </div>
                        <div class="group">
                            <input type="submit" class="button_login" value="Sign In">
                        </div>
                    </div>
                </form>
                <div class="content-footer-from">
                    If you don't have an account ? <a href="signup.jsp">click</a>
                </div>

                <div class="content-footer-from">
                    <button class="btn-login_2" style=""><a href="login_provider.jsp"">Login as Provider <i class="fas fa-angle-right"></i></a></button>
                </div>

            </div>
        </div>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
</body>
</html>
