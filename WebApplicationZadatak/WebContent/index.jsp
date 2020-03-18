<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<c:url value="/application/login" var="loginURL"></c:url>
	<a href="<c:out value="${loginURL}"/>">LOGIN</a>
	</div>

	<div>
	<c:url value="/application/allUsers" var="allUsersURL"></c:url>
	<a href="<c:out value="${allUsersURL}"/>">All users</a>
	</div>
	
	<div>
	<c:url value="/application/addnewuser" var="addNewURL"></c:url>
	<a href="<c:out value="${addNewURL}"/>">Add new user</a>
	</div>
	
	<div>
	<c:url value="/application/usersonsystem" var="usersOnSystemURL"></c:url>
	<a href="<c:out value="${usersOnSystemURL}"/>">Add new user</a>
	</div>
</body>
</html>