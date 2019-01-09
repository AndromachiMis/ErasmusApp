<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.PreparedStatement" %> 
<%@ page import="java.sql.Statement" %> 
<%@ page import="java.sql.Connection" %>	
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erasmus Form</title>
<% Connection con = null;
Class.forName("com.mysql.cj.jdbc.Driver");
String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
// String user = "it21489";
String user = "root";
String pass = "root";
String query="select * from universities";
try
{
con = DriverManager.getConnection(jdbcUrl, user, pass);
} catch (Exception e) {
 e.printStackTrace();
 } %>
</head>
<body>
<form action="StudentServlet" method="POST">
Fill the form:</br>
  Id:<br>
  <input type="text" name="id">
  <br><br>
   Username:<br>
  <input type="text" name="usernmae">
  <br><br>
   Fullname:<br>
  <input type="text" name="fullname">
  <br><br>
  Fathername:<br>
  <input type="text" name="fname">
  <br><br>
   Mothername:<br>
  <input type="text" name="mname">
  <br><br>  
  Choose the year of your studies:<br>
   <input type="text" name="year" /><br>
   <br><br>
   Choose the number of courses in which you don't have an accessible grade:<br>
   <input type="number" name="lessons" /><br>
   <br><br>
   Choose Universities from the list below (max 3 universities):<br>
   <% Statement stmt=con.createStatement();
   	ResultSet rs=stmt.executeQuery(query);
   	while(rs.next()) {  %>
   <input type="checkbox" name="unis" value="<%=rs.getString("name") %>" /><%=rs.getString("name") %>
   <% } %>
   <br><br>   
   Do you have the appropriate language certificates?<br>
   <input type="radio" name="cert" value="Yes" checked>Yes<br>
   <input type="radio" name="cert" value="No">No<br>
   <br><br>
   <input type="submit" value="Submit"> 
   
</form>
</body>
</html>