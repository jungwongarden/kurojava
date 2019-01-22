<%@page import="bean.DBConnect"%>
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
		//1. 입력한 값을 서버가 받음.
		String id = request.getParameter("id");
		String tel = request.getParameter("tel");

		//2. 받은 값을 db의 입력값으로 전달.
		DBConnect db = new DBConnect();
		db.update(id, tel);
		
	%>
</body>
</html>