# QuizApplication-FinalProject

#QuizApp
A simple Java-based **online quiz system** with a GUI built using Swing and MySQL for database management.  

Features:
- User login system  
- Randomized quiz questions per user  
- Timer-based quiz  
- Automatic scoring  
- Display results with correct answers  
- Store quiz results in MySQL
  
project Structure:
QuizApp/
│
├── src/
│ └── com.quizapp/
│ ├── DBConnection.java # Handles MySQL DB connection
│ ├── User.java # User model
│ ├── UserDAO.java # User database operations
│ ├── Question.java # Question model
│ ├── QuestionDAO.java # Question database operations
│ ├── LoginFrame.java # GUI: Login screen
│ ├── QuizFrame.java # GUI: Quiz screen with timer
│ ├── ResultFrame.java # GUI: Shows quiz results
│ └── Main.java # Launches the application
│
├── lib/
  └── mysql-connector-j-8.3.0.jar # MySQL JDBC connector

Notes:
- All classes are inside one package com.quizapp for simplicity.  
- lib/ folder contains the MySQL connector jar.  
- GUI files (LoginFrame, QuizFrame, ResultFrame) handle the front-end.  
- DAO files (UserDAO, QuestionDAO) handle database operations.  
- DBConnection centralizes database connection logic.  

Prerequisites:
- JDK 17 or above  
- MySQL database  
- Eclipse IDE (or any Java IDE)  

Database Setup:
1. Create a database named quizdb in MySQL.  
2. Import the provided SQL script (quizdb.sql) to create tables: users, questions, results.  
3. Update DBConnection.java with your MySQL username and password.

How to Run:
1. Open the project in Eclipse.  
2. Ensure mysql-connector-j-8.3.0.jar is added in Referenced Libraries.  
3. Run Main.java → The login screen will appear.  
4. Login with a registered user or add new users via SQL.  
5. Take the quiz, and results will be saved in the database.  
