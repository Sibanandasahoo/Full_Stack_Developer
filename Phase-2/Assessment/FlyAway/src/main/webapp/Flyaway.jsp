<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to FlyAway</title>
</head>
<style>
img {
	width: 100%;
}
</style>
<body style="background-color: #73C2FB;">
	<h1>Welcome to FlyAway (An AirLine Booking Portal)</h1>

	<h2>
		<a href="UserRegistration.jsp">| User Registration |</a> <a
			href="UserPage.jsp">Booking Ticket |</a> <a href="AdminPage.jsp">Admin
			Login |</a>
	</h2>
	<img
		src="https://as2.ftcdn.net/v2/jpg/02/71/78/29/1000_F_271782927_keMVFo9PnBwrMEmbiUGKRcDT2rzf85dj.jpg"
		alt="HTML5 Icon" width="128" height="500">

	<%
	String message = (String) session.getAttribute("message");
	if (message != null) {
	%>
	<p style="color: green;"><%=message%></p>
	<%
	session.setAttribute("message", null);
	}
	%>
</body>
</html>