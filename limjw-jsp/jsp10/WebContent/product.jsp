<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="basketMake.jsp">
<%= session.getAttribute("id") %>님!!! 
구매할 물건을 고르세요.<br>
<select name="food">
	<option value="apple">사과
	<option value="banana">바나나
	<option value="lemon">레몬
</select>
<input type="submit" value="장바구니에 추가">
</form>









</body>
</html>