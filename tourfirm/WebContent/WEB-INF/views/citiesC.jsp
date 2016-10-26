<%@ page import="com.tourfirm.web.controller.CoreController" %>
<%@ page import="com.tourfirm.domain.City" %>
<%@ page import="java.util.ArrayList" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url value="../cities" var="cities" />
<html>
<body>
<jsp:include page="main.jsp"></jsp:include>

<div >

  <div>
    <h2>CITIES</h2>
    <p>
      <i>CITIES IN </i>
    </p>

    <table border="1">
      <tr>
        <th>City</th> <th>Country</th>
      </tr>

      <c:forEach items="${citiesC}" var="City">
        <tr>
          <td> ${City.getCity()}</td> <td><a href=${cities}>${City.getCountry()}</a></td>
        </tr>
      </c:forEach>

      <tr>
        <td>*</td> <td> <a href=${cities}>*</a></td>
      </tr>

    </table>

  </div>
</div>


</body>
</html>