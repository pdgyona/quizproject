<%-- 
    Document   : UnQuiz
    Created on : 27 juin 2016, 12:06:59
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
        <div class="container">
        <h1>Debut du quiz</h1>
        <div> ${Question.titre}</div>
        <form method="post" action="QuestionSuivante">
            <div> ${Question.rep1}<input type="radio" name="choix" value="1" /></div>
            <div> ${Question.rep2} <input type="radio" name="choix" value="2"/></div>
            <div> ${Question.rep3} <input type="radio" name="choix" value="3"/></div>
            <div> ${Question.rep4} <input type="radio" name="choix" value="4" /></div> 
            <input type="submit"/>
        </form>
        <a href="QuestionSuivante">Question suivante</a>
        </div>
    </body>
</html>
