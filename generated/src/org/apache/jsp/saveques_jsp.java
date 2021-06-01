package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class saveques_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 static int counter=0; 
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write('\n');

counter++;
 try {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","admin");
String ques= request.getParameter("ques");
String opt1= request.getParameter("opt1");
String opt2= request.getParameter("opt2");
String opt3= request.getParameter("opt3");
String opt4= request.getParameter("opt4");
String ans=request.getParameter("ans");
String description=request.getParameter("description");
PreparedStatement ps1=con.prepareStatement("select max(quizname) from quizinfo");
ResultSet rs=ps1.executeQuery();
while(rs.next()){
String quizname= rs.getString(1);

//System.out.print(quizname);

PreparedStatement ps=con.prepareStatement("insert into quizques values(?,?,?,?,?,?,?,?,?,?)");
ps.setString(1,null);
ps.setString(2,ques);
ps.setString(3,opt1);
ps.setString(4,opt2);
ps.setString(5,opt3);
ps.setString(6,opt4);
ps.setString(7,ans);
ps.setString(8,quizname);

ps.setString(9,description);
int s= ps.executeUpdate();


}

}
catch(Exception e){e.printStackTrace();}


      out.write('\n');
 
request.setAttribute("counter",counter);

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("createquiz1.jsp");
        return;
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
