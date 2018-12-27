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
	String search = request.getParameter("search");
	String name = request.getParameter("name");
	
	
%>
당신이 받은 검색어는 <%= search %>입니다.<br>
당신이 입력한 이름은 <%= name %>입니다.<br>

</body>
</html>




