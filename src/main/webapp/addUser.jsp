<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/10/30
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>
</head>
<body>
<form method="post" action="/CRUDDemo1/addServlet">
    姓名: <input name="name"><br>
    余额: <input name="money"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
