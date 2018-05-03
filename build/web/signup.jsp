<%-- 
    Document   : signupPage
    Created on : Apr 16, 2018, 2:16:55 PM
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
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>
    <body>
        <%@ include file="header-nav.jsp" %>
        <div class="login-from-wrapper">
            <div class="login-bookspace-signup">
                <div class="header-signup">
                    <!-- <img src="asset/web/icon-login.svg"> -->
                    <p class="top-header">
                        Sign up
                    </p>
                    <p class="opaseven"> register now for free!! </p>
                    <hr>
                </div>
                <div class="form-signup">
                    <form action="signup.do" method="POST">
                        <div class="group">
                            <label for="user" class="label">Username</label>
                            <input id="user" type="text" name="username" class="input_username inputer" placeholder="username ex. nawinpee">
                        </div>
                        <div class="group medium leftout">
                            <label for="password" class="label">password</label>
                            <input id="password" type="password" name="password" class="input_password inputer" placeholder=".....">
                        </div>
                        <div class="group medium rightout">
                            <label for="password" class="label">password again</label>
                            <input id="password" type="password" name="password2" class="input_password inputer" placeholder=".....">
                        </div>
                        <div class="clr"></div>
                        <hr>
                        <p class="opaseven"> We want to know you more.. </p>
                        <div class="group">
                            <label for="name" class="label">First Name</label>
                            <input id="name" type="text" name="fname" class="input_name inputer" placeholder="ex. Nawin">
                        </div>
                        <div class="group">
                            <label for="name" class="label">Last Name</label>
                            <input id="name" type="text" name="lname" class="input_name inputer" placeholder="ex. Poolsawat">
                        </div>
                        <div class="group">
                            <label for="email" class="label">Email</label>
                            <input id="email" type="text" name="email" class="input_email inputer" placeholder="ex. yourmail@domain.com">
                        </div>
                        <div class="group">
                            <label for="phone" class="label">Phone</label>
                            <input id="phone" type="text" name="phone" class="input_phone inputer" placeholder="ex. 0987654321">
                        </div>
                        <div class="group">
                            <button type="submit" class="button_signup" value="">Sign up</button>
                        </div>
                    </form>
                    <div class="label" style="text-align: center;margin-top: -0.45em;margin-bottom: 1.5em;">
                        Are you aready have an account ? <a href="login.jsp">click </a>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>
</html>
