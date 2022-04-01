<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 31.03.2022
  Time: 21:03
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
    <input type="text" placeholder="Стара дата" name="oldDate">
    <input type="text" placeholder="Нова дата" name="newDate">
    <br>
    <br>
    <input type="text" placeholder="Стара ціна" name="oldPrice">
    <input type="text" placeholder="Нова ціна" name="newPrice">
    <br>
    <br>
    <input type="text" placeholder="Стара точка відправлення" name="oldStart">
    <input type="text" placeholder="Нова точка відправлення" name="newStart">
    <br>
    <br>
    <input type="text" placeholder="Стара кінцева точка призначення" name="oldFinish" >
    <input type="text" placeholder="Нова кінцева точка призначення" name="newFinish" >
    <br>
    <br>
    <button type="submit" value="correctTrip" name="command"
            style="background-color: red; color: white; text-align: center; border-radius: 4px; padding: 8px; border: none">
        Змінити маршрут
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
