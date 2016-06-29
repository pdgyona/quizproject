<%-- 
    Document   : Quiz
    Created on : 24 juin 2016, 15:30:09
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
        <nav class="navbar  btn-lg btn-success  navbar-fixed-top">
        <div class="container">
            
        <h1>Welcome to Oscar Land Quiz</h1><br>
        <h3>Liste des Quiz</h3>
        <table>
            <tr>
                
        <c:forEach items="${listeQuiz}" var="lq">
            <a href="ajout_question?id2=${lq.id}">${lq.nom}</a> &nbsp;&nbsp;<a href=jouer_quiz?id=${lq.id}>Jouer</a> <br>
        </c:forEach>
        <c:choose >
            <c:when test="${typeUtil=='admin'}"   >
              <br>  <a href="ajout_quiz">Ajouter un quiz</a>  
            </c:when>
        </c:choose>
              </tr>
        </table>
    </div>
        </nav>

    </body>
</html>
