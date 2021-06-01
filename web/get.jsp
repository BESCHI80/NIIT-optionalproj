<%-- 
    Document   : get
    Created on : 21 May, 2021, 10:06:40 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*" language="java"%>
<%@page import="java.sql.*" %>
<%@page import="com.sun.org.apache.bcel.internal.generic.Select" %>
<!DOCTYPE html>
<%! static int count=0; %>
<%! static int count1=0; %>



<%
String name=(String)session.getAttribute("quizname");
try{


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","admin");
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
session.setAttribute("ans","null");
}
con.close();

}catch(Exception e){e.printStackTrace();}
//end of if
%>
<jsp:forward page="start.jsp"></jsp:forward>

