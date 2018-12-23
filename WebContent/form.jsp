<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erasmus Form</title>
</head>
<body>
<form action="/StudentServlet" method="POST">>

  ÎÎ½Î¿Î¼Î±ÏÎµÏÏÎ½ÏÎ¼Î¿:<br>
  <input type="text" name="fullname">
  <br>
  ÎÏÎ¹Î¸Î¼ÏÏ ÎÎ·ÏÏÏÎ¿Ï (id):<br>
  <input type="text" name="id">
  <br>
  ÎÏÎ¹Î»Î­Î¾ÏÎµ Î­ÏÎ¿Ï ÏÎ¿Î¯ÏÎ·ÏÎ·Ï:<br>
   <input type="radio" name="year" value="3" checked> 3<br>
   <input type="radio" name="year" value="4"> 4<br>
   <br>
    ÎÏÎ¹Î»Î­Î¾ÏÎµ Î±ÏÎ¹Î¸Î¼Ï Î¼Î±Î¸Î·Î¼Î¬ÏÏÎ½:<br>
   <input type="radio" name="lessons" value="5" checked> 5<br>
   <input type="radio" name="lessons" value=" 5">5<br>
   <br>
   ÎÎ±ÏÎ­ÏÎµÏÎµ ÎºÎ¬ÏÎ¿Î¹Î¿ ÏÏÏÏÎ¯Î¿ Î¾Î­Î½Î·Ï Î³Î»ÏÏÏÎ±Ï;
   <input type="radio" name="foreign" value="ÎÎ±Î¹" checked> ÎÎ±Î¹<br>
   <input type="radio" name="lessons" value="ÎÏÎ¹">ÎÏÎ¹<br>
   ÎÏÎ¹Î»Î­Î¾ÏÎµ Î­ÏÏ ÏÏÎ¯Î± ÏÏÎ½ÎµÏÎ³Î±Î¶ÏÎ¼ÎµÎ½Î± Î Î±Î½ÎµÏÎ¹ÏÏÎ®Î¼Î¹Î±:<br>
   
   
   <br><br>
   <input type="submit" value="Î¥ÏÎ¿Î²Î¿Î»Î®"> 
   
</form>
<p>ÎÎ¹Î± Î½Î± ÏÏÎ¿Î²Î¬Î»Î»ÎµÏÎµ ÏÎ·Î½ Î±Î¯ÏÎ·ÏÎ· Î¸Î± ÏÏÎ­ÏÎµÎ¹ Î½Î± ÏÏÏÏÏÎ¬ÏÎµ Î­ÏÏ 5 Î¼Î±Î¸Î®Î¼Î±ÏÎ±.</p>
</body>
</html>