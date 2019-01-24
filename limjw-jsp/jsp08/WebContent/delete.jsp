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
	BbsDAO dao = new BbsDAO();
	BbsDTO dto = new BbsDTO();
	dto.setId(id);
	
	dao.delete(dto);
%>
삭제 신청되었습니다.
<a href="selectAllBbs.jsp">
	<img src="img/list.png">
</a>	








</body>
</html>