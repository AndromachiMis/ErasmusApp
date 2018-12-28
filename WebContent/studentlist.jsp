<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Students List</h2>
  <p>In the list below you can find all the relevant information for students:</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Fullname</th>
        <th>Mothername</th>
        <th>Fathername</th>
        <th>Id</th>
        <th>Username</th>
        <th>Phone</th>
        <th>Status</th>
        <th>Year</th>
        <th>Grades</th>
        <th>Lesson</th>
       </tr>
    </thead>
    <tbody>
    <% for (int i=0;;) { %>
      <tr>
        <td></td>
        <td></td> 
        <td></td>
        <td></td>
        <td></td>
        <td></td>       
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        
              </tr>  <% } %>  
    </tbody>
  </table>
</div>

</body>
</html>

