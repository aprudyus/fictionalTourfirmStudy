<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<link href="/resources/css/Table.css" rel="stylesheet">
<spring:url value="/#" var="home" />
<spring:url value="../cities" var="cities" />


<title>Serg`n`Anton Softserve Inc.</title>
<body>
<div>

	<div>
		<h2>Serg`n`Anton travel agency!</h2>
		<p>
			<i>Explore the world!</i>
		</p>

	</div>
</div>

<div>
	<ul>
		<li><a href="${home}">
			<spring:message code="main.home"/></a></li>
		<li><a href="${cities}">
			<spring:message code="main.cities"/></a></li>

	</ul>
</div>
</body>