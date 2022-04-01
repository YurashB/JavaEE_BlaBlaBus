<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 30.03.2022
  Time: 21:49
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
<p style="font-size:25px; font-family:verdana,serif;" align="center">Вітаю, що бажаєте виконати ?</p>
<form style="text-align: center;" action="front-controller" method="post">
    <button type="submit" value="addTrip" name="command"
            style="background-color: #04AA6D; color: white; text-align: center; border-radius: 4px; padding: 8px 15px; border: none">
        Додати новий рейс
    </button>
    <br>
    <br>
    <button type="submit" value="correctTrip" name="command"
            style="background-color: #04AA6D; color: white; text-align: center; border-radius: 4px; padding: 8px 34px; border: none">
        Змінити рейс
    </button>
    <br>
    <br>
    <button type="submit" value="deleteTrip" name="command"
            style="background-color: #04AA6D; color: white; text-align: center; border-radius: 4px; padding: 8px 28px; border: none">
        Видалити рейс
    </button>
</form>
</body>
</html>
