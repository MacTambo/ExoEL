<%--
  Created by IntelliJ IDEA.
  User: Arthur
  Date: 14/02/2022
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Catalogue</title>
    <link rel='stylesheet' type='text/css' href='login.css'/>
</head>
<center>
<body>
<form action="ArticleServlet" method="post">
    <input name="btnpre" type="submit" value="Article précédent">
    <input name="btnsuiv" type="submit" value="Article suivant">
</form>
<h1>${articleAff}</h1>
</body>
</center>
</html>
