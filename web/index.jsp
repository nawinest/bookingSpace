<%-- 
    Document   : index
    Created on : Apr 16, 2018, 1:52:10 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- cdn font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
        <!-- ///////delete it later -->
    </head>
    <body>
        <%@ include file="header-nav.jsp" %>
        <!--<div class="separator-button"></div>-->
        <div class="header-content">
            <div class="container">
                <h1 class="text-header" id="demo"></h1>
                <p>- best place | best deal </p>
            </div>
        </div>
        <div class="container">
            <div class="topic-search tp">
                <h3 class="top-section">Find your place</h3>
                <p class="th-text sub-menu" style="opacity: 0.7"> we will give you with a best place</p>
            </div>
            <div class="search-section">
                <div class="search-form">

                    <div class="bt-f">
                        <a href="search-list.jsp"><button class="button_submit"> <i class="fas fa-search"></i> EXPLORE </button>
                    </a>
                    </div>

                </div>
            </div>
        </div>
        <div class="section-show-sponser">
            <div class="container">
                <div class="section_sponser">
                    <div class="topic-sponser tp">
                        <h3 class="top-section"><i class="fas fa-fire"></i> The recomended place</h3>
                        <p class="th-text sub-menu" style="opacity: 0.7"> a best place where a most review point</p>
                    </div>
                </div>
            </div>
            <div class="container show-sponser">
                <div class="row">
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic1">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic1">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic1">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic1">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic2">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic2">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic2">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="show_sponser_1 spon">
                            <div class="show-pic-spon sponpic2">
                            </div>
                            <div class="content-sponser">
                                <div class="owner_place"><b>Nawin Phunsawat</b> Place ' s owner</div>
                                <div class="name_place">Novotel Bangkok Ploenchit Sukhumvit</div>
                                <div class="cost_place"><span class="price_spon"> <b>995 Bath</b></span> per hour</div>
                                <div class="review_place"><i class="far fa-thumbs-up font-aw"></i> 50 </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- section about us -->
        <div class="about_us">
            <div class="container">
                <div class="topic-about-me tp">
                    <!-- <h3 class="top-section"> Who are we ?</h3> -->
                    <div class="content-us" style="padding:  2em;">
                        <div class="bg-white-t">
                            <div class="justify-content-center">
                                <img src="asset/web/logo.png" width="50%">
                            </div>
                            <div class="justify-content-center" style="font-weight: 300; padding: 1.25em;">
                                <div class="content-sub" width="50%">
                                    We are number one online marketplace for event venue covering different event types from seminar to party to support MICE industry in Thailand. We have been growing very fast with our increasing number of users and partnered venues.We are number one online marketplace for event venue covering different event types from seminar to party to support MICE industry in Thailand. We have been growing very fast with our increasing number of users and partnered venues.
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- finish section about us -->
        <div class="footer-nw">
            <div class="sub-bg-footer">
                <div class="container">
                    <div class="col-12">
                        <h5>
                            Contact Us
                        </h5>
                        <p style="font-size: 0.75rem">
                            Email: 59070088@it.kmitl.ac.th
                            <br> Phone Number: +66970699888
                        </p>
                        <div class="sub-main">
                            <button class="button-two"><span>Become Partner</span></button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
    </body>
</html>
