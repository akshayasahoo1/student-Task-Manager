Student Task Manager

A Java-based Command Line Application developed using Maven and Git to manage daily tasks efficiently.
The project focuses on simplicity, clean architecture, and core software engineering concepts.

🚀 Project Overview

The Student Task Manager helps users:

Add and manage daily tasks

View task lists

Update task status

Delete tasks

It is designed as a menu-driven CLI application and follows the standard Maven project structure.

🛠 Technologies Used

Java (JDK 17)

Maven – Build & dependency management

Git – Version control

VS Code – Development environment

CLI (Command Line Interface)

🧱 Project Architecture

Architecture Type: Layered Architecture

Model Layer – Represents task data

Service Layer – Contains business logic

Controller/Main Layer – Handles user interaction

📂 Project Structure
project-root
 ├── pom.xml
 ├── src
 │   └── main
 │       └── java
 │           └── com
 │               └── taskmanager
 │                   ├── App.java
 │                   ├── Task.java
 │                   └── TaskService.java
 └── target

✨ Features

Menu-driven command-line interface

Add new tasks

View existing tasks

Mark tasks as completed

Delete tasks

Lightweight and beginner-friendly

▶️ How to Run the Project
Prerequisites

Java 17 installed

Maven installed

Git installed

Steps to Run
mvn clean
mvn compile
mvn exec:java

🔧 Maven Commands Used
Command	Description
mvn clean	Removes old build files
mvn compile	Compiles Java source code
mvn exec:java	Runs the application
mvn clean compile	Performs a clean build
🌿 Git Commands Used
git init
git status
git add .
git commit -m "Initial commit"

🎯 Learning Outcomes

Understanding of Java OOP concepts

Hands-on experience with Maven build lifecycle

Practical usage of Git for version control

Familiarity with standard project structure

🔮 Future Enhancements

File-based task persistence

Database integration

Graphical User Interface (GUI)

Web-based version

📄 License

This project is created for educational purposes.

👤 Author
Akshaya Kumar Sahoo
