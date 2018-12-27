<%@page import="bean.MemberDTO"%>
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
<jsp:useBean id="dao" class="bean.MemberDAO"></jsp:useBean>
<%
	ArrayList<MemberDTO> list = dao.selectAll();
	out.print("전체 회원 수는 : " + list.size() + "<br>");
	%>
	<table border="1">
	<tr>
		<td>아이디</td>
		<td>패스워드</td>
		<td>이름</td>
		<td>전화번호</td>
	</tr>
	
	<%
	for(int i = 0; i < list.size(); i++){
		MemberDTO dto = list.get(i);
	%>
	<tr>
		<td><%= dto.getId() %></td>
		<td><%= dto.getPw() %></td>
		<td><%= dto.getName() %></td>
		<td><%= dto.getTel() %></td>
	</tr>
	<%	
	}
	%>
	<!--  for(int i = 0; i < list.size(); i++){
		MemberDTO dto = list.get(i);
		out.print("id: " + dto.getId() + ",&nbsp;");
		out.print("pw: " + dto.getPw()  + ",&nbsp;");
		out.print("name: " + dto.getName()  + ",&nbsp;");
		out.print("tel: " + dto.getTel()  + "&nbsp;");
		out.print("<br>");
	}  -->
</table>







</body>
</html>