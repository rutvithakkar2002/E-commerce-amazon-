<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="AddProductServlet" method="post">
Product-Category: <input type="text" name="productcategory"><br><br>
Product-Name: <input type="text" name="productname"><br><br>
Product-Quantity: <input type="text" name="productqty"><br><br>
Product-Price: <input type="text" name="productprice"><br><br>

<input type="submit" value="Add Product">
</form>

</body>
</html>