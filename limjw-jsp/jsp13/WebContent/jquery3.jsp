<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#back").click(function() {
			history.go(-1);
		});	
		$("#forward").click(function() {
			alert("서비스를 이용하시려면 회원가입을 하셔야 합니다. 회원가입을 진행합니다.");
			location.href = "jquery4.jsp";
		});	
	});
</script>
</head>
<body>
<%
	String tour = request.getParameter("tour");
	if(tour.equals("korea")){
		out.print("<h1>한국은 매일 항공편이 있습니다</h1>");
	}else{
		out.print("<h1>다른 지역은 격일로 항공편이 있습니다</h1>");
	}
%>
<button id="back">------뒤로</button> <button id="forward">------회원가입 화면으로..</button>  











</body>
</html>