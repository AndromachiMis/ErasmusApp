<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Student</title>
</head>
<body>
<form action="AddStudentServlet" method="POST">
Username: <br>
<input type="text" name="user" /></br>
Password: <br>
<input type="text" name="pass"/></br>
Fullname: <br>
<input type="text" name="name"/></br>
Fathername:<br>
<input type="text" name="fname"/></br>
Mothername: <br>
 <input type="text" name="mname"/></br>
Phone: <br>
 <input type="text" name="pone"/></br>
Status: <br> 
<input type="text" name="status"/></br>
Year: <br>
 <input type="text" name="year"/></br>
Grades: <br>
 <input type="text" name="grades"/></br>
Lessons:<br>
 <input type="text" name="les"/></br>
 
  <input type="submit" value="Submit">
  </form>
</body>
</html>