<%@page import="shop.FoodDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.FoodDAO"%>
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
	FoodDAO dao = new FoodDAO();
	ArrayList<FoodDTO> list = dao.selectAll();
	
	for(int i = 0; i< list.size(); i++){
		FoodDTO dto = list.get(i);
		out.print(dto.getId() + "  ");
		out.print(dto.getFavorite() + "  ");
		out.print(dto.getDislike() + "  <br>");
	}
%>
	<br>
	<%
		for(int i = 0; i< list.size(); i++){
			FoodDTO dto = list.get(i);
	%>
	<%= dto.getId() %>, <%= dto.getFavorite() %>, <%= dto.getDislike() %>
	<br>
	<% } %> 









</body>
</html>