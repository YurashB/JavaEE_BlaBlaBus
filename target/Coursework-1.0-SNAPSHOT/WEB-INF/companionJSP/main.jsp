<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" content="text/css" href="css/stylesheet.css">
    <title>Traveler</title>
</head>
<jsp:include page="/WEB-INF/included/icon.html"/>
<jsp:include page="/WEB-INF/included/loginButton.jsp"/><br><br>
<p class="headline">Оберіть маршрут</p>
<form action="front-controller" class="form-center">
    <input class="input" type="text" placeholder="Початкова точка" name="start" value=""><br><br>
    <input class="input" type="text" placeholder="Кінцева точка призначення" name="finish" value=""><br><br>
    <button type="submit" value="findTrip" name="command" class="green-button">Знайти маршрут</button>
    <button type="submit" value="findAllTrips" name="command" class="find-all-trip">Знайти усі маршрути</button>
</form>
</html>
