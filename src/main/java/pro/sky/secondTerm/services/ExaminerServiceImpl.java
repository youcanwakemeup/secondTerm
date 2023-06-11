package pro.sky.secondTerm.services;

import org.springframework.stereotype.Service;
import pro.sky.secondTerm.exceptions.RandomAmountGreaterThanTotal;
import pro.sky.secondTerm.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();
        if (amount > questionService.getAll().size() || amount < 0) {
            throw new RandomAmountGreaterThanTotal("Неккоретное количество!");
        }
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }

        return questions;
    }
}
