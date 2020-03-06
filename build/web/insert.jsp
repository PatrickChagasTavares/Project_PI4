<%-- 
    Document   : insert
    Created on : 03/03/2020, 09:44:04
    Author     : lucas.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Uploader" enctype="multipart/form-data" method="post">

            <input type="file" name="file" />
            <br>
            <label>Nome: </label>
            <input type="text" name="nome"/><br>
            <label>Preço: </label>
            <input type="text" name="preco"/><br>
            <label>Descrição: </label>
            <input type="text" name="desc"/><br>
            <button type="submit">Salvar </button>
        </form>
    </body>
</html>
