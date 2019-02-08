<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= session.getAttribute("singer") %><br>
${singer} 
<!-- 세션 속성 값 바로 출력 
	${속성이름}
-->
</body>
</html>