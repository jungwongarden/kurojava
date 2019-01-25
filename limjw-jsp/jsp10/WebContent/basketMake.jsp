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
<%
	String food = request.getParameter("food");

	ArrayList<String> basket = (ArrayList<String>)session.getAttribute("basket");

	if(basket == null){
		basket = new ArrayList<>();
	}
	basket.add(food);
	
	session.setAttribute("basket", basket);
%>
<hr color="red">
현재 까지의 <%= session.getAttribute("id") %>님!!! 장바구니의 내용은<br>
<%= session.getAttribute("basket") %>
<br>
<a href="pay.jsp">결제하기 페이지로</a>







</body>
</html>