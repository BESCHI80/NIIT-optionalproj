<%-- 
    Document   : quizcontact
    Created on : 25 May, 2021, 11:06:27 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.util.*"%>
<%@page import="java.sql.*"%>

       



<%

 try {
 
String name= request.getParameter("name");
String email= request.getParameter("email");
String phone= request.getParameter("phone");
String message= request.getParameter("message");
 
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","admin");
PreparedStatement ps=con.prepareStatement("insert into quizcontact values(?,?,?,?)");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,phone);
ps.setString(4,message);

int s= ps.executeUpdate();


}
catch(Exception e){e.printStackTrace();}

%>

