<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display All</title>
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
	<sql:setDataSource var="myDS" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/press_order" user="root"
		password="root123" />

	<sql:query var="data" dataSource="${myDS}">
        SELECT * FROM press_order;
    </sql:query>
	<header>
	<div>X-workz</div>
	<div>
		<a href="#">About</a>
	</div>
	</header>
	<form action="displayAll.do" method="post">
		<table style="width: 100%; border-collapse: collapse;" border="1"
			align="center">
			<caption>
				<h2>List of orders</h2>
			</caption>
			<thead>
				<tr>
					<th>Id</th>
					<th>OrderFrom</th>
					<th>PhoneNo</th>
					<th>CardType</th>
					<th>NoOfCopies</th>
					<th>Content</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${data.rows}">
					<tr>
						<td><c:out value="${dto.id}" /></td>
						<td><c:out value="${dto.orderFrom}" /></td>
						<td><c:out value="${dto.phoneNo}" /></td>
						<td><c:out value="${dto.cardType}" /></td>
						<td><c:out value="${dto.noOfCopies}" /></td>
						<td><c:out value="${dto.content}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
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