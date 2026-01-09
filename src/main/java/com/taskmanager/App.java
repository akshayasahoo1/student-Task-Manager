package com.taskmanager;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task name: ");
                    service.addTask(sc.nextLine());
                }
                case 2 -> service.showTasks();
                case 3 -> {
                    System.out.print("Enter task id: ");
                    service.completeTask(sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

