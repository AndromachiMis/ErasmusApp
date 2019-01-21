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
Username: <input type="text" name="username">
<br><br>
Password: <input type="text" name="password">
<br><br>
Fullname: <input type="text" name="fullname">
<br><br>
Fathername: <input type="text" name="fathername">
<br><br>
Mothername:  <input type="text" name="mothername">
<br><br>
Phone: <input type="number" name="phone">
<br><br>
Status: <input type="text" name="status">
<br><br>
Year:  <input type="number" name="year">
<br><br>
Grades:  <input type="number" name="grades">
<br><br>
Lessons: <input type="number" name="lessons">
<br><br>
  <input type="submit" value="Submit">
  </form>
</body>
</html>