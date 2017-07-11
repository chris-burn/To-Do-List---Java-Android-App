package com.example.user.organiseapp;

import java.io.Serializable;

import static android.R.attr.id;
import static com.example.user.organiseapp.R.id.due_date;

/**
 * Created by user on 09/07/2017.
 */

public class Task implements Serializable {

    private String title;
    private String description;
//    private boolean complete;
    private String due_date;


    public Task(String title, String description, String due_date){

        this.title = title;
        this.description = description;
//        this.complete = complete;
        this.due_date = due_date;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public String getComplete() {
//        return complete;
//    }
//
//    public void setComplete(String complete) {
//        this.complete = complete;
//    }


    public String getDueDate() {
        return due_date;
    }

    public void setDueDate(String due_date) {
        this.due_date = due_date;
    }


}
