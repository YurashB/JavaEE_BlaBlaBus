<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 31.03.2022
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/header.jsp"/>
<body>
<p align="center" style="color: red"><c:out value="${incorrect}"/></p>
<form style="text-align: center" action="front-controller">
    <label for="login" style="margin: 0 0 0 24px">Login:</label>
    <input type="text" id="login" name="login"/>
    <br>
    <br>
    <label for="password">Password:</label>
    <input type="text" id="password" name="password"/>
    <br>
    <br>
    <button type="submit" name="command" value="login">Log-in</button>
</form>
</body>
</html>
