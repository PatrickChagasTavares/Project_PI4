<%-- 
    Document   : index
    Created on : 03/03/2020, 11:13:20
    Author     : lucas.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.project_pi4.DAO.ProductDAO" %>
<%@page import="com.project_pi4.Model.Product" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <form action="index.jsp" method="post">
            <label>Descrição: </label><br>
            <input type="text" name="desc"/><br>
            <button type="submit">Ok</button>
        </form>
            <a href="insert.jsp">Novo</a>
            <a href="update.jsp">Alterar</a>
            <a href="delete.jsp">Deletar</a>
            
    </body>
</html>