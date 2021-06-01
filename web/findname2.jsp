<%-- 
    Document   : findname2
    Created on : 21 May, 2021, 6:09:41 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<%
String n=request.getParameter("val");
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","admin");

PreparedStatement ps=con.prepareStatement("select * from quizinfo where subject like '"+n+"%'");
ps.setString(1,n);
out.print("<br>");
ResultSet rs=ps.executeQuery();

out.print("<table border='3' cellspacing=3 cellpadding=2 id='myTable'>");
out.print("<tr><td><B>Quizs</B></td><td><B>Subject</B></td></tr>");
while(rs.next()){
out.print("<tr><td><a href='#' name='"+rs.getString(2)+"' onclick='javascript:viewAll(this.name)'>Quiz"+rs.getString(2)+"</a></td>");
out.print("<td>"+rs.getString(1)+"</td>");
out.print("</tr>");
}
out.print("</table>");
con.close();
}catch(Exception e){e.printStackTrace();}
}//end of if
%>

