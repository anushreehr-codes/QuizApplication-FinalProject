package com.quizapp;

public class Question {
    public int id;
    public String question;
    public String[] options;
    public int answer;

    public Question(int id, String question, String[] options, int answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
}
