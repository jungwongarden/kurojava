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
	String no = request.getParameter("no");
	session.setAttribute("no", no);

%>
<font color="blue" size="6"><%= no %>로그인 실패!!!</font>
<jsp:forward page="login.jsp"></jsp:forward>
</body>
</html>