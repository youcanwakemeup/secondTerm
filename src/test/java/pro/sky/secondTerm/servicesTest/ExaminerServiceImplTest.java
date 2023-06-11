package pro.sky.secondTerm.servicesTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pro.sky.secondTerm.Exceptions.RandomAmountGreaterThanTotal;
import pro.sky.secondTerm.Question;
import pro.sky.secondTerm.services.ExaminerService;
import pro.sky.secondTerm.services.ExaminerServiceImpl;
import pro.sky.secondTerm.services.QuestionService;

import java.util.*;

import static org.mockito.Mockito.when;
import static pro.sky.secondTerm.ConstantsForTests.*;

public class ExaminerServiceImplTest {
    @Mock
    private QuestionService questionService;
    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldReturnCorrectAmountOfQuestions() {
        int amount = 3;
        when(questionService.getAll()).thenReturn(questionsForTests);
        when(questionService.getRandomQuestion()).thenReturn(firstQuestion, secondQuestion, thirdQuestion);
        Assertions.assertEquals(amount, examinerService.getQuestions(amount).size());
    }
    @Test
    public void shouldThrowAnException() {
        Assertions.assertThrows(RandomAmountGreaterThanTotal.class, () -> {
            examinerService.getQuestions(-1);
            examinerService.getQuestions(questionsForTests.size() + 1);
        });
    }
}
