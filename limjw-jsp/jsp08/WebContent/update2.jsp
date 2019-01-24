<%@page import="shop.BbsDTO"%>
<%@page import="shop.BbsDAO"%>
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
	String id = request.getParameter("id");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String user = request.getParameter("user");
	
	BbsDAO dao = new BbsDAO();
	BbsDTO dto = new BbsDTO();
	dto.setId(id);
	dto.setTitle(title);
	dto.setContent(content);
	dto.setUser(user);
	
	dao.update(dto);
	
	response.sendRedirect("selectAllBbs.jsp");
%>
	









</body>
</html>