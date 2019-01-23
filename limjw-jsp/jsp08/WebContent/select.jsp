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
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto2 = dao.select(dto);
	%>
	당신의 id는 <%= dto2.getId()  %><br>
	당신의 pw는 <%= dto2.getPw()  %><br>
	당신의 name는 <%= dto2.getName()  %><br>
	당신의 tel는 <%= dto2.getTel()  %><br>










</body>
</html>