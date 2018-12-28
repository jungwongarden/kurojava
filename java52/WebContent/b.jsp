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
		String name = request.getParameter("name");
		if(name != null){
			session.setAttribute("name", name);
		}else{
			name = (String)session.getAttribute("name");
		}
	%>
	<%= name %>님 환영합니다.
	<br>
	<a href="c.jsp">C로 연결</a>
</body>
</html>