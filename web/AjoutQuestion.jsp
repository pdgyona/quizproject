<%-- 
    Document   : AjoutQuestion
    Created on : 27 juin 2016, 09:38:01
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
           <h1>Ajouter une question</h1>
        <form method="post" action="ajout_question">
             Question: <input type="text" name="titre" /> <br><br>
            

            Reponse 1: <input type="text" name="rep1" /> <br><br>
            Reponse 2: <input type="text" name="rep2" /> <br><br>
            Reponse 3: <input type="text" name="rep3" /> <br><br>
            Reponse 4: <input type="text" name="rep4" /> <br><br>
            ordre: <input type="text" name="ordre" /> <br><br>
            Numero Reponse correcte: <input type="number" name="numrepco" /> <br><br>
            <input type="submit" value="Envoyer" class="btn btn-success" /><br>
        </form>
       </div>
    </body>
</html>
