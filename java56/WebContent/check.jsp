<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String sId= "root";
	String id = request.getParameter("id");
	if(sId.equals(id)){
%>
	<jsp:forward page="ok.jsp">
		<jsp:param value="naver" name="company"/>
	</jsp:forward>
<%
	}else{
		response.sendRedirect("no.jsp?no="+id);
	}
%>
</body>
</html>