package com.quizapp;

import javax.swing.*;
import java.awt.*;

public class ResultFrame extends JFrame {

    public ResultFrame(int score, int total) {
        setTitle("Quiz Result");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Your Score: " + score + " / " + total, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        add(label);

        setVisible(true);
    }
}
