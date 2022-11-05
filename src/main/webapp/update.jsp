<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/10/30
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>修改信息</title>
</head>
<body>
<form method="post" action="/CRUDDemo1/updateServlet">
    <input type="hidden" name="id" value="${user.id}">
    姓名: <input name="name" value="${user.name}"><br>
    余额: <input name="money" value="${user.money}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
