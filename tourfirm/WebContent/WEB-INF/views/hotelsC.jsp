<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url value="../cities" var="cities" />
<spring:url value="../hotels" var="hotels" />
<html>
<body>
<jsp:include page="main.jsp"></jsp:include>

<div >

  <div>
    <h2>HOTELS</h2>

    <table border="1">
      <tr>
        <th>Hotel</th> <th>City</th>
      </tr>

      <c:forEach items="${hotelsC}" var="Hotel">
        <spring:url value="../hotel/${Hotel.getId()}" var="hotel" />
        <tr>
          <td><a href=${hotel}> ${Hotel.getHotel()}</a></td> <td>${Hotel.getCity()}</td>
        </tr>
      </c:forEach>

      <tr>
        <td><a href=${hotels}>All hotels</a></td> <td> <a href=${cities}>All cities</a></td>
      </tr>

    </table>

  </div>
</div>


</body>
</html>