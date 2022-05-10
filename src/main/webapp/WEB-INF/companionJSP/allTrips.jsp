<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" content="text/css" href="css/stylesheet.css">
    <title>Traveler</title>
</head>
<jsp:include page="/WEB-INF/included/icon.html"/>
<jsp:include page="/WEB-INF/included/loginButton.jsp"/>
<body>
<p class="headline">Усі доступні маршрути</p>
<table>
    <tr>
        <th>Водій</th>
        <th>Дата</th>
        <th>Ціна</th>
        <th>Початок</th>
        <th>Кінець</th>
    </tr>
    <c:forEach items="${trips}" var="trip">
        <tr>
            <td><c:out value="${trip.driversName}"/></td>
            <td><c:out value="${trip.date}"/></td>
            <td><c:out value="${trip.price}"/></td>
            <td><c:out value="${trip.destination.start}"/></td>
            <td><c:out value="${trip.destination.finish}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
