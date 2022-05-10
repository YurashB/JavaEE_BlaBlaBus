<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" content="text/css" href="css/stylesheet.css">
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/icon.html"/>
<jsp:include page="/WEB-INF/included/logoutButton.jsp"/>
<body>
<form class="form-center" action="front-controller" method="post">
    <input class="input" type="text" placeholder="Дата" name="date"><br><br>
    <input class="input" type="text" placeholder="Ціна" name="price"><br><br>
    <input class="input" type="text" placeholder="Точка відправлення" name="start"><br><br>
    <input class="input" type="text" placeholder="Кінцева точка призначення" name="finish"><br><br>
    <button class="green-button"type="submit" value="addTrip" name="command" >
        Додати маршрут
    </button>
</form>
</body>
</html>
