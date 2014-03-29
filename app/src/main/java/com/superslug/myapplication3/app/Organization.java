package com.superslug.myapplication3.app;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    String name;
    List<Person> people;
    List<Task> unassigned_tasks;

    public Organization (String name) {
        this.name = name;
        this.people = new ArrayList<Person>();
        this.unassigned_tasks = new ArrayList<Task>();
    }

    public void addPerson (Person p) {
        boolean exists = false;
        for (Person curr: people) {
            if (curr.name.equals(p.name)) {
                exists = true;
                break;
            }
        }
        // task doesn't exist
        if (!exists) {
            people.add(p);
        }
    }

    public void removePerson (Person p) {
        for (Person curr: people) {
            if (curr.name.equals(p.name)) {
                people.remove(p);
                break;
            }
        }
    }

    public void addUnassignedTask (Task t) {
        boolean exists = false;
        for (Task task: unassigned_tasks) {
            if (t.title.equals(task.title)) {
                exists = true;
                break;
            }
        }
        // task doesn't exist
        if (!exists) {
            unassigned_tasks.add(t);
        }
    }
}




