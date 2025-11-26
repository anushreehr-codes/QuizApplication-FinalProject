package com.quizapp;

import java.sql.*;

public class UserDAO {

    public static User login(String username, String password) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?"
            );
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("username"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
