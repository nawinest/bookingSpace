<%-- 
    Document   : showimage
    Created on : Apr 22, 2018, 3:18:50 AM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="${pageContext.request.contextPath}/images?username=hello">
        <img src="${pageContext.request.contextPath}/images?data:image/jpeg;base64,${imgBase}" />
    </body>
</html>
