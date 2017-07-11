package com.example.user.organiseapp;

import java.util.ArrayList;

/**
 * Created by user on 09/07/2017.
 */

public class TaskList {

    private ArrayList<Task> list;

    public TaskList(){
        list = new ArrayList<Task>();
//        list.add(new Task("Pay Council Tax", "July payment", "01.08.17"));
//        list.add(new Task("Cut Grass", "Bin day, Tuesday", "20.07.17"));
//        list.add(new Task("Call mum", "Ask about holidays and dogs", "18.07.17"));
//        list.add(new Task("Do weekly shop", "To buy: milk, bread, oj, apples, things for baking", "24.07.17"));
//        list.add(new Task("Book flights to France", "Date sometime in August, two weeks, from Edinburgh or Glasgow", "31.07.17"));
    }

    public ArrayList<Task> getList() {
        return new ArrayList<Task>(list);
    }

}
