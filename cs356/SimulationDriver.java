package edu.cpp.cs356;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class SimulationDriver {

    private final int TYPE = 2;
    private final int MAX_STUDENT_NUMBER = 100;

    private VoteService ivs = new IVoteService();
    private StringGenerator sg = new StringGenerator();

    private List<Student> sl = new ArrayList<>();

    private SecureRandom r = new SecureRandom();

    private int type = r.nextInt(TYPE) + 1;
    private int studentNumber = r.nextInt(MAX_STUDENT_NUMBER) + 1;

    private void generateQuestions() {
        ivs.configureQuestion(type, sg.questionString());
    }

    private void generateStudents() {
        Student s;
        while (--studentNumber >= 0) {
            s = new Student(sg.IDString(), sg.answerString(type));
            sl.add(s);
        }
    }

    public void run() {
        generateQuestions();
        generateStudents();
        ivs.displayQuestion();
        ivs.getSubmission(sl);
        ivs.displayStats(type, sl);
    }

}
