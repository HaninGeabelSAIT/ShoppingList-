<%-- 
    Document   : register
    Created on : 12-Oct-2022, 9:51:33 AM
    Author     : Hanin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register</title>
    </head>
    
        <h1>Shopping List</h1>
        Hello ${user.userName}<br>
        <a href="<c:url value='ShoppingList?logout' />">LogOut </a> 
        <h3>List</h3>
        <form action="ShoppingList" method="post">
        Add item: <input type="text" name="item" value=${item}>
        <input type="submit"  value="Add Item"> ${msg}<br>
        <input type="hidden" name="action" value="add">
        </form>
        
         <form action="ShoppingList" method="post">
        <c:forEach items="${user.listItem}" var="item">
            <table>
                <tr>
                  <input type="radio" name="item" value=${item}> ${item}   
                </tr>
            </table>
             
        </c:forEach>
              <input type="submit" value="Delete">
        <input type="hidden" name="action" value="delete">
        </form>
        <br>
      
        
        
      
      
        
    

