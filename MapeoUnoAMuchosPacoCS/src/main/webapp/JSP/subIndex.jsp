<%-- 
    Document   : subIndex
    Created on : 27 ene. 2019, 17:33:15
    Author     : paco
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilo.css" />
        <title>Index</title>
    </head>
    <body>
    <center>
        
        <div id="principal">
            <h2>Elige una opción:</h2>
            <ol id="inicial">
                <li><a href="${contexto}/eleccion?op=add" class="enlace">Alta</a></li>
                <li><a href="${contexto}/eleccion?op=list" class="enlace">Listado</a></li>
                <li><a href="${contexto}/eleccion?op=delete" class="enlace">Baja</a></li>
                <li><a href="${contexto}/eleccion?op=update" class="enlace">Actualización</a></li>
            </ol>
        </div>
    </center>
</body>
</html>
