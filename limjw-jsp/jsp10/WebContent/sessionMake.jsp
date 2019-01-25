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
	session.setAttribute("id", "kgjava");
%>
세션이 생성되었습니다.
<a href="sessionView.jsp">세션보기-1</a>
<a href="sessionView2.jsp">세션보기-2</a>
<a href="sessionView3.jsp">세션보기-3</a>







</body>
</html>