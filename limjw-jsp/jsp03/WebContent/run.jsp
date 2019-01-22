<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! //선언문
	String tel; //전역변수

	public int add(int x, int y){ //메소드 정의
		return x + y;
	}
%>
<% //스크립트릿은 service()내로 변환되어 들어감.
	String name = null; //지역변수
%>
전역변수 tel값: <%= tel %> <br>
지역변수 name값: <%= name %> <br>
10과 20의 합은: <%= add(10, 20) %>





</body>
</html>