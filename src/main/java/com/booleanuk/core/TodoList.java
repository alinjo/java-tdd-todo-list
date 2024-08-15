package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TodoList {
    HashMap<String, Boolean> todoList;

    public HashMap<String, Boolean> getTasks() {
        return todoList;
    }

    public TodoList() {
        this.todoList = new HashMap<>();
    }

    public boolean addTask(String task) {

        if (todoList.containsKey(task)) {

            return false;

        } else {

            todoList.put(task, false);
            return true;

        }
    }

    public List<String> getAllTasks(){

        return new ArrayList<>(todoList.keySet());

    }

    public boolean changeStatusTasks(String task) {

        if (todoList.containsKey(task)) {

            boolean currentStatus = todoList.get(task);
            todoList.put(task, !currentStatus);
            return true;

        } else {

            return false;

        }
    }

}


