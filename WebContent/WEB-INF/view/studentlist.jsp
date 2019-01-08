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
<title>Students List</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Students List</h2>
		<p>In the list below you can find all the relevant information for
			students:</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>Fullname</th>
					<th>Fathername</th>
					<th>Mothername</th>					
					<th>Phone</th>
					<th>Status</th>
					<th>Year</th>
					<th>Grades</th>
					<th>Lesson</th>
				</tr>
			</thead>
			<tbody>
				<% 
	Connection con = null;
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
    String user = "root";
    String pass = "root";
    String query="select * from student";
    con = DriverManager.getConnection(jdbcUrl, user, pass);
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())    {
    %>
				<tr>
					<td><%=rs.getString("id") %></td>
					<td><%=rs.getString("username") %></td>
					<td><%=rs.getString("fullname") %></td>
					<td><%=rs.getString("fathername") %></td>
					<td><%=rs.getString("mothername") %></td>
					<td><%=rs.getString("phone") %></td>
					<td><%=rs.getString("status") %></td>
					<td><%=rs.getString("year") %></td>
					<td><%=rs.getString("grades") %></td>
					<td><%=rs.getString("lessons") %></td>



				</tr>

				<% } %>
				<%
         
    con.close();
    }catch (Exception e){
    	
    	e.printStackTrace();
    }
      %>
        
    </tbody>
        
</table>
</div>

</body>
</html>




