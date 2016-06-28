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
@WebServlet(name = "AjoutQuestion", urlPatterns = {"/ajout_question"})
public class AjoutQuestion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.sendRedirect("AjoutQuestion.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = req.getParameter("titre");
        String quest = req.getParameter("question");
        String rep1 = req.getParameter("rep1");
        String rep2 = req.getParameter("rep2");
        String rep3 = req.getParameter("rep3");
        String rep4 = req.getParameter("rep4");
        int numrepco = Integer.parseInt(req.getParameter("numrepco"));
        
        Question question=new Question();
        Quiz quiz=(Quiz)req.getSession().getAttribute("Quiz");
        question.setTitre(titre);
        question.setQuiz(quiz);question.setRep1(rep1);question.setRep2(rep2);
        question.setRep3(rep3);question.setRep4(rep4);
        question.setNumRepCorrecte(numrepco);
        
        new QuestionService().AjouterQuestion(question);
        req.getRequestDispatcher("RetourVersListeQuestions").forward(req, resp);
    }

}
