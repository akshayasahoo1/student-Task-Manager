package com.taskmanager;

import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int counter = 1;

    public void addTask(String name) {
        tasks.add(new Task(counter++, name));
        System.out.println("Task added!");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        tasks.forEach(System.out::println);
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.toString().startsWith(id + ".")) {
                task.markCompleted();
                System.out.println("Task marked as completed!");
                return;
            }
        }
        System.out.println("Task not found!");
    }
}
