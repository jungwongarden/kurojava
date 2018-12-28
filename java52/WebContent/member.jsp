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
		String name = request.getParameter("name");
		String key = request.getParameter("key");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		String introduction = request.getParameter("introduction");
		String[] hobby = request.getParameterValues("hobby");
		
		String collect = "";
		for (int i = 0; i < hobby.length; i++) {
			collect = collect + hobby[i] + " ";
		}
		
	%>
ID: <%= id %><br>
PW: <%= pw %><br>
NAME: <%= name %><br>
KEY: <%= key %><br>
GENDER: <%= gender %><br>
종교: <%= religion %><br>
자기소개: <%= introduction %><br>
취미리스트: <%= collect %>








</body>
</html>