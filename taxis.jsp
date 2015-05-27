
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="o" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taxis!!!!</title>
    </head>
    <body>
         <o:forEach var="taxi" items="${taxis}">
             <o:out value="${taxi.getRegNo()}"></o:out>
             
         </o:forEach>
        
            
       
       
       
    </body>
</html>
