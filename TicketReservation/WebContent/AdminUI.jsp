<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet"  type = "text/css" href = "stylesheet/user.css" />

<title>Insert title here</title>
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
				<form method="get" action="#">
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
				
				
			</header><!-- header -->
			
			<nav>
				<ul>
					<li><form action="viewOwnersServlet" method="post"> <input type="submit" value="view Bus Owners"> </form></li>
					<li><form action="viewBusRouteServlet" method="post"> <input type="submit" value="View buses"> </form></li>
					<li><form action="loginUI.jsp" method="post"> <input type="submit"  value="Logout"> </form></li>
					
				</ul>
			</nav>
			
		
		
		
		<!-- display user details -->	
		<div class = "details">
		
		
		
		
		<c:forEach var = "detail" items = "${bus}">
			<br><br>
			Bus Id : ${detail.busID}<br>
			Star Place : ${detail.startPlace}<br>
			End Place : ${detail.endPlace}<br>
			Departure Time : ${detail.departureTime}<br>
			Arrival Time : ${detail.arrivalTime}<br>
			Type : ${detail.type}<br>
			Number Of Seats : ${detail.numOfSeats}<br>
			Fare : ${detail.fare}<br>
			Owner : ${detail.userName}<br>
			<form action="DeleteBus" method="post">
			<button type="submit" name ="bID" value="${detail.busID}">DELETE</button>
			</form>
			<br><br>
		</c:forEach><br>
		
		
		
		<c:forEach var = "det" items = "${det}">
			<br><br>
			User Name : ${det.userName}<br>
			First Name : ${det.fname}<br>
			Last Name : ${det.lname}<br>
			Phone Number : ${det.phone}<br>
			Email : ${det.mail}<br>
			address : ${det.address}<br>
			City : ${det.city}<br>
			zipCode : ${det.zipcode}<br>
			<form action="DeleteBusOwner" method="post">
			<button type="submit" name ="uid" value="${det.userName}">DELETE</button>
			</form>
			<br><br>
		</c:forEach><br>
		</div>
		
	
	</div><!-- end wrapper class -->
	


	
</body>
</html>