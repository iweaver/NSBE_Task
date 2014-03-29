package com.superslug.myapplication3.app;

public class Person {
    String name;
    List<Task> tasks; // orgs the person belongs to

    public Person (String name) {
        this.name = name;
    }

    void addTask (Task t) {
        boolean exists = false;
        for (Task task: tasks) {
            if (t.title.equals(task.title)) {
                exists = true;
                break;
            }
        }
        // task doesn't exist
        if (!exists) {
            tasks.add(t);
        }
    }

    void removeTask (Task t) {
        boolean exists = false;
        for (Task task: tasks) {
            if (t.title.equals(task.title)) {
                tasks.remove(task);
                break;
            }
        }
    }
}
