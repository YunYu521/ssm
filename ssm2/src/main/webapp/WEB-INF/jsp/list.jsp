<%--
  Created by IntelliJ IDEA.
  User: YunYu
  Date: 2022/3/24
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>查询所有的账户</h1>
<%--${list}--%>

<c:forEach items="${list}" var="account">
    ${account.name}
    ${account.money}
</c:forEach>

</body>
</html>
