package pro.sky.secondTerm.services;

import org.springframework.stereotype.Service;
import pro.sky.secondTerm.Exceptions.RandomAmountGreaterThanTotal;
import pro.sky.secondTerm.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    QuestionService questionService;

    Random random = new Random();
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
