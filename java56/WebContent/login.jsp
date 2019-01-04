<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="check.jsp" method="post">
	아이디<input type="text" name="id">
	<input type="submit" value="서버로 전송"> 
</form>
<%= session.getAttribute("id") %>님이 로그인되었습니다.<br>
<%= session.getAttribute("company") %>소속입니다.<br>
실패 : <%= session.getAttribute("no") %>번 입니다.<br>

</body>
</html>