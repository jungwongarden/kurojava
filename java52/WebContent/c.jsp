<%@page import="java.util.ArrayList"%>
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
	ArrayList list = (ArrayList)session.getAttribute("list");
%>

<%= list %>님 환영합니다.

<a href="a.jsp">a로 연결</a> 

</body>
</html>