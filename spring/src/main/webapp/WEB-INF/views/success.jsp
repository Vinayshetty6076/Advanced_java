<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h1>${Header }</h1>
	<h1 style="color: green">${msg }</h1>
	<h1>User Details</h1>
	<h2>Email is : ${user.email }</h2>
	<h2>UserName is : ${user.username }</h2>
	<h2>Password is : ${user.password }</h2>
	<h1>${Footer }</h1>
</body>
</html>