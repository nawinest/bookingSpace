<%-- 
    Document   : become-Host
    Created on : Apr 16, 2018, 2:20:33 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ลงสถานที่ของคุณ</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/becomehostPage.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">

        <link href="https://fonts.googleapis.com/css?family=Kanit:100,400" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/searchlistStyle.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>
    <body>

        <%
            String checkIsProvider = (String) session.getAttribute("role");
            if (checkIsProvider != null) {
        %>
        <%@ include file="header-nav.jsp" %>
        <form action="newplace.do" method="post" enctype="multipart/form-data"">
            <div class="content">
                <div class="container">
                    <div class="topic-header">
                        <div class="header-content-host" style="text-align:center;">
                            <hr> Become a Space provider with Bookspace.com
                            <!-- <p class="description">
                                No matter where you are, we can give you the opportunity to generate revenue with you through our Web site. Let's start as a family.
                            </p> -->
                            <hr>
                        </div>
                    </div>
                </div>
                <div class="container" style="margin-bottom: 40px;">
                    <div class="row">
                        <div class="col-md-6 content-5">
                            <div class="top-img-wrap">
                                <img class="top-img" src="asset/web/g-info.png">
                            </div>
                            <div class="description" style="text-align: center;margin-top: 5px;">
                                Become a Space provider with Bookspace.com
                                <br>มาเป็นครอบครอบเดียวกันกับเรา
                                <hr class="hr-b">
                            </div>
                            <div class="input-wrap">
                                <div class="input-grouper">
                                    <div class="label-input">
                                        ชื่อสถานที่ <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <input class="input-box" type="text" name="place_name">
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                
                                <div class="input-grouper">
                                    <div class="label-input">
                                        รูปภาพสถานที่ (จำกัดแค่สองรูป) <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <input type="file" name="file" id="picture_place" multiple="true">
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                <div class="input-grouper">
                                    <div class="label-input">
                                        รายละเอียด <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <textarea class="input-box" row="3" name="place_description"></textarea>
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                <div class="input-grouper">
                                    <div class="label-input">
                                        จุดเด่นของสถานที่คุณ <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <textarea class="input-box" row="3" name="place_featured"></textarea>
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                <div class="input-grouper">
                                    <div class="label-input">
                                        ประเภทสถานที่ <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <div class="input-grouper">
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="1" id="1"> Hotel
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="2" id="2"> Conference / Exhibition Hall
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="3" id="3"> Restaurant &amp; Cafe
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="4" id="4"> Bar
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="5" id="5"> Outdoor
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="6" id="6"> Meeting
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="7" id="7"> Theater
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="8" id="8"> Unique Venue
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="9" id="9"> Co-working space
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="10" id="10"> Gallery / Museum / Library
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="11" id="11"> Rooftop
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="SelectedVenueTypes" value="12" id="12"> Others
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                <div class="input-grouper">
                                    <div class="label-input">
                                        ย่านของสถานที่ <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <select class="form-control valid" name="place_zone">
                                            <option value="">--- Select Area ---</option>
                                            <option value="Silom - Sathorn">Silom - Sathorn</option>
                                            <option value="Rama 4 - Lumpini">Rama 4 - Lumpini</option>
                                            <option value="Chidlom - Ratchadamri">Chidlom - Ratchadamri</option>
                                            <option value="Asoke - Phrom Phong">Asoke - Phrom Phong</option>
                                            <option value="Thonglor - Phra Khanong">Thonglor - Phra Khanong</option>
                                            <option value="Phayathai - Sam Yan">Phayathai - Sam Yan</option>
                                            <option value="Ratchadaphisek - Huaykwang">Ratchadaphisek - Huaykwang</option>
                                            <option value="Phetchaburi - Rama 9">Phetchaburi - Rama 9</option>
                                            <option value="Din Daeng - Ratchaprarop">Din Daeng - Ratchaprarop</option>
                                            <option value="Ari - Mo Chit">Ari - Mo Chit</option>
                                            <option value="Vipavadee - Donmuang">Vipavadee - Donmuang</option>
                                            <option value="Ladprao">Ladprao</option>
                                            <option value="Sisak - Prachachuen">Sisak - Prachachuen</option>
                                            <option value="Ratchayothin - New Bridge">Ratchayothin - New Bridge</option>
                                            <option value="Kaset - Nawamin">Kaset - Nawamin</option>
                                            <option value="Ngam Wong Wan - Chaengwattana">Ngam Wong Wan - Chaengwattana</option>
                                            <option value="Watcharapol - Sai Mai">Watcharapol - Sai Mai</option>
                                            <option value="Ramindra - Suwinthawong">Ramindra - Suwinthawong</option>
                                            <option value="Rangsit - Pathum Thani">Rangsit - Pathum Thani</option>
                                            <option value="Rattanathibet - Bangyai">Rattanathibet - Bangyai</option>
                                            <option value="Ladkrabang - Suvarnabhumi">Ladkrabang - Suvarnabhumi</option>
                                            <option value="Bangna - Srinakarin">Bangna - Srinakarin</option>
                                            <option value="Onnut - Punnawithi">Onnut - Punnawithi</option>
                                            <option value="Udom Suk - Bearing">Udom Suk - Bearing</option>
                                            <option value="Ramkhamhaeng - Bangkapi">Ramkhamhaeng - Bangkapi</option>
                                            <option value="Samrong - Thepharak">Samrong - Thepharak</option>
                                            <option value="Charoenkrung - Rama 3">Charoenkrung - Rama 3</option>
                                            <option value="Thonburi - Wongwian Yai">Thonburi - Wongwian Yai</option>
                                            <option value="Talat Phlu - Bang Wa">Talat Phlu - Bang Wa</option>
                                            <option value="Rama 2 - Ekachai">Rama 2 - Ekachai</option>
                                            <option value="Charansanitwong">Charansanitwong</option>
                                            <option value="Ratchaphruek">Ratchaphruek</option>
                                            <option value="Bangbuathong - Kanchanaphisek">Bangbuathong - Kanchanaphisek</option>
                                            <option value="Suksawat - Rat Burana">Suksawat - Rat Burana</option>
                                        </select>
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                <div class="input-grouper">
                                    <div class="label-input">
                                        เบอร์โทรศัพท์ <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <input class="input-box" type="text" name="phone">
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                <div class="input-grouper">
                                    <div class="label-input">
                                        อีเมล <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <input class="input-box" type="text" name="email">
                                    </div>
                                    <hr class="hr-b">
                                </div>
                                <div class="input-grouper">
                                    <div class="label-input">
                                        ราคาต่อชั่วโมง (หากไม่มีค่าบริการใส่ 0) <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <input class="input-box" type="text" name="price_phour">
                                    </div>
                                    <hr class="hr-b">
                                </div>
                            </div>
                        </div>
                        <!-- map -->
                        <div class="col-md-6 content-5 bg-pink">
                            <div class="top-img-wrap">
                                <img class="top-img" src="asset/web/l-info.jpg">
                            </div>
                            <div class="description" style="text-align: center;margin-top: 5px;">
                                Become a Space provider with Bookspace.com
                                <br>มาเป็นครอบครอบเดียวกันกับเรา
                                <hr class="hr-b">
                            </div>
                            <div class="input-wrap">
                                <div class="input-grouper">
                                    <div class="label-input">
                                        ที่อยู่ <span class="important">*</span>
                                    </div>
                                    <div class="">
                                        <input class="input-box" type="text" name="place_address" placeholder="ตัวอย่าง 69 ถนนรัชดาภิเษก แขวง ดินแดง เขต ดินแดง กรุงเทพมหานคร 10400">
                                    </div>
                                    <hr class="hr-b">
                                </div>
              
                                <div class="pick-map-wrap">
                                    <div class="input-grouper pick-map">
                                        <div class="label-input">
                                            ที่อยู่ <span class="important">*</span>
                                            <br>
                                            <span class="description_map">
                                                โปรดระบุชื่อสถานที่ของคุณ
                                                และปักหมุดที่สถานที่ของคุณให้ตรงกับสถานที่จริง
                                            </span>
                                        </div>
                                        <input class="input-box ip2" id="searchTextField" type="text">
                                        <div id="map_canvas"></div>
                                        <div ng-controller="Ctrl">
                                            <input class="input-box ip2" id="lat" type="text" name = "place_lat" disabled="" placeholder="คำนวณละติจูดอัตโนมัติ" />
                                            <input class="input-box " id="lng" type="text" disabled="" name="place_lng" placeholder="คำนวณลองติจูดอัตโนมัติ" />
                                        </div>
                                        <hr class="hr-b">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="button submit fixed-bottom">
                    <button class="button-submit">Request for be a Host <i class="fas fa-angle-double-right"></i></button>
                </div>
            </div>
        </form>
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
        <script type="text/javascript" src="js/googleMapCustom.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap" async defer></script>
    </body>
    <% } else {
            response.sendRedirect("error-loginbefore_pv.jsp");
        }%>
</html>
