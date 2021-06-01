<%-- 
    Document   : findname3
    Created on : 21 May, 2021, 9:57:56 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.util.*"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>

<%
String n=request.getParameter("val");
session.setAttribute("quizname",n);
{
out.print("<font style='color:navy'><B>Quiz"+n+" containns 10 Question<br>Each question is of 1 point</B><br></font>");
out.print("<input type='submit' value='Start Quiz' />");

}
//end of if
%>
