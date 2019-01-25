<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= session.getAttribute("id") %>님의 결제금액입니다.
<hr color="blue">
<%
	ArrayList<String> basket = (ArrayList<String>)session.getAttribute("basket");

	int count = basket.size();
	final int PRICE = 5000;
%>
당신의 구매 총 금액은 
	<font color="Red" size="6">
		<%= count * PRICE %>
	</font>
	원 입니다.










</body>
</html>