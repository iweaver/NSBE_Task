package com.superslug.myapplication3.app;

import java.util.ArrayList;
import java.util.List;

public class Task {
    String title;
    String description;
    String location;
    String date_due;
    List<String> labels;
    int priority; // 1 to 5
    String color;
    boolean done;

    public Task (String title) {
        this.title = title;
        this.description = "ask for clarification if needed";
        this.location = "not specified";
        this.date_due = "TBA";
        labels = new ArrayList<String>();
        this.priority = 3;
        this.color = "default";
        this.done = false;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public void setLocation (String location) {
        this.location = location;
    }

    public void setDateDue (String due_date) {
        this.date_due = due_date;
    }

    public void priority (int priority) {
        this.priority = priority;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void addLabel (String label) {
        boolean exists = false;
        for (String str: labels) {
            if (str.equals(label)) {
                exists = true;
                break;
            }
        }
        // label doesn't exist
        if (!exists) {
            labels.add(label);
        }
    }

    public void markDone() {
        done = true;
    }


}

