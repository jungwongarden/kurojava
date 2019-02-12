<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>장바구니의 현재<h5> 
		총 결제금액은★★★★★★
			<%
				if(session.getAttribute("pay") == null){
					out.print("0");
				}else{
					out.print(session.getAttribute("pay"));
				}
			%>
		원
</body>
</html>