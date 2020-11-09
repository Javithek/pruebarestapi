<%-- 
    Document   : add
    Created on : 09/11/2020, 10:06:20 AM
    Author     : K3iner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Add Book</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Agregar Libro</h4>
                </div>
            </div>
            <div class="card-body">
                <form method="POST">
                    <label for="aut">Author</label>
                    <input type="text" id="aut" name="aut" class="form-control">
                    <label for="tit">Titulo</label>
                    <input type="text" id="tit" name="tit" class="form-control">
                    <input type="submit" value="Nuevo" class="btn btn-success">
                    <a href="index.htm">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
