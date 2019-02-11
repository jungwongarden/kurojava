<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<jsp:useBean id="dao" class="bean.MemberDAO"></jsp:useBean>
<%
boolean check = dao.loginCheck(dto);
if(check == true){
	session.setAttribute("id", dto.getId());
%>
	<jsp:forward page="product.jsp"></jsp:forward>
<%
}else{
%>
	<jsp:forward page="member.jsp"></jsp:forward>
<%
}
%>

</body>
</html>