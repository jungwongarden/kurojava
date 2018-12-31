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
		String img = request.getParameter("img");
	
		out.print("내가 받은 파일 이름은 " + img + "<br>");
	%>	
	<img src="<%= img %>">  
	
</body>
</html>



