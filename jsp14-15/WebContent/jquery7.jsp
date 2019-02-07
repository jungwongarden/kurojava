<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").on("click", function(){
			$("#result").empty();
			var site = "http://myhome.chosun.com/rss/www_section_rss.xml";
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fmyhome.chosun.com%2Frss%2Fwww_section_rss.xml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
				dataType: "json",
				data: {	
					url: site,
					api_key: "rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
					count: 20
				},
				success: function(result){
					//$("#result").append("외부 사이트 연결 성공");
					//console.log(result);
					
					for(i in result.items){
						var newsTitle = result.items[i].title;
						var newsUrl = result.items[i].link;
						var newsDate = result.items[i].pubDate;
						$("#result").append("<a href="+newsUrl+">" + newsTitle + "</a>"+newsDate+"<br>");
					}
				}
			});
		});
		
		$("#btn2").on("click", function(){
			$("#result").empty();
			var site = "http://www.chosun.com/site/data/rss/ent.xml";
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fent.xml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
				dataType: "json",
				data: {	
					rss_url: site,
					api_key: "rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
					count: 20
				},
				success: function(result){
					//$("#result").append("외부 사이트 연결 성공");
					//console.log(result);
					
					for(i in result.items){
						var newsTitle = result.items[i].title;
						var newsUrl = result.items[i].link;
						$("#result").append("<a href="+newsUrl+">" + newsTitle + "</a><br>");
					}
				}
			});
		});
		
		$("#btn3").on("click", function(){
			$("#result").empty();
			var site = "http://photo.chosun.com/site/data/rss/rss.xml";
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fmyhome.chosun.com%2Frss%2Fwww_section_rss.xml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
				dataType: "json",
				data: {	
					rss_url: site,
					api_key: "rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
					count: 20
				},
				success: function(result){
					//$("#result").append("외부 사이트 연결 성공");
					//console.log(result);
					
					for(i in result.items){
						var newsTitle = result.items[i].title;
						var newsUrl = result.items[i].link;
						var description = result.items[i].description;
						$("#result").append("<a href="+newsUrl+">" + newsTitle + "</a><br>");
						$("#result").append(description);
						$("img").attr("height", "300").attr("width", "300");
					}
				}
			});
		});

	});
</script>
</head>
<body>
<button type="button" id="btn1">주요 뉴스</button>
<button type="button" id="btn2">연예</button>
<button type="button" id="btn3">사진</button>
<div id="result">
	
</div>









</body>
</html>