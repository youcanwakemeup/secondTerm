package pro.sky.secondTerm.services;

import pro.sky.secondTerm.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
