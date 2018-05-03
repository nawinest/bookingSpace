<%-- 
    Document   : login_admin.jsp
    Created on : Apr 30, 2018, 1:43:59 AM
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
        <link rel="stylesheet" type="text/css" href="css/stylelogin_provider.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>

    <body>
        <form action="login_admin.do" method="get">
        <div class="login-from-wrapper">
            <div class="login-bookspace">
                <div class="">Admin</div>
                <div class="form-login">
                    <div class="group">
                        <label for="user" class="label">Username</label>
                        <input id="user" type="text" name="username_input" class="input_username inputer">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Password</label>
                        <input id="pass" type="password" name="password_input" class="input_password inputer">
                    </div>
                    <div class="group">
                        <input type="submit" class="button_login" value="Sign In">
                    </div>
                </div>
            </div>
        </div>
        </form>Ï
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>

</html>
