package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskTest() {

        // Add tasks if does not already exists.
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("homework"));
        Assertions.assertFalse(todoList.addTask("homework"));

    }

    @Test
    public void getAllTasksTest() {

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        List<String> tasks = todoList.getAllTasks();
        Assertions.assertEquals(2, tasks.size());

        Assertions.assertTrue(tasks.contains("homework"));
        Assertions.assertTrue(tasks.contains("shopping"));

    }

    @Test
    public void changeStatusTasksTest() {

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        Assertions.assertTrue(todoList.changeStatusTasks("homework"));
        Assertions.assertTrue(todoList.getTasks().get("homework"));

        Assertions.assertTrue(todoList.changeStatusTasks("homework"));
        Assertions.assertFalse(todoList.getTasks().get("homework"));
    }

    @Test
    public void getCompletedTasksTest() {

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        todoList.changeStatusTasks("homework");
        ArrayList<String> test = todoList.getCompletedTasks();

        Assertions.assertEquals(test.getFirst(), "homework");

    }
}

