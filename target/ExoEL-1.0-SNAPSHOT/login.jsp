<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: meder
  Date: 2/10/2022
  Time: 1:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel='stylesheet' type='text/css' href='login.css'/>
</head>
<center>
    <body>
    <h1>Veuillez vous authentifier</h1>
    <form method='post' action='LoginServlet'>
        <input name='txtLogin' type='text' value='${login}'/> <br/>
        <input name='txtPwd' type='password' value='<%=session.getAttribute("password")%>'/> <br/>
        <input type='submit' value="Se connecter"/> <br/>
    </form>

    <h2 style="color: red">${messageMdp}</h2>
    </body>
</center>
</html>
