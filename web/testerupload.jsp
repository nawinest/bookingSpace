<%-- 
    Document   : testerupload
    Created on : Apr 21, 2018, 11:41:48 PM
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
        <h1>Hello World!</h1>
        <form action="Test" method="post" enctype="multipart/form-data">
            <input type="text" name="description" />
            <input type="file" name="file" />
            <input type="submit" />
        </form>
    </body>
</html>
