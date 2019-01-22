<%@page import="shop.MemberDTO"%>
<%@page import="shop.MemberDAO"%>
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
	String tel = request.getParameter("tel");

	MemberDAO dao = new MemberDAO();
	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	dto.setTel(tel);
	
	dao.update(dto);
%>
회원 정보 수정 신청되었습니다.









</body>
</html>