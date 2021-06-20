<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet"  type = "text/css" href = "stylesheet/user.css" />
<title>Home Page</title>
</head>
<body>

	<div class="wrapper">
		<div class="top-bar clearfix">
			<div class="top-bar-links">
				<ul>
					<li><a href="RegisterUI.jsp">Sign Up</a></li>
					<li><a href="loginUI.jsp">Log In</a></li>
					<li><a href="HomeUI.jsp">Home Page</a></li>
				</ul>
			</div><!-- top-bar-links -->
		
			<div class="site-search">
				<form method="get" action="HomeUI.jsp">
				<input type="search" name="search-box">
				<button type="submit">Go</button>
				</form>
			</div><!-- top-bar -->
			</div><!--end top bar -->
			
			<header class="clearfix">
				<div class="logo">
					<h1>Bus Ticket </h1>
					<p>Reservation system</p>
				</div><!-- logo -->
				
				<div class="profile">
					<h3> Welcome</h3>
				</div><!-- profile -->
			</header><!-- header -->
	
		<nav>
			<ul>
				<li><a href="loginUI.jsp">Add Bus</a></li>
				<li><a href="#">Book Ticket</a></li>
				<li><a href="#">View Transaction</a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Add Notice</a></li>
			</ul>
		
		</nav><!-- End OF The Navigation Bar -->
	</div><!-- end wrapper class -->
	

</body>
</html>