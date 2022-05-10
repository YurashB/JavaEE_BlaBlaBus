<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" content="text/css" href="css/stylesheet.css">
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/icon.html"/>
<jsp:include page="/WEB-INF/included/logoutButton.jsp"/>
<body>
<p class="headline">Вітаю, що бажаєте виконати ?</p>
<form class="form-center" action="front-controller" method="post">
    <button type="submit" value="addTrip" name="command" class="driver-action-button">
        Додати новий рейс
    </button><br><br>
    <button type="submit" value="correctTrip" name="command" class="driver-action-button">
        Змінити рейс
    </button><br><br>
    <button type="submit" value="deleteTrip" name="command" class="driver-action-button">
        Видалити рейс
    </button>
</form>
</body>
</html>
