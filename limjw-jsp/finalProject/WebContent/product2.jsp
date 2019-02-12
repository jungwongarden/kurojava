<%@page import="bean.ProductDTO"%>
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
</head>
<body>
	<div id="total">
		<div id="top2">장바구니 내용..</div>
		<div id="top">
			<ul>
				<li><a href="member.jsp">회원가입</a></li>
				<li><a href="product.jsp">제품정보</a></li>
				<li><a href="bbs.jsp">게시판</a></li>
				<li><a href="basket.jsp">장바구니</a></li>
			</ul>
		</div>
		<div id="content">
			<jsp:useBean id="dao" class="bean.ProductDAO"></jsp:useBean>
			<jsp:useBean id="dto" class="bean.ProductDTO"></jsp:useBean>
			<jsp:setProperty property="*" name="dto" />
			<%
				ProductDTO dto2 = dao.select(dto);
			%>
			<center>
			<%=session.getAttribute("id")%>님 환영합니다.
			<table border="1" bordercolor="blue">
				<tr align="center">
					<td width="50" id="t1"><%=dto2.getId()%></td>
				</tr>
				<tr align="center">
					<td width="400" id="t2"><%=dto2.getTitle()%></td>
				</tr>
				<tr align="center">
					<td width="400" id="t3"><%=dto2.getContent()%></td>
				</tr>
	         	<tr align="center">
					<td width="400" id="t4"><%=dto2.getPrice()%>원</td>
				</tr>
	         	<tr align="center">
					<td id="t5"><img src="<%=dto2.getImg()%>" width="400"
						height="150"></td>
				</tr>
			</table>
				<a href="basket.jsp?id=<%=dto2.getId()%>&img=<%=dto2.getImg()%>&price=<%=dto2.getPrice()%>">장바구니에 넣기</a>
			</center>
		</div>
	</div>
</body>
</html>