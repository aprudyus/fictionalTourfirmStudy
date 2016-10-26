<%@ page import="com.tourfirm.web.controller.CoreController" %>
<%@ page import="com.tourfirm.domain.City" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.tourfirm.web.controller.CityController" %>
<%@ page import="org.springframework.ui.Model" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<body>
<jsp:include page="main.jsp"></jsp:include>

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
                <spring:url value="cities/${City.getCountry()}" var="citiesC" />
                <spring:url value="hotels/${City.getCity()}" var="hotelsC" />
                <td><a href=${hotelsC}>${City.getCity()}</a></td> <td><a href=${citiesC}>${City.getCountry()}</a></td>
            </tr>
        </c:forEach>
        </table>

    </div>
</div>


</body>
</html>