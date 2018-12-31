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
	String title = request.getParameter("title");
	String price = request.getParameter("price");
%>
당신이 선택한 책 제목은 <%= title %><br>
당신이 선택한 책 가격은 <%= price %><br>

</body>
</html>