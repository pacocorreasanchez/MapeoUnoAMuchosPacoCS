<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilo.css" />
    </head>
    <body>

        <div id="principal">
            <h2>Actualizaci&oacute;n de datos</h2>
            <form method="post" action="conclusion?op=update">

                <table>
                    <fieldset>
                        <legend>Datos persona: </legend>
                        <tr>
                            <td>ID</td>
                            <td><input type="text" name="id" value="${personas.idPersona}" readonly/></td>
                        </tr>
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
                                <td>Libro ${contador.index + 1}: </td>
                                <td><input type="text" name="libro${contador.index + 1}" value="${libro.titulo}"/></td>
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