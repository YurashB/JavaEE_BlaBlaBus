<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" content="text/css" href="css/stylesheet.css">
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/icon.html"/>
<jsp:include page="/WEB-INF/included/loginButton.jsp"/>
<br><br>
<body>
<p class="headline">Ви вийшли з акаунта!</p>
<form action="front-controller" class="form-center">
    <button type="submit" value="main" name="command" class="green-button">
        Повернутися на головну
    </button>
</form>
</body>
</html>
