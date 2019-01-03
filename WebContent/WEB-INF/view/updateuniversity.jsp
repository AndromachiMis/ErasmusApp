<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateUniversitiesServlet" method="POST">
Insert the id of the University you want to Update: <input type = "number" name="id">
<br><br>
  Insert the new name of University: <input type="text" name="name">
  <br><br>
  Insert the new location of the University: <input type="text" name="location">
  <br><br>
  Insert the new number of acceptants: <input type="number" name="num_acceptants"> 
  <br><br>
 <input type="submit" value="Update">
</form>
</body>
</html>