<%@page import="bean.SaleDTO"%>
<%@page import="bean.SaleDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link 
	rel="stylesheet" 
	type="text/css" 
	href="css/css.css"/> 
</head>
<body id="select">
<%
	String id = request.getParameter("id");
	
	SaleDAO dao = new SaleDAO();
	SaleDTO dto = dao.select(id);
	
%>
<div id="info">상품에 대한 상세정보입니다.</div>
<hr color="red">
<div id="content">
상품ID	: <%= dto.getId() %><br>
상품TITLE	: <%= dto.getTitle() %><br>
상품CONTENT	: <%= dto.getContent() %><br>
상품PRICE	: <%= dto.getPrice() %><br>
상품IMAGE : <img width="100" height="100" src="img/<%= dto.getImg() %>">	
</div>
<br>










</body>
</html>