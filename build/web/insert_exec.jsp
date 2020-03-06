<%-- 
    Document   : insert_exec
    Created on : 03/03/2020, 09:28:17
    Author     : lucas.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="MODEL.Produto"%>
<%@page import ="DAO.ProdutoDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                Produto prod = new Produto();
                ProdutoDAO prd = new ProdutoDAO();
                if(request.getParameter("nome").equals("") || request.getParameter("desc").equals("") || request.getParameter("preco").equals("")){
                    response.sendRedirect("index.jsp");
                }else{
                    prod.setNome(request.getParameter("nome"));
                    prod.setDesc(request.getParameter("desc"));
                    prod.setPreco(Double.parseDouble( request.getParameter("preco")));
                    prod.setCategoria("");
                    prd.Insert(prod);
                    response.sendRedirect("index.jsp");
                }
                
            }catch(Exception error){
                throw new RuntimeException("insert_exec Error: "+ error);
            }
            
            %>
    </body>
</html>
