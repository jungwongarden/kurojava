<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dto" class="bean.MemDTO">
</jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

1.표현식으로 꺼내봅시다.<br>
<%= dto.getName() %>. <%= dto.getAge() %>
<br>

2.액션태그로 꺼내봅시다.<br>
<jsp:getProperty property="name" name="dto"/>,
<jsp:getProperty property="age" name="dto"/>
<br>

3.EL로 꺼내봅시다.<br>
${dto.name}, ${dto.age} 


















</body>
</html>