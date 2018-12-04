<%-- 
    Document   : menu
    Created on : 25-11-2018, 14:00:30
    Author     : JNE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>

        <!--        <form action="FrontControl" method="post">
                    <h1>Vælg det ønskede menupunkt</h1><br>
                    <input type="radio" name="valg" value="list_plader">Liste over plader
                    <input type="radio" name="valg" value="list_kustner">Liste over kunstnere<br>
                    
                    <input type="submit" value="submit"><br>
                </form>-->
        <h2>Her kan du vælge mellem forskellige visninger</h2>
        <a href="FrontControl?origin=menu&valg=list_plader">Se alle plader</a><br/>
        <a href="FrontControl?origin=menu&valg=list_kunstner">Se alle kunstnere</a><br>
        <a href="createplade.jsp">Opret plade</a><br>
        <a href="createkunstner.jsp">Opret kunstner</a>
    </body>
</html>
