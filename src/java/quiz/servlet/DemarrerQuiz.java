/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.entity.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "JoueurQuiz", urlPatterns = {"/jouer_quiz"})
public class DemarrerQuiz extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       long id= Long.parseLong(req.getParameter("id"));
        req.getSession().setAttribute("idQuiz", id);
        req.getSession().setAttribute("score", 0);
        req.getSession().setAttribute("numQuest", null);
        
       // Quiz quiz= new QuizService().demarrerQuiz(id);
       // req.setAttribute("Quiz", quiz);
        
        req.getRequestDispatcher("QuestionSuivante").forward(req, resp);
    }

  
  

}
