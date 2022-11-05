
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<input type="button" value="添加" id="add" align="center">
<table align="center" border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>余额</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${lists}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.money}</td>
            <td>
                <a href="/CRUDDemo1/selectByIdServlet?id=${list.id}">修改</a>
                <a href="/CRUDDemo1/deleteByIdServlet?id=${list.id}">删除</a>
            </td>

        </tr>
    </c:forEach>

</table>
<script>
    document.getElementById("add").onclick = function () {
        location.href = "/CRUDDemo1/addUser.jsp"
    }
</script>
</body>
</html>
