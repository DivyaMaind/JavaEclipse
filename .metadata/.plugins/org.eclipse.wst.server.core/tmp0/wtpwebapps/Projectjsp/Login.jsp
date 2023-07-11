<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Application</title>
</head>
<body>
<%
String name = request.getParameter("uname");
String pass = request.getParameter("upass");


if(name.equalsIgnoreCase("Divya") && pass.equalsIgnoreCase("Divya@123"))  {
	
	out.print("<h1>Logged in</h1>");
	RequestDispatcher rd = request.getRequestDispatcher("Index.html");
	rd.forward(request, response);
} else {
	 
	out.print("<p>Please try once again</p>");
	RequestDispatcher rd = request.getRequestDispatcher("Login.html");
	rd.include(request, response);
}
%>
</body>
</html>