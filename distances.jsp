
<%-- 
    Document   : Distances
    Created on : Apr 29, 2015, 11:15:05 AM
    Author     : It Store
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="o" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>distances</title>
    </head>
    <body>
        <b>shortest path is </b> <o:out value="${shortest}"></o:out>
        <h1>Bus adjacensies</h1>
            
            <o:out value="${mygraph}"></o:out><br><br>
            <o:forEach var="distances" items="${mymap}">
                  
                
             <o:out value="${distances.key}"> </o:out>
             <o:out value="${distances.value}"> </o:out>    
            </o:forEach>
        
    </body>
</html>
