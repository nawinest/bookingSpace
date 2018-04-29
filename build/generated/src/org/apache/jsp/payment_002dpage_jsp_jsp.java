package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.PlaceData;

public final class payment_002dpage_jsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/booking-page.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Athiti|Jura|Quicksand|Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kanit:100,200,400\" rel=\"stylesheet\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- cdn font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.9/css/all.css\" integrity=\"sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- ///////delete it later -->\n");
      out.write("        <!-- scripted for  datepicker -->\n");
      out.write("        <link href=\"https://www.jqueryscript.net/css/jquerysctipttop.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.0.0/flatly/bootstrap.min.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-datetimepicker.min.css\">\n");
      out.write("    </head>\n");
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

            PlaceData pd_rs = (PlaceData) request.getAttribute("data_set");

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container content-wrap\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <h5>รายละเอียดการชำระเงิน</h5>\n");
      out.write("                            <div class=\"from-group\">\n");
      out.write("                                <span class=\"label\">ช่องทางการชำระเงิน</span>\n");
      out.write("                                <div class=\"pic-credit\">\n");
      out.write("                                    <img class=\"img-credit\" src=\"asset/web/credit.png\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"from-group\" style=\"margin-bottom: 1em;\">\n");
      out.write("                                <span class=\"label\">หมายเลขบัตรเครดิต/เดบิต</span>\n");
      out.write("                                <div class=\"input\">\n");
      out.write("                                    <input type=\"input\" class=\"form-control\" name=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"from-group\" style=\"margin-bottom: 1em;\">\n");
      out.write("                                <span class=\"label\">ชื่อบนบัตร</span>\n");
      out.write("                                <div class=\"input\">\n");
      out.write("                                    <input type=\"input\" class=\"form-control\" name=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    วันหมดอายุ\n");
      out.write("                                    <div class=\"input\">\n");
      out.write("                                        <input type=\"input\" class=\"form-control\" name=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    รหัส CVC/CVV\n");
      out.write("                                    <div class=\"input\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" name=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"warning-text\" style=\"font-weight: 200;font-size:0.8em;margin-top: 5px;color:red;\"> เมื่อกดจองเเล้วไม่สามารถของเงินคืนได้หากต้องการยกเลิกการจองได้</div>\n");
      out.write("                            <div class=\"fixed-bottom\">\n");
      out.write("                                <button type=\"submit\" class=\"book_button\"> Booking </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/booking.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAXS40rABuuIrWI7ks0h-1NxNTp7BReXbg&libraries=places&callback=initMap\" async defer></script>\n");
      out.write("<!-- scripted choosen-->\n");
      out.write("<!--<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>-->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.21.0/moment.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(function () {\n");
      out.write("        // $('#datetimepicker1').datetimepicker();\n");
      out.write("        $('#datetimepicker1').datetimepicker({\n");
      out.write("            format: 'YYYY/MM/DD',\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        $('#datetimepicker2').datetimepicker({\n");
      out.write("            format: 'YYYY/MM/DD',\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        $('#datetimepicker3').datetimepicker({\n");
      out.write("            format: 'YYYY/MM/DD',\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        $('#timepicker1').datetimepicker({\n");
      out.write("            format: 'HH:mm',\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        $('#timepicker2').datetimepicker({\n");
      out.write("            format: 'HH:mm',\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function show_disable() {\n");
      out.write("        alert(\"Sorry , this place not support in this booking type\");\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var _gaq = _gaq || [];\n");
      out.write("    _gaq.push(['_setAccount', 'UA-36251023-1']);\n");
      out.write("    _gaq.push(['_setDomainName', 'jqueryscript.net']);\n");
      out.write("    _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("    (function () {\n");
      out.write("        var ga = document.createElement('script');\n");
      out.write("        ga.type = 'text/javascript';\n");
      out.write("        ga.async = true;\n");
      out.write("        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("        var s = document.getElementsByTagName('script')[0];\n");
      out.write("        s.parentNode.insertBefore(ga, s);\n");
      out.write("    })();\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
