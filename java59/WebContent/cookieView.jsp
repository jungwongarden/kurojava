s<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//브라우저---request-->웹서버
	
	Cookie[] cookies = request.getCookies();
	out.print(cookies.length);
	for(int i = 0; i < cookies.length; i++){
%>
	쿠키의 이름<%= cookies[i].getName() %>, 
	쿠키의 값<%= cookies[i].getValue() %><br>
<%		
	}
%>
<br>
<%
	for(int i = 0; i < cookies.length; i++){
		if(cookies[i].getName().startsWith("p")){
			out.println(cookies[i].getValue());
		}
	}
%>


</body>
</html>