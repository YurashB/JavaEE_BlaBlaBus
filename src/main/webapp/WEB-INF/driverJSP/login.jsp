<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" content="text/css" href="css/stylesheet.css">
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/icon.html"/>
<body>
<p align="center" style="color: red"><c:out value="${incorrect}"/></p>
<form class="form-center" action="front-controller" method="post">
    <label for="login" style="margin: 0 0 0 24px">Login:</label>
    <input type="text" id="login" name="login"/>
    <br>
    <br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"/>
    <br>
    <br>
    <button type="submit" name="command" value="login">Log-in</button>
</form>
</body>
</html>
