
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="ROBOTS" content="NOARCHIVE"> 
        <meta name="generator" content="NetBeans"> 
        <meta name="referrer" content="always"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Listado</title>
        <link rel="stylesheet" type="text/css" href="${estilos}" />
    </head>
    <body>

        <div id="principal">
            <h2>Listado de personas</h2>
            <c:if test = "${listaPersonas == null || listaPersonas.size() < 0}">
                <h1>No hay registros en la tabla</h1>
            </c:if>
            <ul>
                <c:forEach var="persona" items="${listaPersonas}">
                    <pre>
                        Nombre: ${persona.nombre}
                        Libros:
                        <c:forEach var="libro" items="${persona.libros}">
                            ${libro.titulo}
                        </c:forEach>
                    </pre>
                </c:forEach>
            </ul>
            <br />
            <p><a href="${contexto}/JSP/subIndex.jsp" class="enlace">Men&uacute; inicial</a></p>
        </div>


    </body>
</html>