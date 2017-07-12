package com.example.user.organiseapp;

import java.util.ArrayList;

/**
 * Created by user on 09/07/2017.
 */

public class TaskList {

    private ArrayList<Task> list;

    public TaskList(){
        list = new ArrayList<Task>();
    }

    public ArrayList<Task> getList() {
        return new ArrayList<Task>(list);
    }

}
