/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.entity.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author Admin
 */
@WebServlet(name = "RetourVersListeQuiz", urlPatterns = {"/RetourVersListeQuiz"})
public class RetourVersListeQuiz extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Quiz> listeQuiz = new QuizService().ListerQuiz();
        req.setAttribute("listeQuiz", listeQuiz);
        req.getRequestDispatcher("Quiz.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Quiz> listeQuiz = new QuizService().ListerQuiz();
        req.setAttribute("listeQuiz", listeQuiz);
        req.getRequestDispatcher("Quiz.jsp").forward(req, resp);
    }

}
