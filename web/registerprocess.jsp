<%-- 
    Document   : registerprocess
    Created on : 21 May, 2021, 1:39:06 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.util.*"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%try{

String username=request.getParameter("username");
String userpass=request.getParameter("userpass");
String category=request.getParameter("category");
String email=request.getParameter("email");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","admin");
PreparedStatement ps=con.prepareStatement("insert into quizregister values(?,?,?,?)");

ps.setString(1,username);
ps.setString(2,userpass);
ps.setString(3,category);
ps.setString(4,email);
int s=ps.executeUpdate();
System.out.println(s);
}
catch(SQLException e)
{
e.printStackTrace();
}
%>
<jsp:forward page="index.jsp"></jsp:forward>

