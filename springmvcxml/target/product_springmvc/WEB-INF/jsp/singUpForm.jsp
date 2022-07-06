<%--
  Created by IntelliJ IDEA.
  User: haime
  Date: 3/11/2022
  Time: 12:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up Form</title>
</head>
<body>

        <form action="singup" method="post">
            <p>First Name : <input name="firstName"></p>
            <p>Last Name : <input name="lastName"></p>
            <p>Adress : </p>
            <p>Street : <input name="adress.street"></p>
            <p>Zipcode : <input name="adress.zipcode"></p>
            <input type="submit" value="Sign Up">
        </form>


</body>
</html>
