<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 
<link rel="stylesheet" href="css/bxslider.css"> 
<script src="js/jquery-1.11.3.js"></script> 
<script src="js/jquery.bxslider-4.2.12.js"></script>



<script type="text/javascript">
$(document).ready(function(){ 
	 
    var main = $('.bxslider').bxSlider({ 
 
    mode: 'fade', 
 
    auto: true, //자동으로 슬라이드 
 
    controls : true,    //좌우 화살표    
 
    autoControls: true, //stop,play 
 
    pager:true, //페이징 
 
    pause: 3000, 
 
    autoDelay: 0,   
 
    slideWidth: 800, 
 
    speed: 500, 
 
    stopAutoOnclick:true
 
}); 
 
    
 
$(".bx-stop").click(function(){ // 중지버튼 눌렀을때 
 
    main.stopAuto(); 
 
    $(".bx-stop").hide(); 
 
    $(".bx-start").show(); 
 
    return false; 
 
}); 
 
 
 
$(".bx-start").click(function(){    //시작버튼 눌렀을때 
 
    main.startAuto(); 
 
    $(".bx-start").hide(); 
 
    $(".bx-stop").show(); 
 
    return false; 
 
}); 
 
 
 
  $(".bx-start").hide();    //onload시 시작버튼 숨김. 
 
}); 
</script>
<style type="text/css">
/*
	이미지 사이즈 맞춰서 수정해주세요... (#viewArea)
*/
#viewArea {position:relative; width:800px; height:600px;overflow:hidden;}
#imgList {position:absolute; width:2000px; left:0px; top:0px;}
#imgList div {float:left; margin:0px; padding:0px;}
</style>
</head>


<body>
<div class="home__slider"> 
 
    <div class="bxslider"> 
 
        <div><img src="images/main/slide1.jpg" alt="그림1"></div>
 		<div><img src="images/main/slide2.jpg" alt="그림2"></div> 
 
    </div> 
 
</div> 
</body>
</html>