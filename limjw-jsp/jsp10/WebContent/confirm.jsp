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
	String pw = request.getParameter("pw");
	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	dto.setPw(pw);
	
	MemberDAO dao = new MemberDAO();
	boolean result = dao.loginCheck(dto);
	
	if(result){
		out.print("로그인OK<br>");
		session.setAttribute("id", id);
	}else{
		out.print("로그인NOT<br>");
	}
%>
	<a href="product.jsp">물건구매하기 페이지로..</a>












</body>
</html>