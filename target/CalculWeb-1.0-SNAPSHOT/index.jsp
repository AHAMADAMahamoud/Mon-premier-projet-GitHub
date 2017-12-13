<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<body>
	<form action="calculservlet" method="post">
		<table>
			<tr>
				<td>A:</td>
				<td><input type="text" name="a"  /></td>
				<td>B:</td>
				<td><input type="text" name="b"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Somme" name="action" /></td>
				<td><input type="submit" value="Produit" name="action" /></td>
			</tr>
			<tr>
				<td>Résultat:</td><td>${result}</td>
			</tr>
		</table>
	</form>
</body>
</html>