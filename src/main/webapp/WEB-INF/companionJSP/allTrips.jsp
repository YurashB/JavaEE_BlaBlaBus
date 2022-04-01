<%--
  Created by IntelliJ IDEA.
  User: yurash
  Date: 30.03.2022
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Traveler</title>
</head>
<jsp:include page="/WEB-INF/included/header.jsp"/>
<jsp:include page="/WEB-INF/included/loginButton.jsp"/>
<body>
<p style="font-size:25px; font-family:verdana,serif;" align="center">
    Усі доступні маршрути
</p>
<table style="width: 100%" border="1">
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
<style>
    table {
        border-collapse: collapse;
    }

    table th {
        text-align: left;
        background-color: #3a6070;
        color: #FFF;
    }

    table td {
        border: 1px solid #e3e3e3;
    }

    table tr:nth-child(odd) td {
        background-color: #e7edf0;
    }
</style>
</html>
