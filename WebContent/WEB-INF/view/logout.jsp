<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout</title>
</head>
<body>
       <center>Are you sure you want to disconnect?</br>
       <form action="LogoutServlet" method="post">

                <input type="submit" value="Logout"></br>
                <a href="javascript:history.back()">If not, return back</a>
                

        </form></center>
</body>
</html>