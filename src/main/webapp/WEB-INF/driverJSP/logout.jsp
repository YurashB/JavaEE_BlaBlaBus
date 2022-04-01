<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 31.03.2022
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/header.jsp"/>
<jsp:include page="/WEB-INF/included/loginButton.jsp"/>
<br>
<br>
<body>
<p style="font-size:25px; font-family:verdana,serif;" align="center">
    Ви вийшли з акаунта!
</p>
<form action="front-controller" style="text-align: center">
    <button type="submit" value="main" name="command" style="background-color: #04AA6D; color: white;text-align: center; border-radius: 4px; padding: 8px; border: none">
        Повернутися на головну
    </button>
</form>
</body>
</html>
