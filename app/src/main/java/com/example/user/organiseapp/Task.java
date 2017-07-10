package com.example.user.organiseapp;

/**
 * Created by user on 09/07/2017.
 */

public class Task {

    private int id;
    private String title;
    private String description;
    private String complete;
//    private int due_date:


    public Task(int id, String title, String description, String complete){
        this.id = id;
        this.title = title;
        this.description = description;
        this.complete = complete;
//        this.due_date = due_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }


//    public int getDueDate() {
//        return due_date;
//    }
//
//    public void setDueDate(int due_date) {
//        this.due_date = due_date;
//    }


}
