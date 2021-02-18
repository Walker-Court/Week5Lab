<%-- 
    Document   : login
    Created on : Feb 16, 2021, 1:50:24 AM
    Author     : WCour
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" name="user" value="${username}"> <br>
            Password: <input type="text" name="pass" value="${password}"> <br>
        <input type="submit" value="Log in">
        </form>
        <p name="message"></p>
        
    </body>
</html>
