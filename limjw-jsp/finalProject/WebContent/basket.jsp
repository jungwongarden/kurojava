<%@page import="bean.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="project.css" type="text/css" rel="stylesheet">
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
			<%
				if (request.getParameter("id") != null) {
			%>
			<jsp:useBean id="dto" class="bean.ProductDTO"></jsp:useBean>
			<jsp:setProperty property="*" name="dto" />
			<%
				//장바구니가 이미 있으면, 그 장바구니 세션의 리스트에 내 
					//선택한 물건(dto)을 추가.
					ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) session.getAttribute("basket");
					if (list == null) {
						list = new ArrayList<>();
					}
					list.add(dto);
					session.setAttribute("basket", list);
					//장바구니가 없으면, 장바구니 세션을 만들고 나서 
					//선택한 물건을 추가.
			%>

			<table border="1" bordercolor="green" width="450">
				<%
					for (int i = 0; i < list.size(); i++) {
							ProductDTO dto2 = list.get(i);
				%>
				<tr>
					<form action="pay.jsp">
						<td width="100"><%=dto2.getId()%></td> <input type="hidden"
							name="price" value="<%=dto2.getPrice()%>">
						<td width="300"><img width="50" height="50"
							src="<%=dto2.getImg()%>"></td>
						<td width="50">개수:<input type="text" name="count"></td>
						<td width="50"><button type="submit">구매하기</button></td>
					</form>
				</tr>
				<%
					}
				%>
			</table>
			<%
				} else {
					ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) session.getAttribute("basket");
					if(list != null){
			%>
			<table border="1" bordercolor="green" width="450">
				<%
					for (int i = 0; i < list.size(); i++) {
							ProductDTO dto2 = list.get(i);
				%>
				<tr>
					<form action="pay.jsp">
						<td width="100"><%=dto2.getId()%></td> 
						<input type="hidden"
							name="price" value="<%=dto2.getPrice()%>">
						<td width="300">
						<img width="50" height="50"
							src="<%=dto2.getImg()%>"></td>
						<td width="50">개수:<input type="text" name="count"></td>
						<td width="50"><button type="submit">구매하기</button></td>
					</form>
				</tr>
				<%
					}//for
				%>
			</table>
			<%
					}else{
						out.print("아직 장바구니에 없습니다..");
					}//if list 존재확인
				}//if session 존재확인
			%>
		</div>
	</div>
</body>
</html>