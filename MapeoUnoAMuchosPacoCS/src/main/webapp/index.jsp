<%-- 
    Document   : index
    Created on : 25 ene. 2019, 17:31:15
    Author     : paco
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="contexto" scope="application" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="ROBOTS" content="NOARCHIVE"> 
        <meta name="generator" content="NetBeans"> 
        <meta name="referrer" content="always"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SET</title>
    </head>
    <body>
    <center>
        <div id="principal">
            <h1>Elige la única opción que por ahora hay disponible: </h1>
            <form action="eleccion" method="post">
                <table>
                    <tr>
                        <td>Set muestra los libros sin orden</td>
                        <td><button name="opSL" value="set">SET</button></td>
                    </tr>
                </table>
            </form>
        </div>
    </center>
</body>
</html>
