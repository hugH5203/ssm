<%--
  Created by IntelliJ IDEA.
  User: hh176
  Date: 2021/2/19
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %> <!--设置不忽略el表达式-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
Hello,springMVC!<br>
各个职业的信息：<br>
<c:forEach items="${users}" var="user">
    ${user.role_name}<br>
</c:forEach>
</body>
</html>
