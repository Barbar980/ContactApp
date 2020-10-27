<%-- 
    Document   : index
    Created on : 26 paź 2020, 22:22:56
    Author     : Barbar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login - Contact Application</title>
        <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
    </head>
    <s:url var="url_bg" value="/static/images/bg.jpg"/>
    <body background="${url_bg}">
        <table border="1" width="80%" align="center">
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    <h1>Contact App - Project</h1>
                </td>                
            </tr>
            <tr>
                <td height="25px"> 
                    <%-- Menu --%>
                </td>   
            </tr>
            <tr>
                <td height="350px">
                    <%-- Page Content Area --%>
                </td> 
            </tr>
            <tr>
                <td height="25px"> 
                    <%-- Footer --%>
                </td>   
            </tr>
            
            
        </table>
    </body>
</html>
