<%@page import="bean.MemberDAO"%>
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
		
		MemberDAO dao = new MemberDAO();
		boolean result = dao.login(id, pw);
		if(result == true){
			response.sendRedirect("yes.html");
		}else{
			response.sendRedirect("no.html");
		}
	%>
	<%= id %>, <%= pw %>
</body>
</html>