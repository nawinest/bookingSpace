package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Place;
import java.sql.Connection;
import model.PlaceImage;
import java.util.ArrayList;
import model.PlaceData;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>BOOKSPACE.COM</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kanit\" rel=\"stylesheet\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/searchlistStyle.css\">\n");
      out.write("        <!-- cdn font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.9/css/all.css\" integrity=\"sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- ///////delete it later -->\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: linear-gradient(-90deg, #e237a0, #3c1f55);\">\n");
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
      out.write("        <title>BOOKSPACE.COM</title>\n");
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
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"booking-history.jsp\">ประวัติการจอง</a>\n");
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
      out.write("        <!--<div class=\"separator-button\"></div>-->\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <div class=\"container\" style=\"text-align:center;\">\n");
      out.write("                <!--                <h1 class=\"text-header\" id=\"demo\"></h1>\n");
      out.write("                                <p>- best place | best deal </p>-->\n");
      out.write("                <h1 style=\"font-size:3em;\">บุ๊คสเปซ.คอม</h1>\n");
      out.write("                <p>คุณกำลังมองหาสถานที่เพื่อทำกิจกรรมใช่หรือใหม่ ?</p>\n");
      out.write("                <div class=\"bt-f\">\n");
      out.write("                    <a href=\"search-list.jsp\"><button class=\"button_submit\"> <i class=\"fas fa-search\"></i> ค้นหาสถานที่ </button>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"_content\">\n");
      out.write("            <div class=\"container section-show-sponser search-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"section_sponser\">\n");
      out.write("                        <div class=\"topic-sponser tp\">\n");
      out.write("                            <h3 class=\"top-section\"><i class=\"fas fa-fire\"></i> The recomended place</h3>\n");
      out.write("                            <p class=\"th-text sub-menu\" style=\"opacity: 0.7\"> a best place where a most review point</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"show-sponser\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");

                            ServletContext sc = getServletContext();
                            Connection conn = (Connection) sc.getAttribute("conn");
                            Place place = new Place(conn);
                            ArrayList<PlaceData> place_set = place.queryPlaceSponser();
                            for (PlaceData pd : place_set) {

                        
      out.write("\n");
      out.write("                        <div class=\"col-sm-12 col-md-6 col-lg-4 col-xl-3\">\n");
      out.write("                            <div class=\"show_sponser_1 spon\">\n");
      out.write("                                ");
  ArrayList<PlaceImage> pathImage = pd.getPlace_img();
                                    String pathImage_1 = "";
                                    PlaceImage pimage = pathImage.get(0);
//                                    pathImage_1 = "http://localhost:8080/" + request.getContextPath() +   "/image/" + pimage.getImg_name();
                                    pathImage_1 = "http://group20.tomcat.it.kmitl.ac.th//image/" + pimage.getImg_name();
                                    System.out.println(pathImage_1);

                                
      out.write("\n");
      out.write("                                <div class=\"show-pic-spon sponpic1\" style=\"background-image: url('");
      out.print( pathImage_1);
      out.write("')\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"content-sponser\">\n");
      out.write("                                    <div class=\"owner_place\"><b>");
      out.print( pd.getOwner_name());
      out.write("</b> Place ' s owner</div>\n");
      out.write("                                    <div class=\"name_place\">");
      out.print( pd.getPlace_name());
      out.write("</div>\n");
      out.write("                                    <div class=\"address_place\"><i class=\"fas fa-map-marker-alt\"></i> ");
      out.print( pd.getPlace_address());
      out.write("</div>\n");
      out.write("\n");
      out.write("                                    <div class=\"cost_place\">");
      out.print( pd.getPrice_pday());
      out.write("<span class=\"price_spon\"> <b></b></span> per day</div>\n");
      out.write("\n");
      out.write("                                    <hr>\n");
      out.write("                                    <a href=\"place_query.do?place_name=");
      out.print( pd.getPlace_name());
      out.write("\"><button class=\"button-submit-2\">See This!</button></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- section about us -->\n");
      out.write("        <div class=\"about_us\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"topic-about-me tp\">\n");
      out.write("                    <!-- <h3 class=\"top-section\"> Who are we ?</h3> -->\n");
      out.write("                    <div class=\"content-us\" style=\"padding:  2em;\">\n");
      out.write("                        <div class=\"bg-white-t\">\n");
      out.write("                            <div class=\"justify-content-center\">\n");
      out.write("                                <img src=\"asset/web/logo.png\" width=\"50%\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"justify-content-center\" style=\"font-weight: 300; padding: 1.25em;\">\n");
      out.write("                                <div class=\"content-sub\" width=\"50%\">\n");
      out.write("                                    We are number one online marketplace for event venue covering different event types from seminar to party to support industry in Thailand. We have been growing very fast with our increasing number of users and partnered venues.We are number one online marketplace for event venue covering different event types from seminar to party to support MICE industry in Thailand. We have been growing very fast with our increasing number of users and partnered venues.\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- finish section about us -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"footer-nw\">\n");
      out.write("            <div class=\"sub-bg-footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        @CopyRight 2018 it_kmitl project\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
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
