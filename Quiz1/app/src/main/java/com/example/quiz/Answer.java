package com.example.quiz;

public class Answer {
    private int userQuestion;
    private boolean userAnswer;

    public Answer(int userQuestion, boolean userAnswer) {
        this.userQuestion = userQuestion;
        this.userAnswer = userAnswer;
    }

    public int getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(int userQuestion) {
        this.userQuestion = userQuestion;
    }

    public boolean isUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(boolean userAnswer) {
        this.userAnswer = userAnswer;
    }
}
