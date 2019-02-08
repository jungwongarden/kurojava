<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${param.like == param.dislike}">좋아음식과 싫어하는 똑같군요.!!</c:if>
<c:if test="${param.like != param.dislike}">좋아음식과 싫어하는 다르군요.!!</c:if>

<%
	String[] study = {"자바", "안드로이드", "빅데이터"};
%>
<br>
<c:set var="s" value="<%= study %>"></c:set>
<c:forEach var="imsi" items="${s}">
	${imsi}<br>
</c:forEach>







</body>
</html>