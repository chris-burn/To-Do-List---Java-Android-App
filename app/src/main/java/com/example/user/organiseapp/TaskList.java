package com.example.user.organiseapp;

import java.util.ArrayList;

/**
 * Created by user on 09/07/2017.
 */

public class TaskList {

    private ArrayList<Task> list;

    public TaskList(){
        list = new ArrayList<Task>();
        list.add(new Task(1, "Pay Council Tax", "July payment", false));
        list.add(new Task(2, "Cut Grass", "Bin day, Tuesday", false));
        list.add(new Task(3, "Call mum", "Ask about holidays and dogs", false));
        list.add(new Task(4, "Do weekly shop", "To buy: milk, bread, oj, apples, things for baking", false));
        list.add(new Task(5, "Book flights to France", "Date sometime in August, two weeks, from Edinburgh or Glasgow", false));
    }

    public ArrayList<Task> getList() {
        return new ArrayList<Task>(list);
    }

}
