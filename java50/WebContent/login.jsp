<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 결과 화면입니다.</title>
	</head>
	<body>
	<%
	/* 스크립트릿 => 자바 코드 부분  */
	/* request객체는 클라이언트--->서버 "받는 객체" */
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	
	%>	
	<h1>회원 인증을 요청하셨습니다.</h1>
	<hr>
	당신이 입력한 id는 <%= id %><br>
	당신이 입력한 pw는 <%= pw %>
	
	</body>
	
</html>