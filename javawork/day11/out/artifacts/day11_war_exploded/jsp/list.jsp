<%--
  Created by IntelliJ IDEA.
  User: 81434
  Date: 2024/3/3
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
    <link.rel="stylesheet"hert="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"integerity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<script>

</script>
<body>
<form action="http://localhost:8080/student" method="post">
    根据姓名模糊查询：<input type="text" name="likeName" value="${likeName}">
    <input type="submit" value="搜索" class="btn btn-warning">
</form>


</body>
</html>
