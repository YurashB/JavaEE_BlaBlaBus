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
    <input class="input" type="text" placeholder="Стара дата" name="oldDate">
    <input class="input" type="text" placeholder="Нова дата" name="newDate"><br><br>
    <input class="input" type="text" placeholder="Стара ціна" name="oldPrice">
    <input class="input" type="text" placeholder="Нова ціна" name="newPrice"><br><br>
    <input class="input" type="text" placeholder="Стара точка відправлення" name="oldStart">
    <input class="input" type="text" placeholder="Нова точка відправлення" name="newStart"><br><br>
    <input class="input" type="text" placeholder="Стара кінцева точка призначення" name="oldFinish">
    <input class="input" type="text" placeholder="Нова кінцева точка призначення" name="newFinish"><br><br>
    <button class="red-button" type="submit" value="correctTrip" name="command">
        Змінити маршрут
    </button>
</form>
</body>
</html>
