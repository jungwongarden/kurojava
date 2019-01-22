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
 	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
 if(id.equals("root")  && pw.equals("1234")){
	 out.print("로그인 OK");
 }else{
	 out.print("로그인 NOT");
 }
%>









</body>
</html>