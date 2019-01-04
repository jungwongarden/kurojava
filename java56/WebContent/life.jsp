<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	int count = 100;
	application.setAttribute("count", count);
	
	String userId = "root";
	session.setAttribute("userId", userId);
%>
<a href="lifeConfirm.jsp">속성값 확인</a>








</body>
</html>