<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 2줄=>  useBean 액션태그 = import + 객체생성 -->
<jsp:useBean id="dto" class="shop.MemberDTO"></jsp:useBean>
<!-- import + 객체생성  -->
<jsp:useBean id="dao" class="shop.MemberDAO"></jsp:useBean>

<!-- 8줄=> setProperty 액션태그 = getParameter + DTO의 set메소드 호출 -->
<!-- property: 속성, attribute, 변수 -->
<jsp:setProperty property="*" name="dto"/>

<%
	dao.insert(dto);
%>
DTO의 내용 확인
<hr color="red">
${dto.id} <br>
${dto.pw} <br>
${dto.name} <br>
${dto.tel} <br>



















</body>
</html>