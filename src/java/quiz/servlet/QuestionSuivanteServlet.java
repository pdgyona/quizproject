/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
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
@WebServlet(name = "QuestionSuivante", urlPatterns = {"/QuestionSuivante"})
public class QuestionSuivanteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer numQuestAct = (Integer) req.getSession().getAttribute("numQuest");

        if (numQuestAct == null) {
            numQuestAct = 0;
        }
        long idQuiz = (Long) req.getSession().getAttribute("idQuiz");
        Question q = new QuestionService().trouverQuestSuiv(idQuiz, numQuestAct);

        if (q != null) {
            req.getSession().setAttribute("numQuest", q.getOrdre());
        }

        if (q == null) {
            //---Fin du quiz---
            req.getRequestDispatcher("FinDuQuiz.jsp").forward(req, resp);

        }

        req.setAttribute("Question", q);

        req.getRequestDispatcher("UnQuiz.jsp").forward(req, resp);
    }

    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer numQuestAct = (Integer) req.getSession().getAttribute("numQuest");

        int reponse = Integer.parseInt(req.getParameter("choix"));
        long idQuizz = (long) req.getSession().getAttribute("idQuiz");
        boolean resultat = new QuestionService().verifSiBonneRep(idQuizz, numQuestAct, reponse);
        int score = (int) req.getSession().getAttribute("score");

        if (resultat == true) {
            score++;
            req.getSession().setAttribute("score", score);

        }

        if (numQuestAct == null) {
            numQuestAct = 0;
        }
        long idQuiz = (Long) req.getSession().getAttribute("idQuiz");
        Question q = new QuestionService().trouverQuestSuiv(idQuiz, numQuestAct);

        if (q != null) {
            req.getSession().setAttribute("numQuest", q.getOrdre());

        }

        if (q == null) {
            //----Fin du quiz---
            req.setAttribute("score", score);
            req.getRequestDispatcher("FinDuQuiz.jsp").forward(req, resp);

        }

        req.setAttribute("Question", q);

        req.getRequestDispatcher("UnQuiz.jsp").forward(req, resp);

    }

}
