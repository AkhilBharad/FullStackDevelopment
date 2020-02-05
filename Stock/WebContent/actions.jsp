<%@ include file="header.jsp" %>
<jsp:useBean id="user" class="com.cts.training.bean.LoginBean" ></jsp:useBean>

<jsp:setProperty property="username" name="user" value="admin007"/>
<jsp:setProperty property="password" name="user" value="admin1234"/>

<hr>
User Details are:<br/>
Username:<jsp:getProperty property="username" name="user"/><br />
Password:<jsp:getProperty property="passwrod" name="user"/>


</body>
</html>
