package com.quizapp;

import java.sql.*;
import java.util.ArrayList;

public class QuestionDAO {

    public static ArrayList<Question> getQuestions() {
        ArrayList<Question> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM questions");

            while (rs.next()) {
                String[] opts = { 
                    rs.getString("option1"),
                    rs.getString("option2"),
                    rs.getString("option3"),
                    rs.getString("option4")
                };
                list.add(new Question(
                    rs.getInt("id"),
                    rs.getString("question"),
                    opts,
                    rs.getInt("answer")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
