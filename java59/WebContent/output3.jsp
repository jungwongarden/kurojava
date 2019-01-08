<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 내가 가장 먹고 싶은 음식은 ?? ${param.food1}<br>
 내가 가장 먹고 싶은 음료는 ?? ${param.food2}<br>
 
 <c:if test="${param.food1 == param.food2}">똑같음.</c:if>
 <c:if test="${param.food1 != param.food2}">다름.</c:if>
 
 <hr color="red">
 
 <%
 	String[] study = {"자바", "안드로이드", "빅데이터", "ICT"};
 	String foods = "감자, 고구마, 양파, 수박";
 %>
 <c:set var="study" value="<%= study %>"  scope="application"/>
 <c:forEach  var="imsi" items="${study}">
 	${imsi}
 </c:forEach>
 <hr color="red">
 
 <c:set var="foods" value="<%= foods %>" />
 <c:forTokens var="imsi" items="${foods}" delims=",">
 	${imsi} 
 </c:forTokens>

 <hr color="red">
 <c:url var="google" value="http://www.google.co.kr">
 	<c:param name="q" value="jsp"></c:param>
 </c:url>
 
 <a href="${google}">구글에서 jsp 검색</a>
 <%-- <c:redirect url="http://www.daum.net" ></c:redirect> --%>
 
 <hr color="red">
 <c:catch var="e">
 	<%
 		int[] num = {1,2};
 		num[2] = 3;
 	%>
 </c:catch>
 에러정보 : ${e}
 
 <hr color="red">
 숫자 <fmt:formatNumber value="123456789" type="number"></fmt:formatNumber><br>
 패턴 <fmt:formatNumber value="1234.56789" pattern="0.000"></fmt:formatNumber><br>
 정수 <fmt:parseNumber value="1234.56789" integerOnly="true"></fmt:parseNumber><br>
 <c:set var="date" value="<%= new Date() %>" /><br>
 날짜만 길게 <fmt:formatDate value="${date}" type="date" dateStyle="full"/><br>
 날짜만 짧게 <fmt:formatDate value="${date}" type="date" dateStyle="short"/><br>
 시간만 길게 <fmt:formatDate value="${date}" type="time" dateStyle="full"/><br>
 날짜 시간 둘 다 길게 <fmt:formatDate value="${date}" type="both" dateStyle="full"/><br>
 
 <hr color="red">
 <sql:setDataSource
 	url="jdbc:mysql://localhost:3306/bigdata"
 	driver = "com.mysql.jdbc.Driver"
 	user="root"
 	password="1234"
 	scope="application" 
 	var="db"
 />
<%--  <sql:update dataSource="${db}">
 	insert into member values ('gold','gold','gold','gold')
 </sql:update> --%>
 
 <sql:query var="list" dataSource="${db}">
 	select * from member
 </sql:query>
 
 <c:forEach var="mem" items="${list.rows}">
 	${mem}<br>
 </c:forEach>
 
 <hr color="red">
 <c:set var="str" value="jspStudy :: the whole new worldl!!!" />
 길이 ${fn:length(str)}<br>
 글자추출  ${fn:substring(str, 0, 8)}<br>
 이후추출  ${fn:substringAfter(str, "jspStudy")}<br>
 이전추출  ${fn:substringBefore(str, "the")}<br>
 대문자로  ${fn:toUpperCase(str)}<br>
 소문자로  ${fn:toLowerCase(str)}<br>
 글자변환  ${fn:replace(str, "jsp", "안드로이드")}<br>
 글자위치  ${fn:indexOf(str, "the")}<br>
 글자확인  ${fn:contains(str, "the")}<br>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 <br>
</body>
</html>