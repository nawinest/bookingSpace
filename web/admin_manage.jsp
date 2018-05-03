<%-- 
    Document   : admin_manage.jsp
    Created on : Apr 30, 2018, 2:00:32 AM
    Author     : mac
--%>

<%@page import="model.AdsDescription"%>
<%@page import="model.AdsvertiseData"%>
<%@page import="model.ProviderData"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Provider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>BOOKSPACE.COM</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/place.css">
        <link rel="stylesheet" type="text/css" href="css/admin.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit:100,200,400" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>

    <body>
        <%
            ServletContext sc = getServletContext();
            Connection conn = (Connection) sc.getAttribute("conn");
            
            if ((session.getAttribute("name")) == null) {
                response.sendRedirect("error.jsp");
            }
            Provider pv = new Provider(conn);
            ArrayList<ProviderData> array_pv = pv.queryProviderForAdmin();
            
            AdsvertiseData adver_data = new AdsvertiseData(conn);
            ArrayList<AdsDescription> ads_set = adver_data.queryAdsAll();


        %>
        <div class="topnav" style="text-align: center;color: white;">
            สวัสดีแอดมิน : <%= session.getAttribute("name")%>
        </div>
        <div class="container content-wrap">
            <div class="content">
                <div class="buttom-wrap">
                    <a href="logout.do"><button class="button-signout btn-warning"> ออกจากระบบ </button></a>
                    <a href="#ads"><button class="button-signout btn-warning"> จัดการโฆษณา </button></a>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class=""><h2>จัดการผู้ให้บริการ</h2></div>
                        <div class="des"> หน้าจัดการสมาชิกสามารถยืนยันตัวผู้ให้บริการได้</div>

                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">รหัสผู้ใช้</th>
                                    <th scope="col">ชื่อ</th>
                                    <th scope="col">รหัสบัตรประชาชน</th>
                                    <th scope="col">เบอร์โทร</th>
                                    <th scope="col">สถานะ</th>
                                    <th scope="col">ลบสมาชิก</th>
                                </tr>
                            </thead>
                            <%

                            %>
                            <tbody>
                                <% for (ProviderData pv_data : array_pv) {%>
                                <tr>
                                    <th scope="row"><%= pv_data.getUsername()%></th>
                                    <td><%= pv_data.getOwner()%></td>
                                    <td><%= pv_data.getIdCard()%></td>
                                    <td><%= pv_data.getPhone()%></td>
                                    <td><%= pv_data.getProvider_status()%></td>
                                    <td><% if (pv_data.getProvider_status().equals("not_approve")) {%>
                                        <a href="update_status_provider.do?username=<%= pv_data.getUsername()%>">คลิกเพื่อรับรอง</a>
                                        <% } else {%>  
                                        ยืนยันตัวตนแล้ว
                                        <%}%></td>
                                </tr>
                                <% } %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!--section edit ads-->
        <div class="container content-wrap" id="ads">
            <div class="content">
                <!--<div class="buttom-wrap">-->
<!--                    <a href="logout.do"><button class="button-signout btn-warning"> ออกจากระบบ </button></a>
                </div>-->
                <div class="row">
                    <div class="col-md-12">
                        <div class=""><h2>จัดการโฆษณา</h2></div>
                        <div class="des"> จัดการโฆษณาที่ผู้ให้บริการต้องการลง</div>

                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">ชื่อสถานที่</th>
                                    <th scope="col">เวลาที่ขอลง</th>
                                    <th scope="col">รหัสผู้ใช้เจ้าของสถานที่</th>
                                    <th scope="col">วันที่เริ่มต้นและสิ้นสุดโฆษณา</th>
                                    <th scope="col">ราคารวม</th>
                                    <th scope="col">สถานะ</th>
                                    <th scope="col">อัพเดตสถานะ</th>
                                </tr>
                            </thead>
                            <%

                            %>
                            <tbody>
                                <% for (AdsDescription ads : ads_set) {%>
                                <tr>
                                    <th scope="row"><%= ads.getPlace_name() %></th>
                                    <td><%= ads.getTime_purchase() %></td>
                                    <td><%= ads.getProvider_username() %></td>
                                    <td><%= ads.getDate_activate() %> , <%= ads.getDate_expire() %></td>
                                    <td><%= ads.getCost_amount() %></td>
                                    <td><%= ads.getStatus_ads() %></td>
                                    <td>
                                        <a href="update_status_ads.do?id=<%= ads.getId() %>&status_ads=<%= ads.getStatus_ads() %>">คลิกเพื่อเปลี่ยนสถานะ</a>
                                    </td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript" src="js/place.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
</body>

</html>
