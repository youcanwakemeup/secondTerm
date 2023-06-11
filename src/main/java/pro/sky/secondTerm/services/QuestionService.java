package pro.sky.secondTerm.services;

import pro.sky.secondTerm.model.Question;

import java.util.Collection;


public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question getRandomQuestion();

    Question remove(Question question);

    Collection<Question> getAll();

}
