<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!--link rel="stylesheet" type="text/css" href="../css/css.css"-->
        
        <title>Welcome to Spring Web MVC project</title>
    </head>
   
    
    <body>
        
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-while">
                    <a href="add.htm" style="text-decoration: none;color:white; padding:0.5% 0.5% 0.5% 0.5%; box-shadow: 1px 1px 3px;">Nuevo Libro</a>
                </div>
                <div class="card-body">
                    <table>
                        <t:head>
                            <tr>
                                <th>Author</th>
                                <th>Titulo</th>
                            </tr>
                        </t:head>
                        <t:body>
                            <c:forEach var="b" items="${books}">
                               <tr>
                                    <td>${b.author}</td>
                                    <td>${b.titulo}</td>
                                    <td>
                                        <a href="edit.htm?id=${b.id}" class="btn btn-warning">Editar</a>
                                        <a class="btn btn-danger">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </t:body>
                    </table>
                </div>
                    
            </div>
            
        </div>
        
    </body>
</html>
