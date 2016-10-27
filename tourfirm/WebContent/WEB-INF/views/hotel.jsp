<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>
    <title></title>


</head>

  <jsp:include page="main.jsp"></jsp:include>
  <div>
    <c:out value="${hotel}"></c:out>
  </div>


</html>
