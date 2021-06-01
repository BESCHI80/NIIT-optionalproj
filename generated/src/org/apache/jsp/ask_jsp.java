package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ask_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>Contact us</title>\n");
      out.write("   \n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("</head><body>\n");
      out.write("<div id=\"main_container\">\n");
      out.write("\t<div class=\"main_content\">\n");
      out.write("    \t<div id=\"header\">\n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("        <div class=\"top_center_box\"></div>\n");
      out.write("        <div class=\"center_box\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("            <div id=\"menu_tab\">                                     \n");
      out.write("                  <ul class=\"menu\">                                                                         \n");
      out.write("                         <li><a href=\"home.jsp\" class=\"nav\">Home</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         <li><a href=\"takequiz.jsp\" class=\"nav\">Take Quiz</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         \n");
      out.write("                         <li><a href=\"ask.jsp\" class=\"nav\">Ask Ques.</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t <li><a href=\"makequiz.jsp\" class=\"nav\">Make quiz</a></li>\n");
      out.write("\t\t\t\t\t\t <li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t <li><a href=\"contact.html\" class=\"nav\">Contact</a></li>\n");
      out.write("                         \t   <li class=\"divider\"></li> \n");
      out.write("                       \t<li><a href=\"register.jsp\" class=\"nav\">Register</a></li>\n");
      out.write("                         \t    \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("                    </ul>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div class=\"middle_box\">\n");
      out.write("            \t<div class=\"middle_box_text_content\">\n");
      out.write("                \t<div class=\"middle_box_title\"></div>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"left_content\">\n");
      out.write("            \t<div class=\"calendar_box\">\n");
      out.write("                \t<div class=\"calendar_box_content\">\n");
      out.write("                \t\t<h1>Contact Us</h1>\n");
      out.write("                        <img src=\"images/contact_icon.gif\" alt=\"\" title=\"\">\n");
      out.write("                        <p class=\"contact_info\">\n");
      out.write("<span class=\"orange\">Address:</span> H-109,a-block,chennai<br>\n");
      out.write("\n");
      out.write("<span class=\"orange\">Telephone:</span> 0123456789<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<span class=\"orange\">Email:</span> <a href=\"rishi.kumar91@facebook.com\">info@company.com</a><br>\n");
      out.write("                        </p>\n");
      out.write("                \t</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                  <div id=\"contact_form\">\n");
      out.write("                  \n");
      out.write("                   <h1>Ask Question</h1>\n");
      out.write("                   <form action=\"askq.jsp\">\n");
      out.write("                    <div class=\"form_row\">\n");
      out.write("                    \n");
      out.write("                    <label>Name:</label><input name=\"name\" class=\"contact_input\" type=\"text\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form_row\">\n");
      out.write("                    <label>Email:</label><input name=\"email\" class=\"contact_input\" type=\"text\">\n");
      out.write("                    </div>                    \n");
      out.write("                    \n");
      out.write("                     <div class=\"form_row\">\n");
      out.write("                    <label>Phone:</label><input name=\"phone\" class=\"contact_input\" type=\"text\">\n");
      out.write("                    </div>                   \n");
      out.write("                    \n");
      out.write("                    <div class=\"form_row\">\n");
      out.write("                    <label>Question:</label><textarea name=\"question\" class=\"contact_textarea\"></textarea>\n");
      out.write("                    </div> \n");
      out.write("                   \n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"read_more\" value=\"send\"/>      \n");
      out.write("\t\t\t\t\t</form>        \n");
      out.write("            \n");
      out.write("                </div>               \n");
      out.write("\n");
      out.write("            \n");
      out.write("            </div><!--end of left content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"right_content\">\n");
      out.write("            \n");
      out.write("         \n");
      out.write("                <h1>Our Clients</h1>\n");
      out.write("                \n");
      out.write("                <div class=\"project_box\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/clients_icon.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\n");
      out.write("                    <p>\n");
      out.write("<a href=\"https://www.javatpoint.com\">javatpoint.com</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"project_box\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/clients_icon.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\n");
      out.write("                    <p>\n");
      out.write("<a href=\"https://www.cstpoint.com/\">cstpoint.com</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end of right content-->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div> <!--end of center box-->\n");
      out.write("\t</div> <!--end of main content-->\n");
      out.write("</div> <!--end of main container-->\n");
      out.write("        \n");
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
