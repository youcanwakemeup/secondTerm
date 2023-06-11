package pro.sky.secondTerm;

import pro.sky.secondTerm.model.Question;

import java.util.Collection;
import java.util.Set;

public class ConstantsForTests {
    public static final Question firstQuestion = new Question("Вопрос 1", "Ответ 1");
    public static final Question secondQuestion = new Question("Вопрос 2", "Ответ 2");
    public static final Question thirdQuestion = new Question("Вопрос 3", "Ответ 3");
    public static final Collection<Question> questionsForTests = Set.of(firstQuestion, secondQuestion, thirdQuestion);
}
