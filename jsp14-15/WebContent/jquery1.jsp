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
		//https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fent.xml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq
		$("#b1").click(function() {
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fent.xml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
				dataType: "json",
				data: {
					url: "http://www.chosun.com/site/data/rss/ent.xml",
					api_key: "rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
					count: 20
					},
				success: function(result) {
					$("h5").text("조선일보 연예 사이트 연결 성공!!");
				}
			}
		});
	});
</script>

</head>
<body>
	<button id="b1">연예기사</button>
	<h5></h5>
</body>
</html>






