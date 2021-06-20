<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet"  type = "text/css" href = "stylesheet/user.css" />
<title>Display Bus Details</title>
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
				
				<div class="profile">
					<%
						String name = (String)session.getAttribute("userName");
						if(name == null){
							response.sendRedirect("loginUI.jsp");
						}
					
					%>
					<h3> Welcome ${sessionScope.userName} </h3>
				</div><!-- profile -->
			</header><!-- header -->
			
			<nav>
				<ul>
					<li><form action="view" method="post"> <input type="submit" value="view Profile"> </form></li>
					<li><form action="AddBusForm.jsp" method="post"> <input type="submit" value="add bus"> </form></li>
					<li><form action="viewBus" method="post"> <input type="submit" value="view bus"> </form></li>
					<li><form action="loginUI.jsp" method="post"> <input type="submit"  value="Logout"> </form></li>
					
				</ul>
			</nav>
			
			
			<!-- display bus details -->
		<div class="detailse">
		<form action="delete" method="post"> 
		<table border="1">
		<tr><th>Bus Id</th><th>From</th><th>To</th><th>Departure</th><th>Arrival</th><th>Type</th><th>No Of Seats</th><th>Fare</th><th>Delete Bus</th></tr>
		<c:forEach var = "d" items = "${busDetails}">
			
				<tr><td>${d.busId}</td><td>${d.startPlace}</td><td>${d.endPlace}</td><td>${d.dTime}</td><td> ${d.aTime}</td><td>${d.type}</td><td>${d.numOfSeats}</td><td> ${d.fare}</td><td><button type="submit"  name="busId" value="${d.busId}">Delete Bus</button></td></tr>         
			
			
		</c:forEach>
		</table>
		</form>
		</div><!-- details -->
			
			
			</div><!-- Wrapper class -->

</body>
</html>