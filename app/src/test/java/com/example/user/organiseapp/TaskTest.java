package com.example.user.organiseapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/07/2017.
 */

public class TaskTest {

    Task task;

    @Before
    public void before(){
        task = new Task(3, "Buy groceries", "Food to buy:  bread, milk, biscuits", "No");
    }

    @Test
    public void canGetId(){
        assertEquals(3, task.getId());
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
        assertEquals("No", task.getComplete());
    }

    @Test
    public void canSetCompletion(){
        task.setComplete("Yes");
        assertEquals("Yes", task.getComplete());
    }

}
