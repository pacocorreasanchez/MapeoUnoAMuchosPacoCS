<%-- 
    Document   : error
    Created on : 25 ene. 2019, 16:19:32
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/CSS/estilo.css" />
        <title>error</title>
    </head>
    <body>
    <c:set var = "error" scope = "application" value = "${listaPersonas}"/>   

    <c:if test = "${error == null}">
        <p id="error">No hay registros disponibles<p>
    </c:if>
</body>
</html>
