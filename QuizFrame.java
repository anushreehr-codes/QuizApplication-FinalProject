package com.quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class QuizFrame extends JFrame {

    ArrayList<Question> qList;
    int index = 0;
    int score = 0;
    JLabel qLabel;
    JRadioButton op1, op2, op3, op4;
    ButtonGroup bg;

    public QuizFrame(User user) {
        setTitle("QuizApp - Welcome " + user.getUsername());
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        qList = QuestionDAO.getQuestions();

        JPanel panel = new JPanel(new GridLayout(5, 1));

        qLabel = new JLabel();
        op1 = new JRadioButton();
        op2 = new JRadioButton();
        op3 = new JRadioButton();
        op4 = new JRadioButton();

        bg = new ButtonGroup();
        bg.add(op1); bg.add(op2); bg.add(op3); bg.add(op4);

        JButton nextBtn = new JButton("Next");

        panel.add(qLabel);
        panel.add(op1);
        panel.add(op2);
        panel.add(op3);
        panel.add(op4);
        panel.add(nextBtn);

        add(panel);

        loadQuestion();

        nextBtn.addActionListener(e -> {
            checkAnswer();
            index++;
            if (index < qList.size()) {
                loadQuestion();
            } else {
                new ResultFrame(score, qList.size());
                dispose();
            }
        });

        setVisible(true);
    }

    void loadQuestion() {
        bg.clearSelection();
        Question q = qList.get(index);

        qLabel.setText("Q" + (index + 1) + ": " + q.question);
        op1.setText(q.options[0]);
        op2.setText(q.options[1]);
        op3.setText(q.options[2]);
        op4.setText(q.options[3]);
    }

    void checkAnswer() {
        Question q = qList.get(index);
        int ans = -1;

        if (op1.isSelected()) ans = 1;
        else if (op2.isSelected()) ans = 2;
        else if (op3.isSelected()) ans = 3;
        else if (op4.isSelected()) ans = 4;

        if (ans == q.answer) score++;
    }
}
