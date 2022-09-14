<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>Help Page</h1>

	<%
	String name = (String) request.getAttribute("name");
	Long mobile = (Long) request.getAttribute("mobile");
	String email = (String) request.getAttribute("email");
	%>

	<h1>
		My name is :
		<%=name%><br> My Mobile Number is :
		<%=mobile%>
		<br> My Email is :
		<%=email%></h1>
</body>
</html>