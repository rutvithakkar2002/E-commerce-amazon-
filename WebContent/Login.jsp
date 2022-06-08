<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form action="LoginServlet" method="post">
Email: <input type="text" name="email"><br><br>
Passwod:<input type="text" name="password"><br><br>
<input type="submit" value="Login"> 

</form>
<br>
	${error}
</body>
</html>