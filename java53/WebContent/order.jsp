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
	String productId = request.getParameter("pId");
	String userId = request.getParameter("uId");
	
	String productName = null;
	
	if(productId.equals("1")){
		productName = "가방";
	}else if(productId.equals("2")){
		productName = "텔레비젼";
	}else{
		productName = "없는 제품";
	}
	
%>
아이디 <%= userId %>님이 주문하신 상품은 <%= productName %>입니다.
주문을 진행합니다.


</body>
</html>