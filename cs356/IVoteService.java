package edu.cpp.cs356;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class IVoteService implements VoteService {

    private Map<String, String> submission = new Hashtable<>();
    private Question q;

    public void configureQuestion(int type, String question) {
        if (type == 1) {
            q = new MCQuestion(question);
        } else {
            q = new SCQuestion(question);
        }
    }

    public void displayQuestion() {
        System.out.println(q.getQuestion() + "?");
        for (String temp : q.getChoice()) {
            System.out.println(temp);
        }
    }

    public void getSubmission(List<Student> sl) {
        int i = sl.size();
        while (--i >= 0) {
            submission.put(sl.get(i).getID(), sl.get(i).getAnswer());
            System.out.printf("Student:%s chose %s%n", sl.get(i).getID(), sl.get(i).getAnswer());
        }
    }

    public void displayStats(int type, List<Student> sl) {
        System.out.println("Participant: " + submission.size());
        if (type == 1) {
            System.out.println("A: " + counter("A", sl));
            System.out.println("B: " + counter("B", sl));
            System.out.println("C: " + counter("C", sl));
            System.out.println("D: " + counter("D", sl));
        } else {
            System.out.println("True: " + counter("True", sl));
            System.out.println("False: " + counter("False", sl));
        }
    }

    private int counter(String answer, List<Student> sl) {
        int counter = 0;
        int i = sl.size();
        while (--i >= 0) {
            if (sl.get(i).getAnswer() == answer)
                counter++;
        }
        return counter;
    }

}
