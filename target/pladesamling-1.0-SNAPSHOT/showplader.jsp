<%-- 
    Document   : showplader
    Created on : 25-11-2018, 20:59:00
    Author     : JNE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, logic.Plade" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plader-visning</title>
    </head>
    <body>
        <h1>Vis plader</h1>
                    <% List<Plade> plader = (List<Plade>)request.getAttribute("allplader");
        for (Plade pl : plader) {
                out.println(pl.getPladenavn()+" "+pl.getIndspillet_year()+"<br/>");
            }
        %>
    <br/>
        <a href="menu.jsp">Tilbage til Menu</a>
    </body>
</html>
