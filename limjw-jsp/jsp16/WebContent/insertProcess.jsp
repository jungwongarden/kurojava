<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--액션태그:  JSP태그를 사용하면 아래와 같은 일들을 
 			   동적으로 처리해줌.
	1. 파라메터로 넘어오는 값 받아줘야 함. 
	2. DTO객체 생성해서 변수에 파라메터값 넣어줘야 함.
	3. DAO객체 생성해서 DTO를 입력값으로 하여 insert().
-->
<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<jsp:useBean id="dao" class="bean.BbsDAO"></jsp:useBean>
<%
	dao.insert(dto);
%>
${dto.id} <!-- EL(표현언어) --> <br>
<%= dto.getId() %> <!-- 표현식 --> <br>
<jsp:getProperty property="id" name="dto"/> <!-- 액션태그 -->
</body>
</html>