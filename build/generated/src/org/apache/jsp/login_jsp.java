package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/css/login_2.css");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/stylelogin.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login_2.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kanit\" rel=\"stylesheet\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- cdn font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.9/css/all.css\" integrity=\"sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- ///////delete it later -->\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        ");
      out.write("/*\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("*/\n");
      out.write("/* \n");
      out.write("    Created on : Apr 21, 2018, 3:56:28 AM\n");
      out.write("    Author     : mac\n");
      out.write("*/\n");
      out.write("\n");
      out.write(".apl{\n");
      out.write("    color:red;\n");
      out.write("}");
      out.write("\n");
      out.write("    </style>\n");
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
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"logout.do\">ออกจากระบบ์</a>\n");
      out.write("                            <hr>\n");
      out.write("                            <h5 class=\"dropdown-header nav-logged\">สถานที่</h5>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"#\">ลงสถานที่ของคุณ</a>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"#\">จัดการสถานที่</a>\n");
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
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"#\">ประวัติการจอง</a>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"edit-profile.jsp\">แก้ไขโปรไฟล์</a>\n");
      out.write("                            <a class=\"dropdown-item nav-logged\" href=\"logout.do\">ออกจากระบบ์</a>\n");
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
      out.write("        <div class=\"login-from-wrapper\">\n");
      out.write("            <div class=\"login-bookspace\">\n");
      out.write("                <div class=\"header\">\n");
      out.write("                    <img src=\"asset/web/icon-login.svg\">\n");
      out.write("                </div>\n");
      out.write("                <form action=\"login.do\" method=\"POST\">\n");
      out.write("                    <div class=\"form-login\">\n");
      out.write("                        <div class=\"group\">\n");
      out.write("                            <label for=\"user\" class=\"label\">Username</label>\n");
      out.write("                            <input id=\"user\" type=\"text\"  name=\"username\" class=\"input_username inputer\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"group\">\n");
      out.write("                            <label for=\"pass\" class=\"label\" >Password</label>\n");
      out.write("                            <input id=\"pass\" type=\"text\"  name=\"password\" class=\"input_password inputer\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"group\">\n");
      out.write("                            <input type=\"submit\" class=\"button_login\" value=\"Sign In\">\n");
      out.write("                        </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"content-footer-from\">\n");
      out.write("                    If you don't have an account ? <a href=\"signup.jsp\">click</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content-footer-from\">\n");
      out.write("                    <button class=\"btn apl\" style=\"\"><a href=\"login_provider.jsp\"\">Login as Provider</a></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
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
