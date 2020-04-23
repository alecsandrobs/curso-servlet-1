<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/edita-empresa" var="linkServletEditaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletEditaEmpresa}" method="post">
		Nome: <input type="text" name="nome" value="${ empresa.nome }"/>
		Data: <input type="text" name="data" value="<fmt:formatDate value="${ empresa.data }" pattern="dd/MM/yyyy" />"/>
		<input type="hidden" name="id" value="${ empresa.id }" />
		<button type="submit">Editar</button>
	</form>
</body>
</html>