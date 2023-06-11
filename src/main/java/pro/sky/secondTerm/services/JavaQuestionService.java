package pro.sky.secondTerm.services;

import org.springframework.stereotype.Service;
import pro.sky.secondTerm.Question;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions = new HashSet<>();
    @Override
    public Question add(String question, String answer) {
        Question questionTemp = new Question(question, answer);
        questions.add(questionTemp);
        return questionTemp;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int randomQuestion = random.nextInt(questions.size());
        return new ArrayList<>(questions).get(randomQuestion);
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }
}
