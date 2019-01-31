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
		$("button").click(function() {
			$("img").attr("src", "win.png");
		});
	});
</script>

</head>
<body>
	<img src="fail.png" width="150" height="150">
	<br>
	<button>이미지 변신...</button>


</body>
</html>