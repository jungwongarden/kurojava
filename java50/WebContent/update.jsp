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
<jsp:useBean id="dto" class="bean.MemberDTO"/>
<jsp:setProperty property="*" name="dto"/>
<%
	MemberDAO dao = new MemberDAO();
	dao.update(dto);
%>
id: <%= dto.getId() %><br>
pw: <%= dto.getPw() %><br>
name: <%= dto.getName() %><br>
tel: <%= dto.getTel() %><br>

업데이트가 요청되었습니다.
</body>
</html>