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
<title>Home Page</title>

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

	<div class="container">
		<br> <br>
		<%
			int productCounter = 0;
			for (int i = 1; i <= Math.ceil(ProductDao.products.size() / 3.0); i++) {  //How many rows to be created
		%>
		<div class="row">
			<%
				for (int j = 1; j <= 3; j++) {
						if (productCounter >= ProductDao.products.size())
							break;
						ProductBean p = ProductDao.products.get(productCounter);//0
			%>

			<div class="col-md-3">
				<div class="card">
					<div class="card-body">
						<img alt="" src="images/iphon.jpg" width="150" height="140">
						<h5 class="card-title"><%=p.getProductname()%></h5>
						<p class="card-text">
						<table>



							<tr>
								<td>ProductName</td>
								<td><%=ProductDao.products.get(i).getProductname()%></td>
							</tr>

							<tr>
								<td>ProductQuntity</td>
								<td><%=ProductDao.products.get(i).getProductqty()%></td>
							</tr>

							<tr>
								<td>ProductPrice</td>
								<td><%=ProductDao.products.get(i).getProductprice()%></td>
							</tr>

							<tr>
								<td>ProductCategory</td>
								<td><%=ProductDao.products.get(i).getProductcategory()%></td>
							</tr>

						</table>
						</p>
						<%System.out.println("This is ProductId"+p.getProductId()); %>
						<a
							href="AddToCartServlet?productId=<%=p.getProductId()%>&userId=${cookie.userId.value}"
							class="btn btn-primary">AddToCart</a>
					</div>
				</div>
			</div>
			<!-- col-md3 -->

			<%
				productCounter++;
					} //j
			%>
		</div>
		<br>
		<!-- row -->

		<%
			}
		%>
	</div>


</body>
</html>


