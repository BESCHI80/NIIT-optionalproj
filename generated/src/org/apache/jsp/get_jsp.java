package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.sun.org.apache.bcel.internal.generic.Select;

public final class get_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 static int count=0; 
 static int count1=0; 
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String name=(String)session.getAttribute("quizname");
try{


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz?zeroDateTimeBehavior=convertToNull","root","admin");
if(count==0){
PreparedStatement ps1= con.prepareStatement("select min(qid) from quizques where quizname='"+name+"'");
PreparedStatement ps2= con.prepareStatement("select max(qid) from quizques where quizname='"+name+"'");
ResultSet rs1= ps1.executeQuery();
ResultSet rs2=ps2.executeQuery();
if(rs2.next()){
count1=rs2.getInt(1);
session.setAttribute("max",count1);
}
if(rs1.next()){
count=rs1.getInt(1);
session.setAttribute("min",count);

}
}
if(count>0){
PreparedStatement ps=con.prepareStatement("select * from quizques where quizname='"+name+"' and qid='"+count+"' ");
ResultSet rs=ps.executeQuery();
while(rs.next()){
String ques=rs.getString(1);
String opt1= rs.getString(2);
String opt2= rs.getString(3);
String opt3= rs.getString(4);
String opt4= rs.getString(5);
session.setAttribute("ques",ques);
session.setAttribute("opt1",opt1);
session.setAttribute("opt2",opt2);
session.setAttribute("opt3",opt3);
session.setAttribute("opt4",opt4);
}

}
System.out.print(count);
count++;
session.setAttribute("count",count);
if(count>(Integer)session.getAttribute("max")){
count=0;
session.setAttribute("ans",null);
}
con.close();

}catch(Exception e){e.printStackTrace();}
//end of if

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("start.jsp");
        return;
      }
      out.write('\n');
      out.write('\n');
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
