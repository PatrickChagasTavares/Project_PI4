<%-- 
    Document   : delete
    Created on : 03/03/2020, 09:44:22
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
        <form action="delete_exec.jsp" method="post">
           <label>Id: </label>
            <input type="text" name="id" value="<%=request.getParameter("id")%>"/><br>
            
              <button type="submit">Deletar </button>
        </form>
    </body>
</html>
