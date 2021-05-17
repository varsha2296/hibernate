<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Success</title>
<style>
h3 {
	text-align: center;
	color: green;
}

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
}

form>div {
	text-align: center;
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
	<h3>${message}</h3>
	<form>
		<div>Order From : ${data.orderFrom}</div>
		<br>
		<div>Phone Number : ${data.phoneNo}</div>
		<br>
		<div>Card Type : ${data.cardType}</div>
		<br>
		<div>No Of Copies : ${data.noOfCopies}</div>
		<br>
		<div>Content : ${data.content}</div>
	</form>
	<footer>&copy; Xworkz 2021</footer>
</body>
</html>