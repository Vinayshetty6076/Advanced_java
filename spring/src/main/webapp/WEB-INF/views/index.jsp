<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Home Page</h1>

	<%
	String name = (String) request.getAttribute("name");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>
		My name is
		<%=name%></h1>

	<h1>My Friends</h1>
	<%
	for (String s : friends) {
	%>

	<h1>
		<%
		out.println(s);
		%>
	</h1>
	<%
	}
	%>
</body>
</html>