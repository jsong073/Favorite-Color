package com.example.demo;

import javax.validation.constraints.NotNull;
import java.util.Random;

public class Quiz {
    @NotNull
    private String name;
    @NotNull
    private String quest;
    private String question;
    @NotNull
    private String answer;

    public Quiz() {
        name = "";
        quest = "";
        if (coinFlip() == 0) {
            question = "What is the airspeed velocity of an unladen swallow?";
        } else {
            question = "What is your favorite color?";
        }
        answer = "";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public static int coinFlip() {
        Random random = new Random();
        int randNum = random.nextInt(2);
        return randNum;
    }
}
