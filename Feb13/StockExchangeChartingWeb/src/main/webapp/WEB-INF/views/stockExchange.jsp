<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock Price Operations</title>
</head>
<body>
<c:url var="userUrl" value="/stockExchange/save"></c:url>
<form:form action="${userUrl }" modelAttribute="stockExchange">
<table>
	<c:if test="${!empty stockExchange.stockexchangename}">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true"></form:input>
						<form:hidden path="id" /></td>
				</tr>
			</c:if>
		<tr>
			<td><form:label path="stockexchangename">Exchange Name</form:label></td>
			<td><form:input path="stockexchangename"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="brief">Brief</form:label></td>
			<td><form:input path="brief"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="address">Contact Address</form:label></td>
			<td><form:input path="address"></form:input></td>
		</tr>
		
		<tr>
			<td><form:label path="remarks">Remarks</form:label></td>
			<td><form:input path="remarks"></form:input></td>
		</tr>
		<tr>
				<td></td>
				<td><c:if test="${empty stockExchange.stockexchangename }">
						<input type="submit" value="submit">
					</c:if> <c:if test="${!empty stockExchange.stockexchangename }">
						<input type="submit" value="update">
					</c:if></td>
			</tr>
	</table>
</form:form>
<br>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>ExchangeName</th>
			<th>Brief</th>
			<th>Address</th>
			<th>Remarks</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="stockExchange" items="${list}">
			<tr>
				<td>${stockExchange.id }</td>
				<td>${stockExchange.stockexchangename }</td>
				<td>${stockExchange.brief }</td>
				<td>${stockExchange.address }</td>
				<td>${stockExchange.remarks }</td>
				<td><a href="<c:url value='/stockExchange/remove/${stockExchange.id }'/>">Remove</a>|
					<a href="<c:url value='/stockExchange/update/${stockExchange.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>