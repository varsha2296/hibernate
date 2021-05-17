<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Order</title>
<style>
header {
	height: 40px;
	border: 1px solid black;
	background-color: green;
	display: flex;
	justify-content: space-between;
}

header>div {
	width: 100px;
	height: 100px;
	padding-left: 20px;
	padding-top: 10px;
}

div, a {
	color: black;
}

form {
	height: 260px;
	text-align: center;
	margin-top: 20px;
}

form>div {
	margin-top: 20px;
}

.button {
	justify-content: center;
	display: flex;
}

.order, .reset {
	width: 209px;
	font-size: 20px;
	position: relative;
}

form>div>div>input {
	background-color: green;
	height: 40px;
	width: 200px;
	border: 1px solid black;
}

footer {
	height: 30px;
	border: 1px solid black;
	background-color: green;
	text-align: center;
	padding-top: 15px;
	margin-top: 105px;
}
</style>
</head>
<body>
	<header>
		<div>X-workz</div>
		<div>
			<a href="#">About</a>
		</div>
	</header>
	<form action="search.do" method="post">
		<h2>Search By OrderFrom</h2>
		<input type="text" name="orderFrom">
		<div class="button">
			<div class="order">
				<input type="submit" value="Search">
			</div>
			<div class="reset">
				<input type="reset" value="Reset">
			</div>
		</div>
		<div>${data.orderFrom}</div>
		<div>${data.phoneNo}</div>
		<div>${data.cardType}</div>
		<div>${data.noOfCopies}</div>
		<div>${data.content}</div>
		<h4>
			<span style="color: red;">${message}</span>
		</h4>
		<h4>
			<span style="color: green;">${msg}</span>
		</h4>
	</form>
	<footer>&copy; Xworkz 2021</footer>
</body>
</html>