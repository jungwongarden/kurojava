<%@page import="shop.FoodDTO"%>
<%@page import="shop.FoodDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String favorite = request.getParameter("favorite");
	String dislike = request.getParameter("dislike");
	
	FoodDAO dao = new FoodDAO();
	FoodDTO dto = new FoodDTO();
	
	dto.setId(id);
	dto.setFavorite(favorite);
	dto.setDislike(dislike);
			
	dao.insert(dto);
			
%>
음식 등록 신청했습니다.






</body>
</html>