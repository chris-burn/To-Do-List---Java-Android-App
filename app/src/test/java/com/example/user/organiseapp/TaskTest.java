package com.example.user.organiseapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TaskTest {

    Task task;

    @Before
    public void before(){
        task = new Task("Buy groceries", "Food to buy:  bread, milk, biscuits", "24-07-2017", false);
    }


    @Test
    public void canGetTitle(){
        assertEquals("Buy groceries", task.getTitle());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Food to buy:  bread, milk, biscuits", task.getDescription());
    }


    @Test
    public void canSetTitle(){
        task.setTitle("Buy pizza");
        assertEquals("Buy pizza", task.getTitle());
    }

    @Test
    public void canSetDescription(){
        task.setDescription("Toppings to buy: pepperoni, jalapenos");
        assertEquals("Toppings to buy: pepperoni, jalapenos", task.getDescription());
    }

    @Test
    public void canGetCompletion(){
        assertEquals(false, task.getComplete());
    }

    @Test
    public void canSetCompletion(){
        task.setComplete(true);
        assertEquals(true, task.getComplete());
    }


    @Test
    public void canGetDueDate(){
        assertEquals("24-07-2017", task.getDueDate());
    }

    @Test
    public void canSetDueDate(){
        task.setDueDate("30-07-2017");
        assertEquals("30-07-2017", task.getDueDate());
    }




}
