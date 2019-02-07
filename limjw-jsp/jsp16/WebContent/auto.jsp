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
	String food = request.getParameter("food");
	String from = request.getParameter("from");
	String to = request.getParameter("to");

%>
당신이 먹고 싶은 음식은 <%= food %>군요!!!<br><br>
우리의 수업은 <%= from %>부터 <%= to %>까지 입니다. <br>


</body>
</html>