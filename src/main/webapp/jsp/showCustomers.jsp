<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="iso-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Customers</title>
</head>
<body>
	<h1>List of Customers</h1>
    <table>
        <tr>
            <th>Customer ID</th>
            <th>Name</th>
            <th>Loan Period</th>
        </tr>
        <tr>
            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td>${customer.cId}</td>
                    <td>${customer.cname}</td>
                    <td>${customer.loanperiod}</td>
                </tr>
            </c:forEach>
        </tr>
    </table>
</body>
</html>