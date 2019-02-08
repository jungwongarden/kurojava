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
	String singer = request.getParameter("singer");
	session.setAttribute("singer", singer);
%>
<a href="music5.jsp">singer페이지로.....</a>










</body>
</html>