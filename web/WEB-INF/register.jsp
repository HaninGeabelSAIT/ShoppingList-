<%-- 
    Document   : shoppingList
    Created on : 12-Oct-2022, 9:51:53 AM
    Author     : Hanin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form  action="ShoppingList" method = "post">
            User name: <input type="test" name="userName" value=${userName}>
            <input type="hidden" name="action" value="register" >
            <input type="submit" value="Register">
                   
                 </form>
    </body>
</html>
