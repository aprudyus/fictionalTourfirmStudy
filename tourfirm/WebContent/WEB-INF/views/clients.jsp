<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<html>

<jsp:include page="main.jsp"></jsp:include>

<div >

  <div>
    <h2>CLIENTS</h2>

    <table border="1">
      <tr>
        <th>First Name</th> <th>Last Name</th>
      </tr>
      <c:forEach items="${clients}" var="Client">
        <tr>
          <td>${Client.firstname}</td> <td>${Client.lastname}</td>
        </tr>
      </c:forEach>
    </table>

  </div>
</div>

</html>