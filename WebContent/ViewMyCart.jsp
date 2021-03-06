<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.ProductBean"%>
<%@page import="com.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
</style>
<meta charset="ISO-8859-1">
<title>View My Cart</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>




</head>
<body>

	<jsp:include page="CustomerHeader.jsp"></jsp:include>

	<%
		int userId = -1;
		Cookie c[] = request.getCookies();
		for (int i = 0; i < c.length; i++) {
			if (c[i].getName().equals("userId")) { //there are so many cookies so, so we compare the id value with cookie.
				userId = Integer.parseInt(c[i].getValue());
			}
		}
		System.out.println("currentUSer => " + userId);
		System.out.println("size => " + CartDao.carts.size());
	%>

	<div class="container">
		<br> <br> <br>
		<%
			int total=0;
			for (int i = 0; i < CartDao.carts.size(); i++) {
				System.out.println("userid=> " + CartDao.carts.get(i).getUserId());
				if (CartDao.carts.get(i).getUserId() != userId) {
					continue;
				}
		%>
		<%=CartDao.carts.get(i).getProductId()%> &nbsp;
		<%=ProductDao.getProductDetailById(CartDao.carts.get(i).getProductId()).getProductname()%>  :  <%=ProductDao.getProductDetailById(CartDao.carts.get(i).getProductId()).getProductprice() %><br>
		<%
		
			total=total+ProductDao.getProductDetailById(CartDao.carts.get(i).getProductId()).getProductprice();
		
			} 
		
		%>
		<br>	<br>
		
		Total=<%=total%>
		
		<a href="CheckoutServlet?userId=${cookie.userId.value}">CheckOut</a>
		
			</div>


</body>
</html>


