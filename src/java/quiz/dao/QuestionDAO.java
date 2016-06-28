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
import quiz.entity.Question;
import quiz.entity.Quiz;

/**
 *
 * @author admin
 */
public class QuestionDAO {

    public void AjouterQuestion(Question q) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(q);
        em.getTransaction().commit();
    }

    public List<Question> ListerQuestions() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT q FROM Question q").getResultList();
    }

    public void RepondreQuestionSuivante() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

    }

 
    
    public List<Question> listeQuestionsTrieesParOrdre(Long idQuiz) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query=em.createQuery("SELECT q FROM Question q WHERE q.quiz.id=:q ORDER BY q.ordre" );
        query.setParameter("q", idQuiz);
        return query.getResultList();
    }

    public int recupBonneRep(long idQuiz,int ordreQuestion) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query=em.createQuery("SELECT q.numRepCorrecte FROM Question q WHERE q.quiz.id=:q AND q.ordre=:ordre" );
        query.setParameter("q", idQuiz); 
        query.setParameter("ordre", ordreQuestion);
        return (int)query.getSingleResult();
        
    }
  
}
