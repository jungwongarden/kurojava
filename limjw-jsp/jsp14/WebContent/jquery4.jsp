<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript">
//컨트롤+쉬프트+f
	$(function() {
		$("#form").submit(function() {
			var d = $(this).serialize();
			$.ajax({
				url : "member.jsp",
				data : d,
				success : function(result) {
					$("h2").html("<font color=red>" + result + "</font>");
				}
			});
			return false;
		});
	});
</script>
</head>
<body>
	<img src="win.png" width="100" height="100">
	<form id="form">
		가입하고 싶은 아이디: <br> <input type="text" name="id" id="input">
		<button type="submit">아이디 중복 체크</button>
	</form>
	<h2></h2>
</body>
</html>






