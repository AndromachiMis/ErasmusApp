<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateUniversityServlet" method="POST">
Insert the id of the University you want to Update:
<input type = "text" name="id" />
</br></br>
 Name of University: <br>
<input type="text" name="name" />
</br></br>
Location: <br>
<input type="text" name="location"/>
</br></br>
Number of Acceptants: <br>
<input type="text" name="num_acceptants"/>
</br></br>
 <input type="submit" value="Update">
</form>
</body>
</html>