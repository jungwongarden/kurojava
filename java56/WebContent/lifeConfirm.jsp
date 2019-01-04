<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
application객체 값: <%= application.getAttribute("count") %><br>
session객체 값: <%= session.getAttribute("userId") %>
</body>
</html>