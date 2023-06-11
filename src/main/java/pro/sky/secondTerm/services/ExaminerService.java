package pro.sky.secondTerm.services;

import pro.sky.secondTerm.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
