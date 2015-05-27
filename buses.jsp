<%-- 
    Document   : Buses
    Created on : Apr 29, 2015, 11:15:05 AM
    Author     : It Store
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="o" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <o:out value="${mysrc}">
            
        </o:out>
        <o:out value="${mydest}">
            
        </o:out>
        <h1>User List</h1>
        <table>
            <tr>
                <th>bus name</th><th> bus point </th> <th>fair</th>
            </tr>
            
            <o:forEach var="buses" items="${users}">
                <tr>
                    <td>
                        <o:out value="${buses.getId().getBusId()}">
                            
                        </o:out>
                    </td>
                    
                    <td>
                        <o:out value="${buses.getId().getPoint()}">
                            
                        </o:out>
                    </td>
                    
                    <td>
                        <o:out value="${buses.getFare()}">
                            
                        </o:out>
                    </td>
                </tr>
            </o:forEach>
        </table>
    </body>
</html>
