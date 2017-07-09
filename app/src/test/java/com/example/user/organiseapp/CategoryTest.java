package com.example.user.organiseapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/07/2017.
 */

public class CategoryTest {

    Category category;

    @Before
    public void before(){
        category = new Category(2, "Shopping");
    }

    @Test
    public void canGetId(){
        assertEquals(2, category.getId());
    }

    @Test
    public void canGetName(){
        assertEquals("Shopping", category.getName());
    }

    @Test
    public void canSetName() {
        category.setName("Fitness");
        assertEquals("Fitness", category.getName());
    }
}
