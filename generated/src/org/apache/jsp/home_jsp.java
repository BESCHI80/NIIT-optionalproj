package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');
      out.write('\n');

String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");


      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write('\n');

}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"left_content\">\n");
      out.write("             ");
 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					
      out.write("\n");
      out.write("\t\t\t\t");
 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' >");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					
      out.write("\n");
      out.write("\t\t\t\t\t");

					if(request.getAttribute("finished")!=null){
					   out.print("<font size='2' color='navy'>");
                   out.print("<B>");
					out.print(request.getAttribute("finished"));
					  out.print("<B>");
   						out.print("</font>");
					}
				if(request.getAttribute("category")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("category"));
					out.print("</font>");
					}
				
					
      out.write("\n");
      out.write("            \t<div class=\"calendar_box\">\n");
      out.write("            \t\n");
      out.write("                \t<div class=\"calendar_box_content\">\n");
      out.write("               \n");
      out.write("                \t\t<h1>Welcome to my Site</h1>\n");
      out.write("                \t\t              \t\t<marquee direction=\"left\" style=\"color: navy;\" onmouseover=\"stop()\" onmouseout=\"start()\"><B>Assess Yourself by taking quizs on various subjects</B></marquee>\n");
      out.write("                \t<p>\n");
      out.write("                \t<font style=\"color: navy;\">Now Teacher and Student can work together<br> \n");
      out.write("                \t\t\t\t\t\t\tonline.Tutors are most welcomed to my site <br>\n");
      out.write("                \t\t\t\t\t\t\t   they can create Quiz simply by clicking Make<br>  \n");
      out.write("                \t\t\t\t\t\t\t    Quiz link.And Students can appear in quiz based on various\n");
      out.write("                \t\t\t\t\t\t\t   subject. </font>\n");
      out.write("                \t</p>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("                     \n");
      out.write("                \t</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"news_left\">\n");
      out.write("                <h1>Latest News</h1>\n");
      out.write("                \t<div class=\"news_box\">\n");
      out.write("                    \t<div class=\"calendar\">1</div>\n");
      out.write("                        <div class=\"news_content\">\n");
      out.write("\t\t\t\t\t\t<p><span></span>\n");
      out.write("\t\t\t\t\t\tnow learn  how to develop android application free of cost</p><br>\n");
      out.write("                        <a href=\"www.javatpoint.com\" class=\"read_more\">read more</a>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                \t<div class=\"news_box\">\n");
      out.write("                    \t<div class=\"calendar\">2</div>\n");
      out.write("                        <div class=\"news_content\">\n");
      out.write("\t\t\t\t\t\t<p><span></span>\n");
      out.write("\t\t\t\t\t\twe have latest projects uploaded on my site</p>\n");
      out.write("                        <a href=\"www.cstpoint.com\" class=\"read_more\">read more</a>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <!--end of left content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"right_content\">\n");
      out.write("            \n");
      out.write("         \n");
      out.write("                <h1>Latest Projects</h1>\n");
      out.write("                \n");
      out.write("                <div class=\"project_box\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/p1.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\n");
      out.write("                    <p>\n");
      out.write("                    <span> Description:</span><br>\n");
      out.write("                    Payment billing System\n");
      out.write("                    Online Quiz<br>\n");
      out.write("                    Matrimonial\n");
      out.write("                    \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"project_box\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/p2.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\n");
      out.write("                    <p>\n");
      out.write("                    <span> Description:</span><br>\n");
      out.write("                    \n");
      out.write("                  \t\tGmail Account<br>\n");
      out.write("                  \t\tLatest Quiz\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div>\n");
      out.write("                \n");
      out.write("              <h1 ><br>Our main Services</h1>          \n");
      out.write(" </div>                   \n");
      out.write("                  <div class=\"services\">\n");
      out.write("                    <ul>                                        \n");
      out.write("                       <li><a href=\"www.javatpoint.com\">Java tutorial</a></li>\n");
      out.write("                       <li><a href=\"www.cstpoint.com\">CSE tutorial</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"services\">\n");
      out.write("                    <ul>                                        \n");
      out.write("                       <li><a href=\"www.javatpoint.com\">Java tutorial</a></li>\n");
      out.write("                       <li><a href=\"www.cstpoint.com\">CSE tutorial</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>  \n");
      out.write("                   \n");
      out.write("            \n");
      out.write("            </div><!--end of right content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div> <!--end of center box-->\n");
      out.write("\t</div> <!--end of main content-->\n");
      out.write("</div> <!--end of main container-->\n");
      out.write("        \n");
      out.write("        \n");
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
