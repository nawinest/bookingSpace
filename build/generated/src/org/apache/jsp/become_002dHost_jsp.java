package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class become_002dHost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ลงสถานที่ของคุณ</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/becomehostPage.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kanit:100,400\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/searchlistStyle.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- cdn font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.9/css/all.css\" integrity=\"sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- ///////delete it later -->\n");
      out.write("    </head>\n");
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
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"topic-header\">\n");
      out.write("                    <div class=\"header-content-host\" style=\"text-align:center;\">\n");
      out.write("                        <hr> Become a Space provider with Bookspace.com\n");
      out.write("                        <!-- <p class=\"description\">\n");
      out.write("                            No matter where you are, we can give you the opportunity to generate revenue with you through our Web site. Let's start as a family.\n");
      out.write("                        </p> -->\n");
      out.write("                        <hr>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"margin-bottom: 40px;\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 content-5\">\n");
      out.write("                        <div class=\"top-img-wrap\">\n");
      out.write("                            <img class=\"top-img\" src=\"asset/web/g-info.png\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"description\" style=\"text-align: center;margin-top: 5px;\">\n");
      out.write("                            Become a Space provider with Bookspace.com\n");
      out.write("                            <br>มาเป็นครอบครอบเดียวกันกับเรา\n");
      out.write("                            <hr class=\"hr-b\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-wrap\">\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    ชื่อสถานที่ <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <input class=\"input-box\" type=\"text\" name=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    รายละเอียด <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <textarea class=\"input-box\" row=\"3\" name=\"des-place\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    ประเภทสถานที่ <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <div class=\"input-grouper\">\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"1\" id=\"1\"> Hotel\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"2\" id=\"2\"> Conference / Exhibition Hall\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"3\" id=\"3\"> Restaurant &amp; Cafe\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"4\" id=\"4\"> Bar\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"5\" id=\"5\"> Outdoor\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"6\" id=\"6\"> Meeting\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"7\" id=\"7\"> Theater\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"8\" id=\"8\"> Unique Venue\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"9\" id=\"9\"> Co-working space\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"10\" id=\"10\"> Gallery / Museum / Library\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"11\" id=\"11\"> Rooftop\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input type=\"checkbox\" name=\"SelectedVenueTypes\" value=\"12\" id=\"12\"> Others\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    ย่านของสถานที่ <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <select class=\"form-control valid\" name=\"AreaId\">\n");
      out.write("                                        <option value=\"\">--- Select Area ---</option>\n");
      out.write("                                        <option value=\"6\">Silom - Sathorn</option>\n");
      out.write("                                        <option value=\"7\">Rama 4 - Lumpini</option>\n");
      out.write("                                        <option value=\"8\">Chidlom - Ratchadamri</option>\n");
      out.write("                                        <option value=\"9\">Asoke - Phrom Phong</option>\n");
      out.write("                                        <option value=\"10\">Thonglor - Phra Khanong</option>\n");
      out.write("                                        <option value=\"11\">Phayathai - Sam Yan</option>\n");
      out.write("                                        <option value=\"12\">Ratchadaphisek - Huaykwang</option>\n");
      out.write("                                        <option value=\"13\">Phetchaburi - Rama 9</option>\n");
      out.write("                                        <option value=\"14\">Din Daeng - Ratchaprarop</option>\n");
      out.write("                                        <option value=\"15\">Ari - Mo Chit</option>\n");
      out.write("                                        <option value=\"16\">Vipavadee - Donmuang</option>\n");
      out.write("                                        <option value=\"17\">Ladprao</option>\n");
      out.write("                                        <option value=\"18\">Sisak - Prachachuen</option>\n");
      out.write("                                        <option value=\"19\">Ratchayothin - New Bridge</option>\n");
      out.write("                                        <option value=\"20\">Kaset - Nawamin</option>\n");
      out.write("                                        <option value=\"21\">Ngam Wong Wan - Chaengwattana</option>\n");
      out.write("                                        <option value=\"22\">Watcharapol - Sai Mai</option>\n");
      out.write("                                        <option value=\"23\">Ramindra - Suwinthawong</option>\n");
      out.write("                                        <option value=\"24\">Rangsit - Pathum Thani</option>\n");
      out.write("                                        <option value=\"25\">Rattanathibet - Bangyai</option>\n");
      out.write("                                        <option value=\"26\">Ladkrabang - Suvarnabhumi</option>\n");
      out.write("                                        <option value=\"27\">Bangna - Srinakarin</option>\n");
      out.write("                                        <option value=\"28\">Onnut - Punnawithi</option>\n");
      out.write("                                        <option value=\"29\">Udom Suk - Bearing</option>\n");
      out.write("                                        <option value=\"30\">Ramkhamhaeng - Bangkapi</option>\n");
      out.write("                                        <option value=\"31\">Samrong - Thepharak</option>\n");
      out.write("                                        <option value=\"32\">Charoenkrung - Rama 3</option>\n");
      out.write("                                        <option value=\"33\">Thonburi - Wongwian Yai</option>\n");
      out.write("                                        <option value=\"34\">Talat Phlu - Bang Wa</option>\n");
      out.write("                                        <option value=\"35\">Rama 2 - Ekachai</option>\n");
      out.write("                                        <option value=\"36\">Charansanitwong</option>\n");
      out.write("                                        <option value=\"37\">Ratchaphruek</option>\n");
      out.write("                                        <option value=\"38\">Bangbuathong - Kanchanaphisek</option>\n");
      out.write("                                        <option value=\"39\">Suksawat - Rat Burana</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    เบอร์โทรศัพท์ <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <input class=\"input-box\" type=\"text\" name=\"phone\">\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- map -->\n");
      out.write("                    <div class=\"col-md-6 content-5 bg-pink\">\n");
      out.write("                        <div class=\"top-img-wrap\">\n");
      out.write("                            <img class=\"top-img\" src=\"asset/web/l-info.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"description\" style=\"text-align: center;margin-top: 5px;\">\n");
      out.write("                            Become a Space provider with Bookspace.com\n");
      out.write("                            <br>มาเป็นครอบครอบเดียวกันกับเรา\n");
      out.write("                            <hr class=\"hr-b\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-wrap\">\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    ที่อยู่ <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <input class=\"input-box\" type=\"text\" name=\"location\">\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    จังหวัด <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <input class=\"input-box\" type=\"text\" name=\"province\">\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-grouper\">\n");
      out.write("                                <div class=\"label-input\">\n");
      out.write("                                    รหัสไปรษณีย์ <span class=\"important\">*</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <input class=\"input-box\" type=\"text\" name=\"postCode\">\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"hr-b\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"pick-map-wrap\">\n");
      out.write("                                <div class=\"input-grouper pick-map\">\n");
      out.write("                                    <div class=\"label-input\">\n");
      out.write("                                        ที่อยู่ <span class=\"important\">*</span>\n");
      out.write("                                        <br>\n");
      out.write("                                        <span class=\"description_map\">\n");
      out.write("                                            โปรดระบุชื่อสถานที่ของคุณ\n");
      out.write("                                            และปักหมุดที่สถานที่ของคุณให้ตรงกับสถานที่จริง\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input class=\"input-box ip2\" id=\"searchTextField\" type=\"text\">\n");
      out.write("                                    <div id=\"map_canvas\"></div>\n");
      out.write("                                    <div ng-controller=\"Ctrl\">\n");
      out.write("                                        <input class=\"input-box ip2\" id=\"lat\" type=\"text\" disabled=\"\" placeholder=\"คำนวณละติจูดอัตโนมัติ\" />\n");
      out.write("                                        <input class=\"input-box \" id=\"lng\" type=\"text\" disabled=\"\" placeholder=\"คำนวณลองติจูดอัตโนมัติ\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr class=\"hr-b\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button submit fixed-bottom\">\n");
      out.write("                <button class=\"button-submit\">Request for be a Host <i class=\"fas fa-angle-double-right\"></i></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/googleMapCustom.js\"></script>\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap\" async defer></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
