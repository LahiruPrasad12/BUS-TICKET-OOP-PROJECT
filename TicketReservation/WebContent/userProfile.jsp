<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet"  type = "text/css" href = "stylesheet/user.css" />
<title>Update User Details</title>
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
					<%
						String name = (String)session.getAttribute("userName");
						if(name == null){
							response.sendRedirect("loginUI.jsp");
						}
						else{
							
						}
					%>
					<h3> Welcome ${sessionScope.userName} </h3>
				</div><!-- profile -->
			</header><!-- header -->
			
			<nav>
				<ul>
					<li><form action="view" method="post"> <input type="submit" value="view Profile"> </form></li>
					<li><form action="#" method="post"> <input type="submit" value="add bus"> </form></li>
					<li><form action="#" method="post"> <input type="submit" value="Notice"> </form></li>
					<li><form action="#" method="post"> <input type="submit"  value="Logout"> </form></li>
					
				</ul>
			</nav>
			
	
	<!-- capture the value send via url and assign it to new variables -->	
	<%
		String id = request.getParameter("id");
		String uName = request.getParameter("uname");
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String phone = request.getParameter("phone");
		String mail = request.getParameter("email");
		String address = request.getParameter("addr");
		String town = request.getParameter("city");
		String zipCode = request.getParameter("code");
	
	
	%>
	
	
	<!-- Display User Details To Edit -->
	<div class="detail">
	<form action="update" method="post">
		Id : <input type="text"	name ="id" value = "<%= id%>" readonly><br>
		User Name : <input type="text"	name ="username" value = "<%= uName%>" readonly><br>
		First Name : <input type="text"	name="fName" value = "<%= fName%>"><br>
		Last Name : <input type="text"	name="lName" value = "<%=lName %>"><br>
		Phone : <input type="text" name="phone"	value = "<%=phone %>"><br>
		E-mail : <input type="text" name="email"	value = "<%= mail%>"><br>
		Address : <input type="text" name="address"	value = "<%= address%>"><br>
		Home Town : <input type="text" name="city"	value = "<%= town%>"><br>
		Zip Code : <input type="text" name="code"	value = "<%=zipCode %>"><br>
		<div class="error">${Message}</div>
		
		<input type="submit" value="Update">
	</form>
	
	<form action="OwnerHomeUI.jsp" method ="post"> <input type="submit" value="back"></form>
	</div><!-- detail -->
	</div><!-- Wrapper class -->
</body>
</html>