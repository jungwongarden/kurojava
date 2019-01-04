<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	%>
<%@ page isErrorPage="true" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%= exception.getClass().getName() %><br>
		<%= exception.getMessage() %><br>
		<img src="007.png">
	</center>
</body>
</html>