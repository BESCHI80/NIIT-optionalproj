<%-- 
    Document   : createquiz
    Created on : 21 May, 2021, 9:38:58 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<% try {
String subject= request.getParameter("subject");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","admin");
PreparedStatement ps=con.prepareStatement("insert into quizinfo(subectj) values('"+subject+"') " );
int s= ps.executeUpdate();

 }
catch(Exception e)
{
    e.printStackTrace();
}
%>

<jsp:forward page="createquiz1.jsp"></jsp:forward>
