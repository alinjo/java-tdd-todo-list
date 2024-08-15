package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TodoList {
    HashMap<String, Boolean> todoList;

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

}


