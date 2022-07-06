<%--
  Created by IntelliJ IDEA.
  User: haime
  Date: 3/18/2022
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
<h1>Edit Customer</h1>
<form action="saveCustomer" method="post">

    <p>First Name : <input name="firstName" value="${customer.firstName}"></p>
    <p>Last Name : <input name="lastName" value="${customer.lastName}"></p>
    <p>Phone Number : <input name="phone" value="${customer.phone}"></p>

    <input type="submit" value="Edit Customer">

</form>
</body>
</html>
