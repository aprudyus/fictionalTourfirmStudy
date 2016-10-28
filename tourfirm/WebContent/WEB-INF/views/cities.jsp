<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>

<jsp:include page="main.jsp"></jsp:include>
<body class="mypage">
<div >

    <div>
        <h2>CITIES</h2>
        <p>
            <i>ALL THE CITIES</i>
        </p>

        <table border="1">
            <tr>
                <th>City</th> <th>Country</th>
            </tr>
        <c:forEach items="${cities}" var="City">
            <tr>
                <spring:url value="cities/${City.country}" var="citiesC" />
                <spring:url value="hotels/${City.city}" var="hotelsC" />
                <td><a href=${hotelsC}>${City.city}</a></td> <td><a href=${citiesC}>${City.country}</a></td>
            </tr>
        </c:forEach>
        </table>

    </div>
</div>
</body>
</html>