<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Product</title>
</head>
<body>

<table border="1">

		<tr>

			<th>ProductId</th>
			<th>ProductName</th>
			<th>ProductQuntity</th>
			<th>ProductPrice</th>
			<th>ProductCategory</th>
			



		</tr>

		<%
			for (int i = 0; i <ProductDao.products.size(); i++) {
		%>
		
		<tr>

			<td><%=ProductDao.products.get(i).getProductId()%></td>
			<td><%=ProductDao.products.get(i).getProductname()%></td>
			<td><%=ProductDao.products.get(i).getProductqty()%></td>
			<td><%=ProductDao.products.get(i).getProductprice()%></td>
			<td><%=ProductDao.products.get(i).getProductcategory()%></td>
	
	
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>