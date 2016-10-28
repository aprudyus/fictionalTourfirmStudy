<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<spring:url value="/#" var="home" />
<spring:url value="../cities" var="cities" />
<spring:url value="../hotels" var="hotels" />
<spring:url value="../clients" var="clients" />
<spring:url value="" var="input" />

<style>
	<%@ include file="/WEB-INF/resources/css/Table.css"%>
</style>

<head>
	<title>Serg`n`Anton Softserve Inc.</title>
</head>

<body class="main">
<div>
	<ul>
		<li class="li"><a href="${home}">
			<spring:message code="main.home"/></a></li>
		<li class="li"><a href="${cities}">
			<spring:message code="main.cities"/></a></li>
		<li class="li"><a href="${hotels}">
			<spring:message code="main.hotels"/></a></li>
		<li class="li"><a href="${clients}">
			<spring:message code="main.clients"/></a></li>

		<li class="li"><input type="text" placeholder="Search hotels in..."></li>

		<li class="li2"><button type="submit" class="btnSearch"><a href="../hotels/${input}">Search</a></button></li>
	</ul>

</div>

<div>

	<div>
		<h2>Serg`n`Anton travel agency!</h2>
		<p>
			<i>Explore the world!</i>
		</p>

	</div>
</div>
</body>