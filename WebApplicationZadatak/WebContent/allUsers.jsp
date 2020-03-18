<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>
	<table>
		<thead>
		<tr>
		<th>Firstname</th>
		<th>Lastname</th>
		<th>Username</th>
		</tr>
		</thead>
		<c:forEach items="${users}" var="user">
		<tbody>
		<tr>
		<td>${user.firstname}</td>
		<td>${user.lastname}</td>
		<td>${user.username}</td>
		</tr>
		</tbody>
		</c:forEach>
	</table>
</body>
</html>