<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="/LoginServlet" method="POST">
<input type="text" name="user" />
<input type="text" name="pwd"/>
<input type="submit" value="Login" />
</form>
</body>
</html>
