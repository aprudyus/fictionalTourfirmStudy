<%@ page import="com.tourfirm.domain.Hotel" %>
<%@ page import="com.tourfirm.web.controller.HotelController" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>

    <jsp:include page="main.jsp"></jsp:include>

</head>

  <div>

        <p>Hotel ${hotel.hotel} </p>
        <p>Located in ${hotel.city}</p>
        <p>Room booking available from ${hotel.datefrom} to ${hotel.datetill} </p>


  </div>


</html>
