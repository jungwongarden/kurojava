<%@page import="java.util.ArrayList"%>
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
		ArrayList list = null;
		String name = request.getParameter("name");
		if((name != null) && ((ArrayList)session.getAttribute("list") == null)){
			list = new ArrayList();
			list.add(name);
			session.setAttribute("list", list);
		}else{
			list = (ArrayList)session.getAttribute("list");
			list.add(name);
			session.setAttribute("list", list);
		}
	%>
	
	<%= name %>님 환영합니다. 
	<br>
	<a href="c.jsp">C로 연결</a>
</body>
</html>