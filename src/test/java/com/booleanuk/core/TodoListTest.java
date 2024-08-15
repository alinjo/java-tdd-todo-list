package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskTest(){

        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("homework"));
        Assertions.assertFalse(todoList.addTask("homework"));

    }
}

