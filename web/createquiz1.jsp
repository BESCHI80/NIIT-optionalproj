<%-- 
    Document   : createquiz1
    Created on : 21 May, 2021, 9:41:21 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.awt.Dialog"%><jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<%
String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");

%>
<jsp:forward page="index.jsp"></jsp:forward>
<%
}
%>

             <% 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					%>
				<% 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' >");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					%>
					 <% 
					 	if(request.getAttribute("counter")!=null){
                   Integer i=(Integer)request.getAttribute("counter");
                  		 if(i==10){
   								request.setAttribute("finished","quiz successfully submitted");
   			
   					%>
   				          <jsp:forward page="home.jsp"></jsp:forward>
   							          <% 
   							             
                   }}
                  %>
                  <div class="left_content">
                  
            	<div class="calendar_box2">
            	
                	<div class="calendar_box_content">
               
                		<h1>Welcome to my Site</h1>
     <marquee direction="left" style="color: navy;" onmouseover="stop()" onmouseout="start()"><B>Assess Yourself by taking quizs on various subject</B></marquee>
                		   
                		<form method="post" action="saveques.jsp" >
					<table>
					<tr><td>Question:</td><td><textarea rows="3" cols="" name="ques" ></textarea></td></tr>
					<tr><td>Option1:</td><td><input type="text" name="opt1" /></td></tr>	
					<tr><td>Option2:</td><td><input type="text" name="opt2" /></td></tr>
					<tr><td>Option3:</td><td><input type="text" name="opt3" /></td></tr>
					<tr><td>Option4:</td><td><input type="text" name="opt4" /></td></tr>
					<tr><td>Answer:</td><td><input type="text" name="ans" /></td></tr>	
					<tr><td>Description:</td><td><input type="text" name="descripition" /></td></tr>			
                    <tr><td></td><td><input type="submit" value="Next"></td></tr>
                    </table>
                     </form>
                    
					

                    
                	</div>
                </div>
                
                
                <div class="news_left">
                <h1>Latest News</h1>
                	<div class="news_box">
                    	<div class="calendar">23</div>
                        <div class="news_content">
						<p><span></span>
						now learn  how to develop android application free of cost</p><br>
                        <a href="https://www.javatpoint.com/" class="read_more">read more</a>                        
                        </div>
                    </div>
                    <br>
                	<div class="news_box">
                    	<div class="calendar">23</div>
                        <div class="news_content">
						<p><span></span>
						we have latest projects uploaded on my site</p>
                        <a href="https://www.cstpoint.com/" class="read_more">read more</a>                        
                        </div>
                    </div>                    
                    
                    
                    
                
                </div>
            
            
            </div>
            <!--end of left content-->


            <div class="right_content">
            
         
                <h1>Latest Projects</h1>
                
                <div class="project_box">
                    <a href="#"><img src="images/p1.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span> Description:</span><br>
                    Payment billing System
                    Online Quiz<br>
                    Matrimonial
                    
                    </p>
                </div>

                <div class="project_box">
                    <a href="#"><img src="images/p2.gif" alt="" title="" class="left_img" border="0"></a>
                    <p>
                    <span> Description:</span><br>
                    
                  		Gmail Account<br>
                  		Latest Quiz
                    </p>
                </div>
                <br>
                <div>
                
              <h1 ><br>Our main Services</h1>          
 </div>                   
                  <div class="services">
                    <ul>                                        
                       <li><a href="https://www.javatpoint.com/">Java tutorial</a></li>
                       <li><a href="https://www.cstpoint.com/">CSE tutorial</a></li>
                    </ul>
                </div>
                
                 <div class="services">
                    <ul>                                        
                       <li><a href="https://www.javatpoint.com/">Java tutorial</a></li>
                       <li><a href="https://www.cstpoint.com/">CSE tutorial</a></li>
                    </ul>
                </div>  
                   
            
            </div><!--end of right content-->


	<div id="footer">
    
    </div>


	 <!--end of main container-->
</body></html>

