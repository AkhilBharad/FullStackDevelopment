<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loginpage</title>
</head>
<body>


<%
Date date=new Date();
//out.println(date);
%>
<%=date %>
<br>

<%= getSum(4,8) %>
<%!
public static int getSum(int a, int b){
	return a+b;
}


%>

</body>
</html>