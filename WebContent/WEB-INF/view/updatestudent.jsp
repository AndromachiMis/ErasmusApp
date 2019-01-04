<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateStudentServlet" method="POST">
Insert the id of the Student you want to Update:
<input type = "text" name="id" />
</br></br>
 Username: <br>
<input type="text" name="user" />
</br></br>
Password: <br>
<input type="text" name="password"/>
</br></br>
Fullname: <br>
<input type="text" name="fullname"/>
</br></br>
Fathername:<br>
<input type="text" name="fathername"/>
</br></br>
Mothername: <br>
 <input type="text" name="mothername"/>
 </br></br>
Phone: <br>
 <input type="number" name="phone"/>
 </br></br>
Status: <br> 
<input type="text" name="status"/>
 </br></br>
Year: <br>
 <input type="text" name="year"/>
 </br></br>
Grades: <br>
 <input type="number" name="grades"/>
 </br></br>
Lessons:<br>
 <input type="number" name="lessons"/>
  </br></br>
  <input type="submit" value="Update">
</form>
</body>
</html>