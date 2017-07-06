package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.List;

public class SCQuestion implements Question {

    private String question;
    private List<String> choice = new ArrayList<>();

    SCQuestion(String question) {
        setQuestion(question);
        setChoice();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getChoice() {
        return choice;
    }

    public void setChoice() {
        choice.add("True");
        choice.add("False");
    }

}
