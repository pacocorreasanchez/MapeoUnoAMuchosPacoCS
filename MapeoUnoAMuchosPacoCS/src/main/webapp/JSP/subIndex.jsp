<%-- 
    Document   : subIndex
    Created on : 27 ene. 2019, 17:33:15
    Author     : paco
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="estilos" scope="application" value="${contexto}/CSS/estilo.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${estilos}" />
        <title>Index</title>
    </head>
    <body>
        
        <div id="principal">
            <h2>Elige una opción:</h2>
            <ol id="inicial">
                <li><a href="${contexto}/eleccion?op=add" class="enlace">Alta</a></li>
                <li><a href="${contexto}/eleccion?op=list" class="enlace">Listado</a></li>
                <li><a href="${contexto}/eleccion?op=delete" class="enlace">Baja</a></li>
                <li><a href="${contexto}/eleccion?op=update" class="enlace">Actualización</a></li>
            </ol>
            <p><a href="${contexto}/index.jsp" class="enlace">Men&uacute; inicial</a></p>
        </div>
</body>
</html>
