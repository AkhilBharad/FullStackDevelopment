<%@ include file="header.jsp" %>

<c:out value="Hello World" />

<br />
<c:set var="name" value="Aneena Thomas" />
<c:out value="${name }" />
<c:remove var="name" />
<br/>
Name:<c:out value="${name }" />

Loop:<br/>
<%---<c:forEach var="i" begin="1" end="10" step="1">

<h2>${i}</h2>
</c:forEach> --%>

<%--Loop with Array:<br/>
<c:forEach var="i" items="1,3,4,5,67,35">
<h2>${i}</h2>
</c:forEach>
--%>

<%--<c:forTokens items="Akhil-Yasmin-Harshita" delims="-" var="name">  
  <h2>${name}</h2>
</c:forTokens>  --%>


<%--<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>   
  
 <c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  --%>

<%-- <c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  --%>

<%--<c:import var="data" url="http://www.javatpoint.com"/>  
<c:out value="${data}"/>  --%>

<%-- <c:url value="/index1.jsp" var="completeURL"/>  
 <c:param name="trackingId" value="786"/>  
 <c:param name="user" value="Akhil"/>  
</c:url>  
${completeURL}  

--%>

</body>
</html>