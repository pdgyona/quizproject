/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import quiz.entity.Quiz;

/**
 *
 * @author admin
 */
public class QuizDAO {

    public Quiz DemarrerQuiz(long idQuiz) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Quiz q = em.find(Quiz.class, idQuiz);
        return q;
    }

    public void AjouterQuiz(Quiz quiz) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(quiz);
        em.getTransaction().commit();

    }

    public void CalculerScore() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

    }

    public List<Quiz> ListerQuiz() {
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
         Query query=em.createQuery("SELECT q FROM Quiz q");
        return query.getResultList();
    }
}
