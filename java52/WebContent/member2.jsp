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

<jsp:useBean id="dto" class="java52.Student"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
	<%
	
		ArrayList list = null;
		if(((ArrayList)session.getAttribute("list") == null)){
			list = new ArrayList();
			list.add(dto);
			session.setAttribute("list", list);
		}else{
			list = (ArrayList)session.getAttribute("list");
			list.add(dto);
			session.setAttribute("list", list);
		}
	%>
	
	<%= dto %>님 환영합니다. 
	<br>
	<a href="member3.jsp">C로 연결</a>
</body>
</html>