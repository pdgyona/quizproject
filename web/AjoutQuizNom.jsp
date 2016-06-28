<%-- 
    Document   : AjoutQuizNom
    Created on : 24 juin 2016, 15:53:38
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
        
        <div style="color:green">Ajoutez un nom au Quiz</div>
        <form method="post" action="ajout_quiz" >
            <br> <input type="text" name="nom" />
            <input type="submit" />
            
        </form>
        </div>
    </body>
</html>
