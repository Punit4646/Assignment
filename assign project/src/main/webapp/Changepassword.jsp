<%@page import="model.Customer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Fashion Mania A Ecommerce Category Flat Bootstarp Resposive Website Template | Home :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Fashion Mania Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/responsiveslides.min.js"></script>
   <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
</head>
<body>
<%
Customer c = null;
if(session.getAttribute("data")!=null){
	c = (Customer)session.getAttribute("data");
}
else{
	response.sendRedirect("seller-login.jsp");
}
%>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
		
				<div class="col-sm-4 logo">
					<a href="index.html"><img src="images/logo.png" alt=""></a>	
				</div>
		
			<div class="col-sm-4 header-left">	
			
					<p class="log"><a href="profile.jsp" ><%=c.getName() %></a>
						<a  href="Changepassword.jsp" >Change Password</a>
						<a  href="logout.jsp.jsp" >Logout</a> </p>
					
					<div class="clearfix"> </div>
			</div> 
				<div class="clearfix"> </div>
		</div>
		</div>
		
		<div class="col-md-4 mb-5">
<%String msg = (String)request.getAttribute("msg");%>
			<%if(msg!=null){ %>
				<%out.print(msg); %>
			<%} %>
			<%String msg1 = (String)request.getAttribute("msg1");%>
			<%if(msg1!=null){ %>
				<%out.print(msg1); %>
			<%} %>
                        <h5 class="font-weight-bold text-dark mb-4">Customer Change Password</h5>
                        <form action="CustomerController" method="post">
                            <div class="form-group">
                                <input type="hidden" name="id" class="form-control border-0 py-4" required="required" value="<%=c.getId() %>" />
                            </div>
                            <div class="form-group">
                                <input type="password" name="op" class="form-control border-0 py-4" placeholder="Old Password"
                                    required="" />
                            </div>
                            <div class="form-group">
                                <input type="password" name="np" class="form-control border-0 py-4" placeholder="New Password"
                                    required="" />
                            </div>
                            <div class="form-group">
                                <input type="password" name="cnp" class="form-control border-0 py-4" placeholder="Confirm New Password"
                                    required=""  />
                            </div>
                           
                           <div>
                                <button class="btn btn-primary btn-block border-0 py-3" value="Change Password" name="action" type="submit">Change Password</button>
                                
                            </div>
                           
                        </form>
                    </div>

</body>
</html>