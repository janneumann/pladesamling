<%-- 
    Document   : createplade
    Created on : 28-11-2018, 20:17:58
    Author     : JNE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create Plade!</h1>
        <form action="FrontControl" method="post">
           <input type="hidden" name="origin" value="createplade"/>
            Plade Titel:
            <input type="text" name="pladenavn"><br>
            Indspillet År:
            <input type="text" name="indspillet_year"><br>
            Kunstner ID:
            <input type="number" name="kunstner_id"><br>
            
            <input type="submit" value="submit"><br>
        </form>
    </body>
</html>
