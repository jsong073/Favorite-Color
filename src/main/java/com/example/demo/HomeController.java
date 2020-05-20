package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/quizform")
    public String loadQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz());
        return "quizform";
    }
    @PostMapping("/quizform")
    public String processQuizForm(@Valid Quiz quiz, BindingResult result) {
        if (result.hasErrors()) {
            return "quizform";
        }
        return "quizconfirm";
    }
}
