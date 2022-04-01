<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 31.03.2022
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/header.jsp"/>
<jsp:include page="/WEB-INF/included/logoutButton.jsp"/>
<body>
<form style="text-align: center; " action="front-controller" method="post">
    <input type="text" placeholder="Дата" name="date">
    <br>
    <br>
    <input type="text" placeholder="Ціна" name="price">
    <br>
    <br>
    <input type="text" placeholder="Точка відправлення" name="start">
    <br>
    <br>
    <input type="text" placeholder="Кінцева точка призначення" name="finish">
    <br>
    <br>
    <button type="submit" value="addTrip" name="command"
            style="background-color: #04AA6D; color: white; text-align: center; border-radius: 4px; padding: 8px; border: none">
        Додати маршрут
    </button>
</form>
<style>
    input[type=text] {
        width: 45%;
        border: 2px solid #aaa;
        border-radius: 7px;
        padding: 10px;
        float: none;
        margin: auto;
    }
</style>
</body>
</html>
