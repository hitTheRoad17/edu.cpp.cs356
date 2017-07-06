package edu.cpp.cs356;

import java.util.List;

public interface Question {

    String getQuestion();

    void setQuestion(String question);

    List<String> getChoice();

    void setChoice();

}
