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
	String drink = request.getParameter("drink");
	String price = request.getParameter("price");
	int p = Integer.parseInt(price);
	if(p >= 2500){
		out.print("아주 비싸군요...<br>");
	}else{
		out.print("아직은 괜찮아요...<br>")	;	
	}
			
	out.print("당신이 좋아하는 음료이름은 " + drink+"<br>");
	out.print("당신이 좋아하는 음료가격은 " + price);
%>
</body>
</html>