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
		$("#form").submit(function() {
			var d = $(this).serialize();//재가공!!
			
			$.ajax({
				url: "ajax.jsp",
				data: d,
				success: function(result) {
					$("body").append(result+"<br>");
				}
			});
			return false;
		});
	});
</script>
</head>
<body>
	<form id="form">
		<input type="text" id="input" name="input"> <br>
		<button type="submit">댓글 달기..</button>
	</form>
	<h1></h1>
	
</body>
</html>






