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
<center>
<font color="red" size="6">게시글 확인</font>
<table border="1" bordercolor="pink">
	<%
		String id = request.getParameter("id");
		BbsDTO dto = new BbsDTO();
		dto.setId(id);
	
		BbsDAO dao = new BbsDAO();
		BbsDTO dto2 = dao.select(dto);
	%>	
	<tr>
		<td width="100">아이디</td>
		<td width="200"><%= dto2.getId()  %></td>
	</tr>
	
	<tr>
		<td>제 목</td>
		<td><%= dto2.getTitle()  %></td>
	</tr>
	<tr>
		<td>내 용</td>
		<td><%= dto2.getContent() %></td>
	</tr>
	<tr>
		<td>글쓴이</td>
		<td><%= dto2.getUser() %></td>
	</tr>
	






</table>
</center>


</body>
</html>