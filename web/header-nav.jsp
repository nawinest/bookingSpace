<%-- 
    Document   : header-nav
    Created on : Apr 16, 2018, 2:09:54 PM
    Author     : mac
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <%
            String username = (String) session.getAttribute("username");
            String role = (String) session.getAttribute("role");
            if (username != "" && username != null && role == null) {%>
        <nav class="navbar navbar-expand-lg navbar-color">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><img src="asset/web/logo.png" width="100%"></a>
                <ul class="nav justify-content-end">
                    <div class="dropdown">
                        <button type="button" class="nav-logged dropdown-toggle" data-toggle="dropdown">
                            สวัสดีคุณ : <%=username%> <i class="fas fa-angle-double-down"></i>
                        </button>
                        <div class="dropdown-menu">
                            <h5 class="dropdown-header nav-logged">เกี่ยวกับคุณ</h5>
                            <a class="dropdown-item nav-logged" href="#">ประวัติการจอง</a>
                            <a class="dropdown-item nav-logged" href="edit-profile.jsp">แก้ไขโปรไฟล์</a>
                            <a class="dropdown-item nav-logged" href="logout.do">ออกจากระบบ์</a>
                            <hr>
                            <h5 class="dropdown-header nav-logged">สถานที่</h5>
                            <a class="dropdown-item nav-logged" href="#">ลงสถานที่ของคุณ</a>
                            <a class="dropdown-item nav-logged" href="#">จัดการสถานที่</a>
                        </div>
                    </div>
                </ul>
            </div>
        </nav>
        <% } else if (username != "" && username != null && role.equals("provider")) {%>
        <nav class="navbar navbar-expand-lg navbar-color">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><img src="asset/web/logo.png" width="100%"></a>
                <ul class="nav justify-content-end">
                    <div class="dropdown">
                        <button type="button" class="nav-logged dropdown-toggle" data-toggle="dropdown">
                            ผู้ให้บริการ : <%=username%> <i class="fas fa-angle-double-down"></i>
                        </button>
                        <div class="dropdown-menu">
                            <h5 class="dropdown-header nav-logged">เกี่ยวกับคุณ</h5>
                            <a class="dropdown-item nav-logged" href="#">ประวัติการจอง</a>
                            <a class="dropdown-item nav-logged" href="edit-profile.jsp">แก้ไขโปรไฟล์</a>
                            <a class="dropdown-item nav-logged" href="logout.do">ออกจากระบบ์</a>
                        </div>
                    </div>
                </ul>
            </div>
        </nav>
        <% } else { %>
        <nav class="navbar navbar-expand-lg navbar-color">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><img src="asset/web/logo.png" width="100%"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">

                    <ul class="navbar-nav ml-auto">
                        <li><a class="btn navbar-btn-login" href="login.jsp">เข้าสู่ระบบ / สมัครสมาชิก</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <% }%>

    </body>
</html>
