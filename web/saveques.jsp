<%-- 
    Document   : saveques
    Created on : 21 May, 2021, 9:50:00 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.util.*"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>

<%! static int counter=0; %>
<%
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
String descripition=request.getParameter("descripition");
PreparedStatement ps1=con.prepareStatement("select max(quizname) from quizinfo");
ResultSet rs=ps1.executeQuery();
while(rs.next()){
String quizname= rs.getString(1);

//System.out.print(quizname);

PreparedStatement ps=con.prepareStatement("insert into quizques values(?,?,?,?,?,?,?,?,?,?)");

ps.setString(1,ques);
ps.setString(2,opt1);
ps.setString(3,opt2);
ps.setString(4,opt3);
ps.setString(5,opt4);
ps.setString(6,ans);
ps.setString(7,quizname);
ps.setString(8,null);


ps.setString(9,descripition);
int s= ps.executeUpdate();


}

}
catch(Exception e){e.printStackTrace();}

%>
<% 
request.setAttribute("counter",counter);
%>
<jsp:forward page="createquiz1.jsp"></jsp:forward>


