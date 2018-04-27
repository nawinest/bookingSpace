package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.PlaceImage;
import java.sql.Connection;
import java.util.ArrayList;
import model.PlaceData;

public final class search_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header-nav.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/stylelogin.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kanit\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/searchlistStyle.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- cdn font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.9/css/all.css\" integrity=\"sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- ///////delete it later -->\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .button-submit:focus{\n");
      out.write("            outline:0;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String username = (String) session.getAttribute("username");
            String role = (String) session.getAttribute("role");
            if (username != "" && username != null && role == null) {
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-color\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"asset/web/logo.png\" width=\"100%\"></a>\n");
      out.write("                <ul class=\"nav justify-content-end\">\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button type=\"button\" class=\"nav-logged dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            สวัสดีคุณ : ");
      out.print(username);
      out.write(" <i class=\"fas fa-angle-double-down\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <h5 class=\"dropdown-header nav-logged\">เกี่ยวกับคุณ</h5>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"#\">ประวัติการจอง</a>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"edit-profile.jsp\">แก้ไขโปรไฟล์</a>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"logout.do\">ออกจากระบบ</a>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        ");
 } else if (username != "" && username != null && role.equals("provider")) {
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-color\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"asset/web/logo.png\" width=\"100%\"></a>\n");
      out.write("                <ul class=\"nav justify-content-end\">\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button type=\"button\" class=\"nav-logged dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            ผู้ให้บริการ : ");
      out.print(username);
      out.write(" <i class=\"fas fa-angle-double-down\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <h5 class=\"dropdown-header nav-logged\">เกี่ยวกับคุณ</h5>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"become-Host.jsp\">ลงสถานที่ของคุณ</a>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"manage-place.jsp\">จัดการสถานที่</a>\n");
      out.write("      \n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"edit-profile.jsp\">ลงโฆษณา</a>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"logout.do\">ออกจากระบบ</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-color\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"asset/web/logo.png\" width=\"100%\"></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li><a class=\"btn navbar-btn-login\" href=\"login.jsp\">เข้าสู่ระบบ / สมัครสมาชิก</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" width=\"100%\">\n");
      out.write("                <div class=\"toggle-btn\">\n");
      out.write("                    <div id=\"show-collapse\" data-toggle=\"collapse\" data-target=\"#multiCollapse\">\n");
      out.write("                        Search more <i class=\"fas fa-angle-double-down\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrap-list_page collapse\" id=\"multiCollapse\">\n");
      out.write("            <div class=\"container list_page\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"hero-search\">\n");
      out.write("                            <form name=\"from_search_place\" action=\"searchplace.do\" method=\"get\" onsubmit=\"return validateFormSearch()\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("\n");
      out.write("                                        <div>\n");
      out.write("                                            <span class=\"select-wrapper\">\n");
      out.write("                                                <select class=\"form-control no-radius\" name=\"search_objective\">\n");
      out.write("                                                    <option value=\"any\" selected=\"true\"> คุณต้องการทำกิจกรรมอะไร ? </option>\n");
      out.write("                                                    <option value=\"good_meeting\">ประชุม </option>\n");
      out.write("                                                    <option value=\"good_seminar\">สัมมนา </option>\n");
      out.write("                                                    <option value=\"good_workshop\">เวิร์คช็อป </option>\n");
      out.write("                                                    <option value=\"good_openproduct\">งานเปิดตัวสินค้า </option>\n");
      out.write("                                                    <option value=\"good_party\">ปาร์ตี้ </option>\n");
      out.write("                                                    <option value=\"good_photo\">ถ่ายภาพ / บันทึกภาพ </option>\n");
      out.write("                                                    <option value=\"good_concert\">มินิคอนเสิร์ต</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <select class=\"form-control no-radius\" name=\"search_zone\">\n");
      out.write("                                            <option value=\"%\">--- Select Area ---</option>\n");
      out.write("                                            <option value=\"Silom - Sathorn\">Silom - Sathorn</option>\n");
      out.write("                                            <option value=\"Rama 4 - Lumpini\">Rama 4 - Lumpini</option>\n");
      out.write("                                            <option value=\"Chidlom - Ratchadamri\">Chidlom - Ratchadamri</option>\n");
      out.write("                                            <option value=\"Asoke - Phrom Phong\">Asoke - Phrom Phong</option>\n");
      out.write("                                            <option value=\"Thonglor - Phra Khanong\">Thonglor - Phra Khanong</option>\n");
      out.write("                                            <option value=\"Phayathai - Sam Yan\">Phayathai - Sam Yan</option>\n");
      out.write("                                            <option value=\"Ratchadaphisek - Huaykwang\">Ratchadaphisek - Huaykwang</option>\n");
      out.write("                                            <option value=\"Phetchaburi - Rama 9\">Phetchaburi - Rama 9</option>\n");
      out.write("                                            <option value=\"Din Daeng - Ratchaprarop\">Din Daeng - Ratchaprarop</option>\n");
      out.write("                                            <option value=\"Ari - Mo Chit\">Ari - Mo Chit</option>\n");
      out.write("                                            <option value=\"Vipavadee - Donmuang\">Vipavadee - Donmuang</option>\n");
      out.write("                                            <option value=\"Ladprao\">Ladprao</option>\n");
      out.write("                                            <option value=\"Sisak - Prachachuen\">Sisak - Prachachuen</option>\n");
      out.write("                                            <option value=\"Ratchayothin - New Bridge\">Ratchayothin - New Bridge</option>\n");
      out.write("                                            <option value=\"Kaset - Nawamin\">Kaset - Nawamin</option>\n");
      out.write("                                            <option value=\"Ngam Wong Wan - Chaengwattana\">Ngam Wong Wan - Chaengwattana</option>\n");
      out.write("                                            <option value=\"Watcharapol - Sai Mai\">Watcharapol - Sai Mai</option>\n");
      out.write("                                            <option value=\"Ramindra - Suwinthawong\">Ramindra - Suwinthawong</option>\n");
      out.write("                                            <option value=\"Rangsit - Pathum Thani\">Rangsit - Pathum Thani</option>\n");
      out.write("                                            <option value=\"Rattanathibet - Bangyai\">Rattanathibet - Bangyai</option>\n");
      out.write("                                            <option value=\"Ladkrabang - Suvarnabhumi\">Ladkrabang - Suvarnabhumi</option>\n");
      out.write("                                            <option value=\"Bangna - Srinakarin\">Bangna - Srinakarin</option>\n");
      out.write("                                            <option value=\"Onnut - Punnawithi\">Onnut - Punnawithi</option>\n");
      out.write("                                            <option value=\"Udom Suk - Bearing\">Udom Suk - Bearing</option>\n");
      out.write("                                            <option value=\"Ramkhamhaeng - Bangkapi\">Ramkhamhaeng - Bangkapi</option>\n");
      out.write("                                            <option value=\"Samrong - Thepharak\">Samrong - Thepharak</option>\n");
      out.write("                                            <option value=\"Charoenkrung - Rama 3\">Charoenkrung - Rama 3</option>\n");
      out.write("                                            <option value=\"Thonburi - Wongwian Yai\">Thonburi - Wongwian Yai</option>\n");
      out.write("                                            <option value=\"Talat Phlu - Bang Wa\">Talat Phlu - Bang Wa</option>\n");
      out.write("                                            <option value=\"Rama 2 - Ekachai\">Rama 2 - Ekachai</option>\n");
      out.write("                                            <option value=\"Charansanitwong\">Charansanitwong</option>\n");
      out.write("                                            <option value=\"Ratchaphruek\">Ratchaphruek</option>\n");
      out.write("                                            <option value=\"Bangbuathong - Kanchanaphisek\">Bangbuathong - Kanchanaphisek</option>\n");
      out.write("                                            <option value=\"Suksawat - Rat Burana\">Suksawat - Rat Burana</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <div>\n");
      out.write("                                            <span class=\"select-wrapper\">\n");
      out.write("                                                <select class=\"form-control no-radius\" name=\"search_people\">\n");
      out.write("                                                    <option value=\"0\" selected=\"true\"> จำนวนคน </option>\n");
      out.write("                                                    <option value=\"0\">0-10 </option>\n");
      out.write("                                                    <option value=\"10\">10+ </option>\n");
      out.write("                                                    <option value=\"20\">20+ </option>\n");
      out.write("                                                    <option value=\"50\">50+ </option>\n");
      out.write("                                                    <option value=\"100\">100+ </option>\n");
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\" style=\"margin-top: 0.5em;\">\n");
      out.write("                                    <div class=\"col-md-3 align-self-end\" style=\"margin-bottom: -0.6em;\">\n");
      out.write("                                        <button class=\"button-submit\" type=\"summit\" value=\"\" name=\"\">FIND PLACE !</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12 bottom-hero\">\n");
      out.write("                    ต้องการลงพื้นที่ของท่าน\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- section tab content -->\n");
      out.write("        <div class=\"container nav-wrap\">\n");
      out.write("            <div class=\"navigator-tab\">\n");
      out.write("                <ul class=\"tabs\">\n");
      out.write("                    <li class=\"tab-link current\" data-tab=\"tab-1\">ดูแบบลิสต์</li>\n");
      out.write("                    <li class=\"tab-link\" data-tab=\"tab-2\">ดูผ่านแผนที่</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"tab-1\" class=\"container tab-content current\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");

                    if (request.getAttribute("searched") != null) {
                        ArrayList<PlaceData> list_forShow = (ArrayList<PlaceData>) request.getAttribute("place_all");
                        for (PlaceData pd : list_forShow) {

                
      out.write("\n");
      out.write("                <div class=\"col-sm-12 col-md-6 col-lg-4 col-xl-3\">\n");
      out.write("                    <div class=\"show_sponser_1 spon\">\n");
      out.write("                        ");
                         
                           ArrayList<PlaceImage> pathImage = pd.getPlace_img();
                           String pathImage_1 = "";  
                           PlaceImage pimage = pathImage.get(0);
                           pathImage_1 = "http://localhost:8080/"+request.getContextPath()+"/image/"+pimage.getImg_name();
                           System.out.println(pathImage_1);
                           
                        
      out.write("\n");
      out.write("                        <div class=\"show-pic-spon sponpic1\" style=\"background-image: url('");
      out.print( pathImage_1 );
      out.write("')\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"content-sponser\">\n");
      out.write("                            <div class=\"owner_place\"><b>");
      out.print( pd.getOwner_name());
      out.write("</b> Place ' s owner</div>\n");
      out.write("                            <div class=\"name_place\">");
      out.print( pd.getPlace_name());
      out.write("</div>\n");
      out.write("                            <div class=\"cost_place\">");
      out.print( pd.getPrice_pday());
      out.write("<span class=\"price_spon\"> <b></b></span> per day</div>\n");
      out.write("\n");
      out.write("                            <hr>\n");
      out.write("                            <a href=\"place_query.do?place_name=");
      out.print( pd.getPlace_name() );
      out.write("\"><button class=\"button-submit-2\">See This!</button></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
                    }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"tab-2\" class=\"container tab-content\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3875.810902355874!2d100.7771276152767!3d13.72989559036163!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x311d664988a1bedf%3A0xcc678f180e221cd0!2sKMITL!5e0!3m2!1sth!2sth!4v1522948810265\" width=\"100%\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- footer -->\n");
      out.write("        <div class=\"footer-nw\">\n");
      out.write("            <div class=\"sub-bg-footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <h5>\n");
      out.write("                            Contact Us\n");
      out.write("                        </h5>\n");
      out.write("                        <p style=\"font-size: 0.75rem\">\n");
      out.write("                            Email: 59070088@it.kmitl.ac.th\n");
      out.write("                            <br> Phone Number: +66970699888\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"sub-main\">\n");
      out.write("                            <button class=\"button-two\"><span>Become Partner</span></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
