<%-- 
    Document   : index
    Created on : 25 ene. 2019, 17:31:15
    Author     : paco
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="eleccion" method="post">
            <button name="opSL" value="set">SET</button>
            <button name="opSL" value="list">LIST</button>
        </form>
    </body>
</html>
