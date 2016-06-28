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
import quiz.entity.Question;
import quiz.service.QuestionService;

/**
 *
 * @author admin
 */
@WebServlet(name = "RetourVersListeQuestions", urlPatterns = {"/RetourVersListeQuestions"})
public class RetourVersListeQuestions extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Question> listeQuestion = new QuestionService().ListerQuestions();
        req.setAttribute("listeQuestion", listeQuestion);

        
        req.getRequestDispatcher("QuizQuestion.jsp").forward(req, resp);
    }
    
}
