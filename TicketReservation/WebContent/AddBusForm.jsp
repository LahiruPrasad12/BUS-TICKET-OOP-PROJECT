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
<title>Add New Bus</title>
</head>
<body>
	<div class="addnbox">
	<h1>Add Bus Information</h1>
	<form action="addBus" method="post">
		<input type="text" name="id" placeholder="Enter Bus ID"><br>
		<input type="text" name="from" placeholder="from"><br>
		<input type="text" name="To" placeholder="To"><br>
		<input type="text" name="dTime" placeholder="Depature Time"><br>
		<input type="text" name="aTime" placeholder="Arrival Time"><br>
		<select name="type">
			<option value="Ac">A/C</option>
			<option value="Non/Ac">None A/C</option>
		</select><br>
		<input type="text" name="seats" placeholder="Number Of Seats"><br>
		<input type="text" name="fare" placeholder="Fare"><br>
		<input type="submit" value="submit">
		<div class="error">${Message}</div>
	</form><!-- end form -->
	</div>
</body>
</html>