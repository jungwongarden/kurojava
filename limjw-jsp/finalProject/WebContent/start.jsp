<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="project.css" 
	  type="text/css"
	  rel="stylesheet" >
</head>
<body>
    <div id="total">
      <div id="top2">
		<jsp:include page="total.jsp"></jsp:include>
		</div>
        <div id="top">
          <jsp:include page="top.jsp"></jsp:include>
        </div>
        <div id="content">
           
        </div>
        <div id="bottom">나는 아래</div>
        <div id="company">싱싱쇼핑몰</div>
    </div>
</body>
</html>