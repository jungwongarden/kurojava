<%@page import="bean.DBConnect2"%>
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
//입력한 정보를 서버가 받아서
String id = request.getParameter("id");
String title = request.getParameter("title");
String content = request.getParameter("content");
String user = request.getParameter("user");

//db의 입력값으로 넣어라.
	DBConnect2 db2 = new DBConnect2();
	db2.insert(id, title, content, user);
%>
</body>
</html>