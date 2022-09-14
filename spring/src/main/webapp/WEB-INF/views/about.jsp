<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>About Page</h1>
	<h2>My name is ${name }</h2>
	<h2>My Mobile number is ${mobile }</h2>
	<h2>My email id is ${email }</h2>

	<c:forEach var="friends" items="${f }">
		<h2>${friends }</h2>
	</c:forEach>
</body>
</html>