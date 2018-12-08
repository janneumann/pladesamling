<%-- 
    Document   : menu
    Created on : 25-11-2018, 14:00:30
    Author     : JNE
--%>

<%@page import="logic.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>

     <% if (request.getAttribute("user") == null) { %>
     Du skal først logge ind <a <div>href</div>="login.jsp">Gå til login siden</a>
     <% } else {
     User user = (User) request.getAttribute("user");
     %>

      //  <%@include file="navbar.jsp"%>
        
        <h2>Her kan du vælge mellem forskellige visninger</h2>
        <a href="FrontControl?origin=menu&valg=list_plader">Se alle plader</a><br/>
        <a href="FrontControl?origin=menu&valg=list_kunstner">Se alle kunstnere</a><br>
        <a href="createplade.jsp">Opret plade</a><br>
        <a href="createkunstner.jsp">Opret kunstner</a>
    </body>
</html>
