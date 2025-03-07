<%@page import="com.app.dao.ProductDAO"%>
<%@page import="com.app.vo.ProductVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 페이지</title>
</head>
<body>
	
	
	<!-- 화면에 모든 상품 리스트 테이블로 구현하기 -->
	<form action="list.product"  method="post">
	<table>
		<tr>
			<th>상품 번호</th>
			<th>상품명</th>
			<th>상품 가격</th>
			<th>상품 재고</th>
		</tr>
		<%
			List<ProductVO> products = (List<ProductVO>)request.getAttribute("products");
		
			ProductDAO productDAO = new ProductDAO();
			List<ProductVO> productsList = productDAO.selectAll();
					
			for(ProductVO product : products){
	
		%>
			<tr>
				<td><%=product.getId() %></td>
				<td> 
					<a href ="read.product?id=<%=product.getId() %>">  
						<%=product.getProductName() %>
					</a>
				</td>
				<td><%=product.getProductPrice() %></td>
				<td><%=product.getProductStock() %></td>
			</tr>
		
		<%
			}
		%>
		
			
	</table>
	</form>
	
</body>
</html>