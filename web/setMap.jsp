<%-- 
    Document   : setMap
    Created on : Apr 28, 2018, 12:15:41 AM
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
        <!--        <h1>Hello World!</h1>-->
    </body>
    <script>
        var marker;


        function initMap() {
            var map = new google.maps.Map(document.getElementById('map'), {
                zoom: 13,
                center: {lat: <%= pd_rs.getPlace_lat()%>, lng: <%= pd_rs.getPlace_lng()%>}
            });

            marker = new google.maps.Marker({
                map: map,
                icon: {
                    url: "asset/web/icon-map.png"
                },
                animation: google.maps.Animation.DROP,
                position: {lat: <%= pd_rs.getPlace_lat()%>, lng: <%= pd_rs.getPlace_lng()%>}
            });
            marker.addListener('click', toggleBounce);
        }

        function toggleBounce() {
            if (marker.getAnimation() !== null) {
                marker.setAnimation(null);
            } else {
                marker.setAnimation(google.maps.Animation.BOUNCE);
            }
        }
    </script>
</html>
