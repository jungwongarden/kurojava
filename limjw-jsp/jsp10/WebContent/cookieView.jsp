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
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i<cookies.length; i++){
			Cookie cookie1 = cookies[i];
			if(cookie1.getName().equals("jsp")){
				out.print(cookie1.getName() + "<br>");
				out.print(cookie1.getValue() + "<br><br>");
			}
		}
	%>
	전체 쿠키 개수는 <%= cookies.length %>개






</body>
</html>