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
			
		
		
		
		<!-- display user details -->	
		<div class = "details">
		<c:forEach var = "det" items = "${details}">
		
			Id : ${det.id}<br>
			User Name : ${det.userName}<br>
			First Name : ${det.fname}<br>
			Last Name : ${det.lname}<br>
			Phone Number : ${det.phone}<br>
			Email : ${det.mail}<br>
			address : ${det.address}<br>
			City : ${det.city}<br>
			zipCode : ${det.zipcode}<br>
			<br>
			
			<!-- set parameter to send value via link -->
			<c:url value="userProfile.jsp" var="updateDetails">
				<c:param name="id" value="${det.id}"/>
				<c:param name="uname" value="${det.userName}"/>
				<c:param name="fname" value="${det.fname}"/>
				<c:param name="lname" value="${det.lname}"/>
				<c:param name="phone" value="${det.phone}"/> 
				<c:param name="email" value="${det.mail}"/>
				<c:param name="addr" value="${det.address}"/>
				<c:param name="city" value="${det.city}"/>
				<c:param name="code" value="${det.zipcode}"/>
			</c:url>
			
			<a href="${updateDetails}">
		 	 <input type="submit" name="update" value="Update Data">
		 	</a>
		 	<form action="OwnerHomeUI.jsp" method ="post"> <input type="submit" value="back"></form>
		 	
		</c:forEach><br>
		</div>
		
		
		
		
		
	</div><!-- end wrapper class -->
	


	
</body>
</html>