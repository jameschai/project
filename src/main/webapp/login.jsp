<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/30
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
    <h1>Struts 2 Hello World Example</h1>

    <s:form action="Welcome">
        <s:textfield name="username" label="Username" />
        <s:password name="password" label="Password" />
        <s:submit />
    </s:form>
  </body>
</html>
