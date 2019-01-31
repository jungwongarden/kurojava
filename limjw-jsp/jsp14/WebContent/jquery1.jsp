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
		$("#b1").click(function() {
			$("h1").slideUp(10000);
		});
		$("#b2").click(function() {
			$("h1").slideDown(10000);
		});
		$("#b3").click(function() {
			$("h1").slideToggle(10000);
		});
	});
</script>
<style type="text/css">
h1 {
	width: 300px;
	height: 500px;
	background-color: yellow;
	border: 3px double lime;
}
</style>
</head>
<body>
	<button id="b1">슬라이드 업</button>
	<button id="b2">슬라이드 다운</button>
	<button id="b3">슬라이드 토글</button>
	<br>
	<h1>내가 움직여요!!!!!</h1>
</body>
</html>






