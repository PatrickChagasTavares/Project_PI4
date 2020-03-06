<%-- 
    Document   : delete_exec
    Created on : 03/03/2020, 09:28:38
    Author     : lucas.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                ProdutoDAO prd = new ProdutoDAO();
                prd.Delete(Integer.parseInt(request.getParameter("id")));
                      response.sendRedirect("index.jsp");
                
                
            }catch(Exception error){
                throw new RuntimeException("delete_exec Error: "+ error);
            }
            
            %>
    </body>
</html>
