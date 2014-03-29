package com.superslug.myapplication3.app;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    List<Task> tasks; // tasks they are working on

    public Person (String name) {
        this.tasks = new ArrayList<Task>();
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
