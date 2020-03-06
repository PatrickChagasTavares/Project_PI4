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
        <form action="update_exec.jsp" method="post">
            <input type="file" formaction="${pageContext.request.contextPath}/Uploader" name="file" value="select image..." formenctype="ultipart/form-data"/>
            <br>
            <label>Id: </label>
            <input type="text" name="id" value="<%=request.getParameter("id")%>"/><br>
            <label>Nome: </label>
            <input type="text" name="nome" value="<%=request.getParameter("nome")%>"/><br>
            <label>Categoria: </label>
            <input type="text" name="categoria" value="<%=request.getParameter("categoria")%>"/><br>
            <label>Preço: </label>
            <input type="text" name="preco" value="<%=request.getParameter("preco")%>"/><br>
            <label>Descrição: </label>
              <input type="text" name="desc" value="<%=request.getParameter("desc")%>"/><br>
              <button type="submit">Salvar </button>
        </form>
    </body>
</html>
