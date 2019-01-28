<%-- 
    Document   : index
    Created on : 25 ene. 2019, 17:31:15
    Author     : paco
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="contexto" scope="application" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LIST O SET</title>
    </head>
    <body>
    <center>
        <div id="principal">
            <h1>Elige una de las dos opciones: </h1>
            <form action="eleccion" method="post">
                <table>
                    <tr>
                        <td>Set muestra los libros sin orden</td>
                        <td><button name="opSL" value="set">SET</button></td>
                    </tr>
                    <tr>
                        <td>List muestra los libros con el orden introducido</td>
                        <td><button name="opSL" value="list">LIST</button></td>
                    </tr>
                </table>
            </form>
        </div>
    </center>
    </body>
</html>
