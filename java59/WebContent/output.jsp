<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

받은 이름은 ${param.name}, ${param["name"]}<br>
받은 나이는 ${param.age}
<%
	session.setAttribute("key", "ok");
%>
${key}
</body>
</html>
