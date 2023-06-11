package pro.sky.secondTerm.servicesTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.secondTerm.services.JavaQuestionService;
import pro.sky.secondTerm.services.QuestionService;

import static pro.sky.secondTerm.ConstantsForTests.*;

public class JavaQuestionServiceTest {
    private final QuestionService questionService = new JavaQuestionService();

    @Test
    public void shouldAddQuestion() {
        int sizeBeforeAdding = questionService.getAll().size();
        Assertions.assertEquals(questionService.add(firstQuestion), firstQuestion);
        Assertions.assertEquals(sizeBeforeAdding + 1, questionService.getAll().size());
    }

    @Test
    public void shouldRemoveQuestion() {
        questionService.add(firstQuestion);
        questionService.add(secondQuestion);
        questionService.add(thirdQuestion);
        int sizeBeforeAdding = questionService.getAll().size();
        Assertions.assertEquals(secondQuestion, questionService.remove(secondQuestion));
        Assertions.assertEquals(sizeBeforeAdding - 1, questionService.getAll().size());
    }

    @Test
    public void shouldReturnQuestions() {
        questionService.add(firstQuestion);
        questionService.add(secondQuestion);
        questionService.add(thirdQuestion);
        Assertions.assertEquals(questionService.getAll().size(), 3);
    }

    @Test
    public void shouldReturnRandomQuestion() {
        questionService.add(firstQuestion);
        questionService.add(secondQuestion);
        questionService.add(thirdQuestion);
        Assertions.assertNotNull(questionService.getRandomQuestion());
    }
}
