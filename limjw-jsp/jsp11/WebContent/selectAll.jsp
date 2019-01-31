<%@page import="bean.SaleDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.SaleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <style type="text/css">
</style> -->
<link 
	rel="stylesheet" 
	type="text/css" 
	href="css/css.css"/> 

</head>
<body>
<center>
<%
	SaleDAO dao = new SaleDAO();
	ArrayList<SaleDTO> list =  dao.select();
	for(SaleDTO dto : list){
%>
<table border="1" bordercolor="blue" >
<tr align="center" bgcolor="#0dc432" style="color : gray; ">
	<td class="pro">상품ID</td>
	<td>상품TITLE</td>
	<td class="pro">상품CONTENT</td>
	<td>상품PRICE</td>
	<td id="img">상품IMAGE</td>
</tr>
<tr align="center">
	<td bgcolor="#c22def">
	<a href="select.jsp?id=<%= dto.getId() %>">
		<%= dto.getId() %>
	</a>
	</td>
	<td><font color="red"><b><%= dto.getTitle() %></b></font></td>
	<td><%= dto.getContent() %></td>
	<td><%= dto.getPrice() %></td>
	<td><img width="100" height="100" src="img/<%= dto.getImg() %>"></td>
</tr>
</table>
<br>
<%		
	}
%>









</center>
</body>
</html>