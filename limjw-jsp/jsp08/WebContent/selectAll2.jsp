<%@page import="shop.MemberDTO"%>
<%@page import="shop.MemberDAO"%>
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
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberDTO> list = dao.selectAll();
	
	for(int i = 0; i< list.size(); i++){
		MemberDTO dto = list.get(i);
		out.print(dto.getId() + "  ");
		out.print(dto.getPw() + "  ");
		out.print(dto.getName() + "  ");
		out.print(dto.getTel() + "  <br>");
	}
%>
	<br>
	<%
		for(int i = 0; i< list.size(); i++){
			MemberDTO dto = list.get(i);
	%>
	<%= dto.getId() %>, <%= dto.getPw() %>, <%= dto.getName() %>, <%= dto.getTel() %>
	<br>
	<% } %> 









</body>
</html>