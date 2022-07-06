<%--
  Created by IntelliJ IDEA.
  User: haime
  Date: 3/18/2022
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Details</title>
</head>
<body>
   <p>Customer Name : ${customer.firstName} ${customer.lastName}</p>
   <p>Phone Number : ${customer.phone.areaCode} - ${customer.phone.prefix} - ${customer.phone.number} </p>


    </form>
</body>
</html>
