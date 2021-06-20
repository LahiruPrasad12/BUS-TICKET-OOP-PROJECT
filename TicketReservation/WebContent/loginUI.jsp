<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/busTicket.js"></script>
<link rel = "stylesheet"  type = "text/css" href = "stylesheet/user.css" />
<style>
body{
	background-image: url("image/img2.jpg");
	background-repeat: no-repeat;
  	background-size: 1600px 1000px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	
	
	<div class="loginbox">
	<h1>Login Here</h1>
	<form action ="log" method = "post" >
		<p>User Name</p> 
		 <input type="text" name="uid"  placeholder="Enter User Name"><br>
		<p>Password </p>
		 <input type="password" name="pass" placeholder="Enter Password"><br>
		<div class="error">${Message}</div>
		<input type="submit" name="submit" value="Login" ><br>
		<br>
		<p>Already Not A Member <a href="RegisterUI.jsp">Sign Up</a></p>
	</form><!-- end of the login form -->
	</div>
	
</body>
</html> 