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
import quiz.entity.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "CoServlet", urlPatterns = {"/CoServlet"})
public class CoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("FormCo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("identif").equals("admin") && req.getParameter("mdp").equals("admin")) {
            req.getSession().setAttribute("typeUtil", "admin");
        } else {
            req.getSession().setAttribute("typeUtil", "normal");
        }

        List<Quiz> listeQuiz = new QuizService().ListerQuiz();
        req.setAttribute("listeQuiz", listeQuiz);
        req.getRequestDispatcher("Quiz.jsp").forward(req, resp);

    }

}
