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
	int price = Integer.parseInt(request.getParameter("price"));
	int count = Integer.parseInt(request.getParameter("count"));
	
	//지금 버튼을 누른 항목에 대해서만 계산
	int total = price * count;
	
	Integer totalPay = (Integer)session.getAttribute("pay");
	if(totalPay == null){
		session.setAttribute("pay", total);		
		//out.print("현재 금액까지의 지불 금액은" + total + "원");
	}else{
		totalPay = totalPay + total;
		session.setAttribute("pay", totalPay);
		//out.print("현재 금액까지의 지불 금액은" + totalPay + "원");
	}
%>
<jsp:forward page="basket.jsp"></jsp:forward>










</body>
</html>