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
<link href="project.css" 
	  type="text/css"
	  rel="stylesheet" >
</head>
<body>
    <div id="total">
        <div id="top2">
           장바구니 내용..
        </div>
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
          <%
         	ArrayList<ProductDTO> list = dao.totalList();
          %>
         <c:set var="list" value="<%= list %>"></c:set>
         <table border="1" bordercolor="red">
	         <c:forEach var="dto" items="${list}">
	         	<tr align="center">
	         		<td width="50" id="t1">${dto.id}</td>
	         		<td width="100" id="t2">${dto.title}</td>
	         		<td width="200" id="t3">${dto.content}</td>
	         		<td width="100" id="t4">${dto.price}원</td>
	         		<td id="t5"><img src="${dto.img}" width="200" height="150"></td>
	         	</tr>
	         </c:forEach>
          </table>
        </div>
    </div>
</body>
</html>