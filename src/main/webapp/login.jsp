<%--
  Created by IntelliJ IDEA.
  User: stavros
  Date: 25/5/2022
  Time: 7:16 μ.μ.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Login to MyUniversity</h3>
<form action="${pageContext.request.contextPath}/login" method="post">
    name: <label>
    <input type="text" name="loginname" width="30"/>
</label>
    password: <label>
    <input type="password" name="loginpassword" width="10"/>
</label>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
