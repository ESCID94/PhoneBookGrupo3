<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">

<spring:url value="resources/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />
<spring:url value="resources/css/custom.css" var="custom" />
<link href="${custom}" rel="stylesheet" />

<title>LISTADO DE PERSONAS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE PERSONAS</h1>
		<p>Estos son los datos de la tabla de personas</p>

		<table border="1">
			<tr>
				<th>Nº</th>
				<th>persona</th>
				<th>nombre</th>
				<th>apellido1</th>
				<th>apellido2</th>
			</tr>

			<c:forEach var="persona" items="${personaList}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${persona.name}</td>
					<td><em>${persona.apellido1}</em></td>
					<td>${persona.apellido2}</td>
					<td><a href="edit?idpersona=${persona.idpersona}">Modificar</a> | <a
						href="delete?idpersona=${persona.idpersona}">Eliminar</a></td>
				</tr>
			</c:forEach>
		</table>
		<p>
			<a href="new">Haz clic para crear una NUEVA PERSONA</a> 
		</p>
	</div>
</body>
</html>