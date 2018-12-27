<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Trendshop Shop</title>
  <link href="css/shopping.css" rel="stylesheet">  
  <script type="text/javascript" src="member/member.js"></script>
  <script type="text/javascript" src="mypage/mypage.js"></script> 
</head>

<body>
<div id="wrap">
<!--헤더파일 들어가는 곳 시작 -->
  <header>
    <!--로고 들어가는 곳 시작--->  
    <div id="logo">
      <a href="TrendshopServlet?command=index">
      <img src="images/logo_top.png" width="180" height="100" alt="Trendshopshop">
      </a>  
    </div>
    <!--로고 들어가는 곳 끝-->     
    <nav id="catagory_menu">
     <ul>
       <c:choose>
       <c:when test="${empty sessionScope.loginUser}">
       <li>         
         <a href="TrendshopServlet?command=login_form" style="width:110px;">LOGIN(CUSTOMER</a>   
	     <a href="TrendshopServlet?command=admin_login_form" style="width:100px;">| ADMIN)</a>
	   </li>		       
       <li>/</li>
       <li><a href="TrendshopServlet?command=contract">JOIN</a></li>
       </c:when>
       <c:otherwise>
       <li style="color:orange">
         ${sessionScope.loginUser.name}(${sessionScope.loginUser.id})
       </li>
       <li><a href="TrendshopServlet?command=logout">LOGOUT</a></li>
       </c:otherwise>       
       </c:choose>
       <li>/</li>
       <li>
         <a href="TrendshopServlet?command=cart_list">CART</a>
       </li><li>/</li>
       <li>
         <a href="TrendshopServlet?command=mypage">MY PAGE</a>
       </li><li>/</li>
       <li>
         <a href="TrendshopServlet?command=qna_list">Q&amp;A(1:1)</a>
       </li>
     </ul>
    </nav>

    <nav id="top_menu">
      <ul>
        <li>
          <a href="TrendshopServlet?command=catagory&kind=1">iPhone</a>
        </li>  
        <li>
          <a href="TrendshopServlet?command=catagory&kind=2">iPad</a>
        </li>  
        <li>
          <a href="TrendshopServlet?command=catagory&kind=3">Mac</a>
        </li> 
        <li>
          <a href="TrendshopServlet?command=catagory&kind=4">Watch</a>
        </li> 
        <li>
          <a href="TrendshopServlet?command=catagory&kind=5">TV</a>
        </li>  
      </ul>
    </nav>
    <div class="clear"></div>
    <hr>
  </header>
  <!--헤더파일 들어가는 곳 끝 -->