<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="내가 출력됩니다."></c:out>
<c:set var="singer2" value="아이유" scope="session"></c:set>
<% session.setAttribute("singer2", "아이유"); %>

${singer2}
<a href="jstl2.jsp">세션값 확인...</a>





</body>
</html>