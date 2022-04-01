<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 30.03.2022
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Traveler</title>
</head>
<jsp:include page="/WEB-INF/included/header.jsp"/>
<jsp:include page="/WEB-INF/included/loginButton.jsp"/>
<br>
<br>
<p style="font-size:25px; font-family:verdana,serif;" align="center">Оберіть маршрут</p>

<form style="text-align: center; " action="front-controller">
    <input type="text" placeholder="Початкова точка" name="start" value="">
    <br>
    <br>
    <input type="text" placeholder="Кінцева точка призначення" name="finish" value="">
    <br>
    <br>
    <button type="submit" value="findTrip" name="command"
            style="background-color: #04AA6D; color: white; text-align: center; border-radius: 4px; padding: 8px; border: none">Знайти маршрут
    </button>
    <button type="submit" value="findAllTrips" name="command"
            style="background-color: #008CBA; color: white; text-align: center; border-radius: 4px; padding: 8px; border: none">Знайти усі маршрути
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
</html>
