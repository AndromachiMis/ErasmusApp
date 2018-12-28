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
  <br>
  Username (id):<br>
  <input type="text" name="id">
  <br>
  Choose the year of your studies:<br>
   <input type="radio" name="year" value="3" checked> 3<br>
   <input type="radio" name="year" value="4"> 4<br>
   <br>
   Choose the number of courses in which you don't have an accessible grade:<br>
   <input type="radio" name="lessons" value="greater than 5" checked> 5<br>
   <input type="radio" name="lessons" value="5">5<br>
   <br>
   ÎÎ±ÏÎ­ÏÎµÏÎµ ÎºÎ¬ÏÎ¿Î¹Î¿ ÏÏÏÏÎ¯Î¿ Î¾Î­Î½Î·Ï Î³Î»ÏÏÏÎ±Ï;
   <input type="radio" name="foreign" value="ÎÎ±Î¹" checked> ÎÎ±Î¹<br>
   <input type="radio" name="lessons" value="ÎÏÎ¹">ÎÏÎ¹<br>
   ÎÏÎ¹Î»Î­Î¾ÏÎµ Î­ÏÏ ÏÏÎ¯Î± ÏÏÎ½ÎµÏÎ³Î±Î¶ÏÎ¼ÎµÎ½Î± Î Î±Î½ÎµÏÎ¹ÏÏÎ®Î¼Î¹:<br>
   
   
   <br><br>
   <input type="submit" value="Submit"> 
   
</form>
<p>In order to fill the form you should .</p>
</body>
</html>