<%-- 
    Document   : login-error
    Created on : Apr 16, 2018, 6:45:12 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKSPACE.COM</title>
        <!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!--<link rel="stylesheet" type="text/css" href="css/place.css">-->
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit:100,200,400" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>
    <style>

        .success_del{
            height: 100vh;

        }
        h1{
            margin: 0;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -45%);
        }
    </style>
    <body>
        <%--<%@ include file="header-nav.jsp" %>--%>
        <div class="success_del">
            <h1>กรุณาตรวจเช็ครหัสผู้ใช้และรหัสผ่านอีกครั้ง<br> <span style="display:box;font-size: 0.75em;color: #e237a0;font-family: 'Kanit', sans-serif;">ระบบกำลังพาท่านไปยังหน้าเเรกของเว็บไซต์</span></h1>

        </div>



        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>
    <script>setTimeout(function () {
            window.location.href = 'login.jsp'
        }, 1000);</script>