<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<jsp:include page="main.jsp"></jsp:include>
<body>
<div >

  <div>
    <h2>HOTELS</h2>
    <p>
      <i>ALL THE HOTELS</i>
    </p>

    <table border="1">
      <tr>
        <th>Hotel</th> <th>City</th>
      </tr>
      <c:forEach items="${hotels}" var="Hotel">
        <tr>
          <spring:url value="hotels/${Hotel.getCity()}" var="hotelsC" />
          <spring:url value="hotel/${Hotel.getId()}" var="hotel" />
          <td><a href=${hotel}> ${Hotel.getHotel()}</a></td> <td><a href=${hotelsC}>${Hotel.getCity()}</a></td>
        </tr>
      </c:forEach>
    </table>

  </div>
</div>


</body>
</html>