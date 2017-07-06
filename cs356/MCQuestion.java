package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.List;

public class MCQuestion implements Question {

    private String question;
    private List<String> choice = new ArrayList<>();

    MCQuestion(String question) {
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
        choice.add("A");
        choice.add("B");
        choice.add("C");
        choice.add("D");
    }

}
