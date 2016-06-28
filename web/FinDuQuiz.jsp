<%-- 
    Document   : FinDuQuiz
    Created on : 27 juin 2016, 18:20:14
    Author     : Admin
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
        <h1 style="color:greenyellow;background-color:pink;">Fin du quiz!</h1>
        <div style="color:red;font-size: 20px"> Score: ${score}</div>
        <br><a href="RetourVersListeQuiz">Retour vers liste des quiz</a>

        </div>
    </body>
</html>
