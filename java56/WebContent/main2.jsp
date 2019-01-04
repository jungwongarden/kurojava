<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문(메소드 정의, 전역변수 선언) -->
<%!
	int number; //0
	
	public int sum(int x, int y){
		return x + y;
	}
%>

<%
	int number2; //쓰레기값
	number2 = 10;
%>
두 수를 더한 합은 <%= sum(100, 200) %><br>
숫자1 <%= number %><br> 
숫자2 <%= number2 %><br>
결과값은 <%= number + number2 %>
</body>
</html>




