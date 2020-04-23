<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List, br.com.alecsandro.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>### Lista de empresas ###</title>
</head>
<body>

	<c:if test="${ not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>

	Lista de empresas:
	<br />

	<ol>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome} | <fmt:formatDate value="${ empresa.data }" pattern="dd/MM/yyyy" />
					<a href="/gerenciador/mostra-empresa?id=${empresa.id}">Editar</a>
					<a href="/gerenciador/remove-empresa?id=${empresa.id}">Remover</a>
			</li>
		</c:forEach>
	</ol>

</body>
</html>