<%-- 
    Document   : FormCo
    Created on : 24 juin 2016, 14:42:14
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    </head>
    <body>

        <div class="container" >
            <form method="post" action="CoServlet" >
                Identifiant: <input type="text" name="identif" /><br><br>
                Mot de passe: <input type="text" name="mdp" /><br><br>
                <input type="submit" value="Valider" class="btn-success" />
            </form>
        </div>
    </body>
</html>
