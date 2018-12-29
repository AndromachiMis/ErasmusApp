<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erasmus Form</title>
</head>
<body>
<form action="StudentServlet" method="POST">>

 Fullname:<br>
  <input type="text" name="fullname">
  <br><br>
  Id:<br>
  <input type="text" name="id">
  <br><br>
   Username:<br>
  <input type="text" name="usernmae">
  <br><br>
  Fathername:<br>
  <input type="text" name="fname">
  <br><br>
   Mothername:<br>
  <input type="text" name="mname">
  <br><br>  
  Choose the year of your studies:<br>
   <input type="radio" name="year" value="3" checked> 3<br>
   <input type="radio" name="year" value="4"> 4<br>
   <br><br>
   Choose the number of courses in which you don't have an accessible grade:<br>
   <input type="radio" name="lessons" value="greater than 5" checked> 5<br>
   <input type="radio" name="lessons" value="less than 5">5<br>
   <br><br>
   Choose Universities from the list below:<br>
   <br><br>   
   Do you have the appropriate language certificate?<br>
   <input type="radio" name="cert" value="Yes" checked>Yes<br>
   <input type="radio" name="cert" value="No">No<br>
   <br><br>
   <input type="submit" value="Submit"> 
   
</form>
</body>
</html>