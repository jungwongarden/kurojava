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
	Cookie cookie1 = new Cookie("kg", "kgjava");
	Cookie cookie2 = new Cookie("java", "javastudy");
	Cookie cookie3 = new Cookie("jsp", "jspstudy");
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	response.addCookie(cookie3);
%>
쿠키가 생성되었습니다.<br>
<a href="cookieView.jsp">생성된 쿠키보기 사이트로..</a>









</body>
</html>