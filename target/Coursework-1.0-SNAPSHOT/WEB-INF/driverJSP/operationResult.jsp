<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" content="text/css" href="css/stylesheet.css">
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/icon.html"/>
<jsp:include page="/WEB-INF/included/logoutButton.jsp"/>
<body>
<p class="headline"><c:out value="${result}"/></p>
<form style="text-align: center; " action="front-controller">
    <button type="submit" value="driversMain" name="command"
            style="background-color: #04AA6D; color: white; text-align: center; border-radius: 4px; padding: 8px; border: none">
        Повернутися на головну
    </button>
</form>
</body>
</html>
