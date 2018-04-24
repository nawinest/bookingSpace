<%-- 
    Document   : testQuery
    Created on : Apr 24, 2018, 3:28:04 PM
    Author     : mac
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="model.PlaceDescription"%>
<%@page import="java.sql.Connection"%>
<%@page import="controller.NewPlace"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        
        <% 
            String testString = request.getParameter("test");
            ServletContext sc = getServletContext();
            Connection conn = (Connection) sc.getAttribute("conn");
//            PlaceDescription pd = new PlaceDescription(conn);
            
            Statement st = conn.createStatement();
            String sql = "select * from place_picture where place_name = '"+testString+"'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                out.println(rs.getString("img_name")+"<br>");
                out.println(rs.getString("place_name")+"<br>");
            }
        %>
    </body>
</html>
