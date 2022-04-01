<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 31.03.2022
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Traveller</title>
</head>
<jsp:include page="/WEB-INF/included/header.jsp"/>
<jsp:include page="/WEB-INF/included/logoutButton.jsp"/>
<body>
<p style="font-size:25px; font-family:verdana,serif;" align="center"><c:out value="${result}"/></p>
<form style="text-align: center; " action="front-controller">
    <button type="submit" value="driversMain" name="command"
            style="background-color: #04AA6D; color: white; text-align: center; border-radius: 4px; padding: 8px; border: none">
        Повернутися на головну
    </button>
</form>
</body>
</html>
