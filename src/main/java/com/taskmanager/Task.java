package com.taskmanager;

public class Task {
    private int id;
    private String name;
    private boolean completed;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return id + ". " + name + " [" + (completed ? "Done" : "Pending") + "]";
    }
}
