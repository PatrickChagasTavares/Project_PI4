<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer  style="background-color: #141014">
    <div id='divFooter'>
        <div class="relative">
            Developed by: <a href="${pageContext.request.contextPath}/about">CodeSquad</a> 
        </div>
        <div class="location">
            <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");%>
            © São Paulo,Brasil  <%= df.format(new java.util.Date()
            )%>
        </div>
    </div>    
</footer>
