<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가수: ${param.singer}<br> <!-- EL: 표현(출력)언어 -->
가요: ${param.title}<br>
-------------------------------<br>
<%= request.getParameter("singer") %> <!-- 표현식 -->

</body>
</html>