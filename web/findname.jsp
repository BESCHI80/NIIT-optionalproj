<%-- 
    Document   : findname
    Created on : 21 May, 2021, 9:31:48 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<%
String n=request.getParameter("val");
{
try{

		Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","admin");
PreparedStatement ps=con.prepareStatement("select username from quizregister where username='"+n+"'");
ResultSet rs=ps.executeQuery();
while(rs.next()){
out.print("<font style='color:red'>Username already exist</font>");
}
con.close();
}catch(Exception e){e.printStackTrace();}
}//end oo if
%>

