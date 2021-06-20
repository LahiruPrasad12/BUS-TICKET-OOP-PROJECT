<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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

	<div class="regnbox">
	<h1>Register Here</h1>
	<form action="r" method="post">
	
		<input type="text" name="fname" placeholder="First Name"><br>
		<input type="text" name="lname" placeholder="Last Name"><br>
		<input type="text" name="phone" placeholder="Contact Number"><br>
		<input type="text" name="email" placeholder="Email"><br>
		<input type="text" name="address" placeholder="Address"><br>
		<input type="text" name="city" placeholder="City"><br>
		<input type="text" name="zipCode" placeholder="Zip Code"><br>
		<input type="text" name="userName" placeholder="User Name"><br><br>
		<input type="Password" name="password" placeholder="password"><br>
		<div class="error">${Message}</div>
		<br>
		<input type ="submit" value="Register"><a href="HomeUI.jsp"><input type="button" value="back"></a>
	
	</form><!-- End Of The Form -->
	</div>
	
</body>
</html>