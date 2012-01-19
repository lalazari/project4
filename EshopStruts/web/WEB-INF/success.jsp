<%-- 
    Document   : success
    Created on : 9 Ιαν 2012, 9:04:46 μμ
    Author     : lalas
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Success</title>
    </head>
    <body>
        <h1>Congratulations!</h1>
        <p>You have successfully logged in.</p>

        <p>Your name is: <bean:write name="LoginForm" property="name" />.</p>

        <p>Your email address is: <bean:write name="LoginForm" property="email" />.</p>
    </body>
    
    <html:form action="/esho">
       
    <html:submit value="BUY NOW" />
    
    </html:form>

    
    



</html>
