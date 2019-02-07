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
		$("a[title]").css("background", "yellow");
		$("a[href^='mailto']").css("background", "pink");
		$("a[href$='net']").css("background", "lime");
		$("a[href*='google']").css("background", "green");
	});
</script>
</head>
<body>
	<a href="http://www.naver.com" title="네이버로 이동합니다.">네이버로</a> <br>
	<a href="http://www.daum.net">다음으로</a> <br>
	<a href="http://www.google.com">구글로</a> <br>
	<a href="mailto:hera@naver.com">메일보내기</a> <br>
</body>
</html>






