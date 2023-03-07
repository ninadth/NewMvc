<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER DETAILS</title>
</head>
<body>
<h1>USER RESTRATION FORM</h1>
<form action="saveUser" method="get">
<table>
<tr>
<td>USER FIRST NAME</td>
<td><input type="text" name="fname" ></td>
</tr>

<tr>
<td>USER LAST NAME</td>
<td><input type="text" name="lname" ></td>
</tr>

<tr>
<td>USER EMAIL</td>
<td><input type="text" name="Email" ></td>
</tr>

<tr>
<td>USER ADDRESS</td>
<td><input type="text" name="address" ></td>
</tr>

<tr>
<td><input type="submit" value="REGISTER" ></td>
</tr>

</table>
</form>
</body>
</html>