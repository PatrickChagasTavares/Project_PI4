    <%-- 
    Document   : ProductScreenClient
    Created on : 16/10/2019, 10:20:18
    Author     : hcyrillo
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