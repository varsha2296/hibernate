<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Newspaper</title>
</head>
<body>
	<h1>Newspaper Application</h1>
	<form action="newspaper.do">
		<pre>
			<label>Name</label><input type="text" name="name">
			<label>Cost</label><input type="text" name="cost">
			<label>NoOfPages</label><input type="text" name="noOfPages">
			<label>Language</label><input type="text" name="language">
			<label>Magazine</label><input type="text" name="magazine">
			<input type="submit" name="Register">
		</pre>
	</form>
	<div>
		<h2>${message}</h2>
	</div>
</body>
</html>