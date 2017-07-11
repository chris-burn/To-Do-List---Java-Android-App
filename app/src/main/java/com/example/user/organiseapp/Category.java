package com.example.user.organiseapp;

import static android.R.attr.id;

/**
 * Created by user on 09/07/2017.
 */

public class Category {

    private String name;


    public Category(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
