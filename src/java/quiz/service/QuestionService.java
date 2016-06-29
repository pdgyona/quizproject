/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import java.util.List;
import quiz.dao.QuestionDAO;
import quiz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionService {

    public void AjouterQuestion(Question q) {
        new QuestionDAO().AjouterQuestion(q);
    }

    public List<Question> ListerQuestions() {
        return new QuestionDAO().ListerQuestions();
    }

    public Question trouverQuestSuiv(Long idQuiz, int ordreDernQuestion) {

        // Récup liste questions du quiz, triees par ordre
        List<Question> lq = new QuestionDAO().listeQuestionsTrieesParOrdre(idQuiz);

        // Exception si aucune question
        if (lq.isEmpty()) {
            throw new RuntimeException("Aucune question dans le quiz");
        }

        // Trouve question suivante
        for (Question question : lq) {
            if (question.getOrdre() > ordreDernQuestion) {
                return question;
            }
        }

        return null;
    }

    public boolean verifSiBonneRep(long idQuiz,int ordreQuestion,int repSaisie) {

        int bonneRep = new QuestionDAO().recupBonneRep(idQuiz,ordreQuestion);
        if (bonneRep == repSaisie) {
            return true;
        }
        return false;
    }
   /****************************OPTIONNEL**************************/ 
    /**
     * 
     * @param quizId
     * @param ordreQuestionPrecedente: vaut zero
     * @return  la question suivante ou null si questionnaire terminé
     */
    public Question recherchercherQuestionSuivante(long  quizId, byte ordreQuestionPrecedente){
        QuestionDAO questionDAO = new QuestionDAO();
        
        //Recup nbre de question quiz
        long nbQuestionQuiz = questionDAO.compteQuestionParQuizId(quizId).size();
        //lister de question par ordre croissant
        List<Question> listequestion =questionDAO.ListerParQuizIdEtOrdreSuperieur(quizId, nbQuestionQuiz);
       
        /**
         * Si quiz est vide
         */
        if (nbQuestionQuiz==0) {
            throw new RuntimeException("Le quiz est vide");
        }
        
        //le quiz n'est pas vide
        
        
        
        
        for(Question question: listequestion){
            
            if(question.getOrdre() > ordreQuestionPrecedente){
                return question;
            }
            
        }
        return null;
        
        
    }

}
