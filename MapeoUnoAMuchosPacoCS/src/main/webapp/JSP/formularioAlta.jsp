<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="ROBOTS" content="NOARCHIVE"> 
        <meta name="generator" content="NetBeans"> 
        <meta name="referrer" content="always"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Insertar</title>
        <link rel="stylesheet" type="text/css" href="${estilos}" />
    </head>
    <body>

        <div id="principal">
            <h2>Insertar  datos</h2>
            <form method="post" action="control?op=add">
                <table>
                    <fieldset>
                        <legend>Datos persona: </legend>
                        <tr>
                            <td>Nombre</td>
                            <td><input type="text" name="nombre" /></td>
                        </tr>

                    </fieldset>                
                </table>

                <table>
                    <fieldset>
                        <legend>Libros: </legend>
                        <tr>
                            <td>Libro 1</td>
                            <td><input type="text" name="libro1" /></td>
                        </tr>
                        <tr>
                            <td>Libro 2</td>
                            <td><input type="text" name="libro2" /></td>
                        </tr>
                        <tr>
                            <td>Libro 3</td>
                            <td><input type="text" name="libro3" /></td>
                        </tr>


                    </fieldset>
                    <tr>
                        <td colspan="2"><input type="submit" name="enviar" value="Enviar" class="boton" /></td>
                    </tr>
                </table>
            </form>
        </div>


    </body>
</html>