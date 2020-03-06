<%-- 
    Document   : index
    Created on : 03/03/2020, 11:13:20
    Author     : lucas.paiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.ProdutoDAO" %>
<%@page import="MODEL.Produto" %>
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
        
        <%
//            try{
//                out.print("<table>");
//                out.print("<tr>");
//                out.print("<th>Código</th><th>Descrição</th><th>Preço</th><th>Editar</th><th>Excluir</th>");
//                ProdutoDAO prd = new ProdutoDAO();
//                if(request.getParameter("categoria") =="" || request.getParameter("") == null){
//                    ArrayList<Produto> lista = prd.GetAll();
//                    for(int num=0;num<lista.size();num++){
//                        out.print("<tr>");
//                        out.print("<td>"+lista.get(num).getNome()+"</td>");
//                        out.print("<td>"+lista.get(num).getCategoria()+"</td>");
//                        out.print("<td>"+lista.get(num).getDesc()+"</td>");
//                        out.print("<td>"+lista.get(num).getPreco()+"</td>");
//                        out.print("<td><a hreft='update.jsp?id="+lista.get(num).getId()+"&desc="+lista.get(num).getDesc()+"&nome="+lista.get(num).getNome()+"&preco="+lista.get(num).getPreco()+"&categoria="+lista.get(num).getCategoria()+"'>Alterar</a></td>");
//                        out.print("<td><a hreft='delete.jsp?id="+lista.get(num).getId()+"&desc="+"'>Excluir</a></td>");  
//                        out.print("</tr>");
//                    }
//                }else{
//                     ArrayList<Produto> lista = prd.GetByCategory(request.getParameter("categoria"));
//                    for(int num=0;num<lista.size();num++){
//                        out.print("<tr>");
//                        out.print("<td>"+lista.get(num).getNome()+"</td>");
//                        out.print("<td>"+lista.get(num).getCategoria()+"</td>");
//                        out.print("<td>"+lista.get(num).getDesc()+"</td>");
//                        out.print("<td>"+lista.get(num).getPreco()+"</td>");
//                        out.print("<td><a hreft='update.jsp?id="+lista.get(num).getId()+"&desc="+lista.get(num).getDesc()+"&nome="+lista.get(num).getNome()+"&preco="+lista.get(num).getPreco()+"&categoria="+lista.get(num).getCategoria()+"'>Alterar</a></td>");
//                        out.print("<td><a hreft='delete.jsp?id="+lista.get(num).getId()+"&desc="+"'>Excluir</a></td>");  
//                        out.print("</tr>");
//                    
//                }
//                out.print("</tr>");
//            }
//            }catch(Exception error){
//                throw new RuntimeException("Index Error: "+error);
//            }
            %>
            <a href="insert.jsp">Novo</a>
    </body>
</html>
