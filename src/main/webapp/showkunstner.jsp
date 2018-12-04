<%-- 
    Document   : showkunstner
    Created on : 25-11-2018, 20:59:16
    Author     : JNE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, logic.Kunstner" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kunstner-Visning</title>
    </head>
    <body>
        <h1>Show kunstner</h1>
                    <% List<Kunstner> kunstner = (List<Kunstner>)request.getAttribute("allkunstner");
        for (Kunstner k : kunstner) {
                out.println(k.getKunsternavn()+ " "+k.getCountry()+"<br/>");
            }
        %>
        
    </body>
</html>
