<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="dto" items="${list}">
		<hr color="red">
			${dto.id}<br>
			${dto.pw}<br>
			${dto.name}<br>
			${dto.tel}<br>
	</c:forEach>
</body>
</html>