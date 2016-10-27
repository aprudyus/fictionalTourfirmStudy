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
    <h2>CITIES</h2>

    <table border="1">
      <tr>
        <th>City</th> <th>Country</th>
      </tr>

      <c:forEach items="${citiesC}" var="City">
        <tr>
          <spring:url value="../hotels/${City.getCity()}" var="hotelsC" />
          <td><a href=${hotelsC}>${City.getCity()}</a></td> <td>${City.getCountry()}</td>
        </tr>
      </c:forEach>

      <tr>
        <td></td> <td> <a href=${cities}>All cities</a></td>
      </tr>

    </table>

  </div>
</div>


</body>
</html>