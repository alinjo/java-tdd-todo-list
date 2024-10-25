package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {

    @Test
    public void testAddTodoList() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTodoList("Task 1"));
        Assertions.assertFalse(todoList.addTodoList("Task 1"));
    }

    @Test
    public void getAllTasks() {
        TodoList todoList = new TodoList();
        todoList.addTodoList("Task 1");
        todoList.addTodoList("Task 2");
        todoList.addTodoList("Task 3");
        List<String> tasks = todoList.getTodoListKeys();
        Assertions.assertEquals(3, tasks.size());
    }

    @Test
    public void changeStatusBasedOnTask() {
        TodoList todoList = new TodoList();
        todoList.addTodoList("Task 1");
        todoList.addTodoList("Task 2");
        todoList.addTodoList("Task 3");
        todoList.changeStatusTasks("Task 1", true);
        Assertions.assertTrue(todoList.getTodoList().get("Task 1"));
    }
    
}
