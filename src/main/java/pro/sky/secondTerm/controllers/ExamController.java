package pro.sky.secondTerm.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.secondTerm.Question;
import pro.sky.secondTerm.services.ExaminerService;

import java.util.Collection;

@RestController
public class ExamController {
    private final ExaminerService examinerService;
    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/get/{amount}")
    Collection<Question> getQuestions(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}
