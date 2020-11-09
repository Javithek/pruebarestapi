<%-- 
    Document   : edit
    Created on : 09/11/2020, 11:14:40 AM
    Author     : K3iner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        
        <title>Edit Book</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Update Libro</h4>
                </div>
            </div>
            <div class="card-body">
                <form method="POST">
                    <label for="aut">Author</label>
                    <input type="text" id="aut" name="aut" class="form-control" value="${book.author}">
                    <label for="tit">Titulo</label>
                    <input type="text" id="tit" name="tit" class="form-control" value="${book.titulo}">
                    <input type="submit" value="Actualizar" class="btn btn-success">
                    <a href="index.htm">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
