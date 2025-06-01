<%--
  Created by IntelliJ IDEA.
  User: 81434
  Date: 2024/3/16
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  ${cookie.username}
  <form action="http://localhost:8086/web" method="post">
    用户名<input type="text" name="username">
    密码<input type="password" name="password" >
  <input type="submit"></form>

  </body>
</html>
