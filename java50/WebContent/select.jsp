<%@page import="bean.MemberDTO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- jsp주석 : include지시자
			   taglib지시자  --%>

<!DOCTYPE html>
<html>
<!-- html -->
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<%
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.select(id);
	%>
	

	
	
	<center>
		<font color="red" size="6">회원정보 확인</font>
		<hr>
		<table>
			<tr align="center">
				<td bgcolor="yellow" width="100">항&nbsp;&nbsp;&nbsp;&nbsp;목</td>
				<td bgcolor="pink" width="300">내&nbsp;&nbsp;&nbsp;&nbsp;용</td>
			</tr>
			<tr align="center">
				<td bgcolor="yellow" width="100">아 이 디</td>
				<td bgcolor="green" width="300">
					<%= dto.getId() %> <!-- 표현식:expression-->
				</td>
			</tr>
			<tr align="center">
				<td bgcolor="yellow" width="100">패스워드</td>
				<td bgcolor="green" width="300">
					<%= dto.getPw() %>
				</td>
			</tr>
			<tr align="center">
				<td bgcolor="yellow" width="100">이 름</td>
				<td bgcolor="green" width="300">
					<%= dto.getName() %>
				</td>
			</tr>
			<tr align="center">
				<td bgcolor="yellow" width="100">연 락 처</td>
				<td bgcolor="green" width="300">
					<%= dto.getTel() %>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>