<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	1. 파라메터 받는다.
	2. dto객체 생성한다.(**)
	3. dto에 값을 넣는다.
	4. dao객체 생성한다.(**)
	5. dao의 insert호출
 -->
<jsp:useBean id="dto" class="bean.SaleDTO"></jsp:useBean>
<jsp:useBean id="dao" class="bean.SaleDAO"></jsp:useBean>

<jsp:setProperty property="*" name="dto"/>
<% dao.insert(dto); %>

</body>
</html>