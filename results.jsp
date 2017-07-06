<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Book</title>
   <style>
table, th, td {
    border: 1px solid black;
}
  </style>
  
</head>
<body>
<h1>Address Book List</h1>
Did this work? <p> Message from servlet=${message}</p><br>
<h2>Here's the information you entered</h2>
  <table>
  
  <tr><td>Name:</td><td> ${user.name}</td></tr>   
 <tr><td>Email: </td><td> ${user.email}</td></tr>
  <tr><td>Phone: </td><td> ${user.phoneNumber}</td></tr>
  
  
  </table>

</body>
</html>