/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.entity.Question;
import quiz.entity.Quiz;
import quiz.service.QuestionService;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutQuiz", urlPatterns = {"/ajout_quiz"})
public class AjoutQuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.sendRedirect("AjoutQuizNom.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom=req.getParameter("nom");
        Quiz quiz=new Quiz();
        quiz.setNom(nom);
        new QuizService().AjouterQuiz(quiz);
        
        List<Question> listeQuestion=new QuestionService().ListerQuestions();
        req.setAttribute("listeQuestion", listeQuestion);
        req.getSession().setAttribute("Quiz", quiz);
        req.getRequestDispatcher("RetourVersListeQuiz").forward(req, resp);
    }
   

}
