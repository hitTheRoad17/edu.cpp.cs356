package edu.cpp.cs356;

public class Student implements User {

    private String ID;
    private String answer;

    Student(String ID, String answer) {
        setID(ID);
        setAnswer(answer);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
