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
//1. 쿠키 객체를 만들어라.
	Cookie cookie1 = new Cookie("id", "root");
	Cookie cookie2 = new Cookie("study", "java");
	Cookie cookie3 = new Cookie("fruit", "apple");
	cookie3.setMaxAge(60*60*24*10);
	
//2. 쿠키 객체를 브라우저로 심어라.
	//브라우저(클라이언트) <---response--- 웹서버
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	response.addCookie(cookie3);

	
	out.println("쿠키 객체 전송 완료.");
%>
<br>
<a href="cookieView.jsp">쿠키 내용 보기</a> 








</body>
</html>