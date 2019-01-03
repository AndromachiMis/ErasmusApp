<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert a new University into University Erasmus List</title>
</head>
<body>
<form action="AddUniversityServlet" method="POST">
  Insert the name of University: <input type="text" name="name">
  <br><br>
  Insert the location of the University: <input type="text" name="location">
  <br><br>
  Insert the number of acceptants: <input type="number" name="num_acceptants"> 
  <br><br>
  <input type="submit" value="Submit">
</form> 

</body>
</html>