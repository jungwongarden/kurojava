<%@page import="bean.BbsDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="project.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#button").click(function() {
			var re = $("#re").val(); //input에 넣은 값=>val()
			var option = $("option:selected").text(); //태그사이에 넣은 값=>text()
			$("#reply").append('<%=session.getAttribute("id")%><img src=img/reply.png><font size=6 color=green>' + option + ':  ' + re + '</font><br>');
		});
	});
</script>
</head>
<body>
	<div id="total">
		<div id="top2">
			<jsp:include page="total.jsp"></jsp:include>
		</div>
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="content">
			<jsp:useBean id="dao" class="bean.BbsDAO"></jsp:useBean>
			<%
				ArrayList<BbsDTO> list = dao.totalList();
			%>
			<c:set var="list" value="<%=list%>"></c:set>
			<c:forEach var="dto" items="${list}">
				<table border="1" bordercolor="red">
					<tr align="center">
						<td width="100" id="t1">${dto.id}</td>
						<td width="150" id="t2">${dto.title}</td>
						<td width="200" id="t3">${dto.content}</td>
						<td width="100" id="t4">${dto.user}</td>
					</tr>
				</table>
			</c:forEach>
			<img src="img/re.png" width="30" height="30"> 
				<select	id="select">
					<c:forEach var="dto" items="${list}">
						<option>${dto.id}</option>
					</c:forEach>
			</select> <input type="text" name="re" id="re">
			<button id="button">댓글 달기</button>
			<div id="reply"></div>
		</div>
	</div>
</body>
</html>