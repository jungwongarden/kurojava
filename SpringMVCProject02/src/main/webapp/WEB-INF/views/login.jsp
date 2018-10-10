<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="loginOK" method="post">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td width="100" bgcolor="orange" align="center">아이디</td>
		<td><input type="text" name="id"></td>
	</tr>
		<tr>
		<td bgcolor="orange" align="center">비밀번호</td>
		<td><input type="password" name="pw"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="로그인">
		</td>
	</tr>
</table>
</form>
<a href="insertMem">회원가입</a>
</center>
</body>
</html>