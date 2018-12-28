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
	String value = (String)session.getAttribute("name");
%>
<%= value %>님 환영합니다.

<a href="b.jsp">B로 연결</a>

</body>
</html>