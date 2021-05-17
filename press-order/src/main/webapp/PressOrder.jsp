<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Press Order</title>
<style>
header {
	height: 40px;
	border: 1px solid black;
	background-color: green;
	display: flex;
	justify-content: space-between;
}

div {
	width: 100px;
	padding-left: 20px;
	padding-top: 10px;
}

footer {
	height: 30px;
	border: 1px solid black;
	background-color: green;
	text-align: center;
	padding-top: 15px;
}

form>a {
	text-align: center;
}

div, a {
	color: black;
}

form {
	padding-left: 33%;
}

table {
	width: 80%;
	color: black;
}

h1 {
	text-align: center;
	color: black;
	text-decoration: underline;
	margin-top: 2px;
}

h3 {
	text-align: center;
	color: red;
}

tr {
	text-align: left;
}

.button {
	justify-content: center;
	display: flex;
	padding-left: 20%;
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

.search {
	padding-left: 25%;
}

.display {
	padding-left: 23%;
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
	<h1>Press Printing Order Form</h1>
	<h3>${message}</h3>
	<form action="order.do" method="post" style="table-layout: fixed;">
		<table>
			<tr>
				<th><label>Order From</label></th>
				<td><input type="text" name="orderFrom"></td>
			</tr>
			<tr>
				<th><label>Phone Number</label></th>
				<td><input type="text" name="phoneNo"></td>
			</tr>
			<tr>
				<th><label>Card Type</label></th>
				<td><select name="cardType">
						<option>--Select--</option>
						<option>Marriage</option>
						<option>Birthday</option>
						<option>House Warming</option>
						<option>Engagement</option>
						<option>Cradle Ceremony</option>
				</select></td>
			</tr>
			<tr>
				<th><label>No Of Copies</label></th>
				<td><input type="text" name="noOfCopies"></td>
			</tr>
			<tr>
				<th><label>Content</label></th>
				<td><textarea rows="5" cols="40" name="content"></textarea></td>
			</tr>
		</table>
		<div class="button">
			<div class="order">
				<input type="submit" value="Order">
			</div>
			<div class="reset">
				<input type="reset" value="Reset">
			</div>
		</div>
		<h4 class="search">
			<a href="SearchOrder.jsp">Search</a>
		</h4>
		<h4 class="display">
			<a href="DisplayAll.jsp">Display-All</a>
		</h4>
	</form>
	<footer>&copy; Xworkz 2021</footer>
</body>
</html>