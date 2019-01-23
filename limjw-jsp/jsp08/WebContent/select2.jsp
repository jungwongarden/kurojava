<%@page import="shop.BbsDAO"%>
<%@page import="shop.BbsDTO"%>
<%@page import="shop.MemberDAO"%>
<%@page import="shop.MemberDTO"%>
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
		BbsDTO dto = new BbsDTO();
		dto.setId(id);
	
		BbsDAO dao = new BbsDAO();
		BbsDTO dto2 = dao.select(dto);
	%>	
	당신의 게시물 id는 <%= dto2.getId()  %><br>
	당신의 게시물 제목은 <%= dto2.getTitle()  %><br>
	당신의 게시물 내용은 <%= dto2.getContent()  %><br>
	당신의 게시물 작성자는 <%= dto2.getUser()  %><br>










</body>
</html>