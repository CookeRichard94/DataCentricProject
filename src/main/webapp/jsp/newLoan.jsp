<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="loanAdd" >
		<h1>Add Book</h1>
		<table >
			<tr>
				<td>Customer ID:</td>
				<td><form:input path="cId"></form:input></td>
				<td id="error"><form:errors path="cId"></form:errors></td>
			</tr>
			<tr>
				<td>Book ID:</td>
				<td><form:input path="bid"></form:input></td>
				<td id="error"><form:errors path="bid"></form:errors></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add" /></td>
			</tr>
		</table>
		<a href="/">Home</a>
		<a href="/showBooks">List Books</a>
		<a href="/showCustomers">List Customers</a>
		<a href="/showLoans">List Loans</a>
	</form:form>

</body>
</html>