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
        <title>Actualizar</title>
        <link rel="stylesheet" type="text/css" href="${estilos}" />
    </head>
    <body>

        <div id="principal">
            <h2>Actualizaci&oacute;n de datos</h2>
            <form method="post" action="conclusion?op=update">

                <table>
                    <fieldset>
                        <legend>Datos persona: </legend>

                        <input type="hidden" name="id" value="${personas.idPersona}" readonly/>

                        <tr>
                            <td>Nombre</td>
                            <td><input type="text" name="nombre" value="${personas.nombre}"/></td>
                        </tr>

                    </fieldset>                
                </table>

                <table>
                    <fieldset>
                        <legend>Libros: </legend>
                        <c:forEach var="libro" varStatus="contador" items="${personas.libros}">
                            <tr>
                            <input type="hidden" name="idLibro${contador.index + 1}" value="${libro.idLibro}"/>
                            <td>Libro ${contador.index + 1}: </td>
                            <td><input type="text" name="libro${contador.index + 1}" value="${libro.titulo}"/></td>
                            </tr>
                        </c:forEach>

                        <!--Este forEach añade campos vacios para insertar nuevos libros, tantos como haga falta para llegas a 3-->
                        <c:forEach var="contador" begin="1" end="${3 - (personas.libros.size())}">		    
                            <tr>
                                <td>Libro ${personas.libros.size()+contador}</td>
                                <td><input type="text" name="libro${personas.libros.size()+contador}"/></td>
                            </tr>
                        </c:forEach>


                    </fieldset>
                    <tr>

                        <td colspan="2"><input type="submit" name="enviar" value="Enviar" class="boton" /></td>
                    </tr>
                </table>

            </form>
        </div>


    </body>
</html>