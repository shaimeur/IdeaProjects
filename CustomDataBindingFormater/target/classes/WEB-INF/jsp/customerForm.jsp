<%--
  Created by IntelliJ IDEA.
  User: haime
  Date: 3/18/2022
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Customer</title>
</head>
<body>
<h1>Add a new Customer</h1>
<form action="saveCustomer" method="post">

    <p>First Name : <input name="firstName"></p>
    <p>Last Name : <input name="lastName"></p>
    <p>Phone Number : <input name="phone"></p>

    <input type="submit" value="Add Customer">

</form>
</body>
</html>
