package edu.cpp.cs356;

import java.util.List;

public interface VoteService {

    void configureQuestion(int type, String question);

    void displayQuestion();

    void getSubmission(List<Student> sl);

    void displayStats(int type, List<Student> sl);

}
