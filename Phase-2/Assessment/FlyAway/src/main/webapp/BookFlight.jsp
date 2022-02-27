<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body style="background-color: #73C2FB;">
	<br>
	<a href=HomePage.jsp
		style="color: black; text-decoration: none; font-size: 35px; font weight: bold;">Flight
		Booking</a>
	<br>
	<br>
	<%
	@SuppressWarnings("unchecked")
	HashMap<String, String> user = (HashMap<String, String>) session.getAttribute("user");
	if (user == null) {
		response.sendRedirect("UserPage.jsp");
	}
	%>
	<p align="center"
		style="color: green; font-size: 20px; font-weight: bold">Transaction
		Completed Successfully....</p>
	<p align="center"
		style="color: green; font-size: 40px; font-weight: bold">
		Flight Booked Successfully <br>Thank you...
	</p>
	<p align="center"
		style="color: green; font-size: 25px; font-weight: bold">
		Go to home page: > <a href=Flyaway.jsp>click here</a>
	</p>
</body>
</html>