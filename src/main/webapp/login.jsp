<%-- 
    Document   : login
    Created on : 08-12-2018, 10:47:41
    Author     : JNE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="Login" method="POST">
            <input type="text" name="username" placeholder="username" /><br>
            <input type="password" name="password" placeholder="password" /><br>
            <input type="submit" value="log in">
        </form>
    </body>
</html>
