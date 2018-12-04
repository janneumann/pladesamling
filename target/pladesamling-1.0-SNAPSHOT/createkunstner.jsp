<%-- 
    Document   : createkunstner
    Created on : 01-12-2018, 20:21:35
    Author     : JNE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Opret kunstner Page</title>
    </head>
    <body>
        <h1>Create Kunstner!</h1>
        <form action="FrontControl" method="post">
           <input type="hidden" name="origin" value="createkunstner"/>
            Kunstnernavn:
            <input type="text" name="kunstner_navn"><br>
            Kunstnerens ophavsland:
            <input type="text" name="country"><br>
                        
            <input type="submit" value="submit"><br>
        </form>
    </body>
</html>
