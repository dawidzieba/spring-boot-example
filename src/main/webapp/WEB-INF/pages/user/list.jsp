<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring boot example</title>
</head>
<body>
	<h1>User list</h1>
	<c:if test="${not empty users}">
		<table class="usersTable">
			<c:forEach var="o" items="${users}">
				<tr>
					<td>${o.firstName}</td>
					<td>${o.lastName}</td>
				</tr>
			</c:forEach>
		</table>

	</c:if>
	<a href="users/add">Add user</a>
</body>
</html>