package com.booleanuk.core;

import java.util.HashMap;
import java.util.*;

public class TodoList {

    HashMap<String, Boolean> TodoList;

    public HashMap<String, Boolean> getTodoList() {
        return TodoList;
    }

    public TodoList() {
        this.TodoList = new HashMap<>();
    }

    public List<String> getTodoListKeys() {
        return new ArrayList<>(TodoList.keySet());
    }

    public boolean addTodoList(String todo) {
        if (TodoList.containsKey(todo)) {
            return false;
        }
        TodoList.put(todo, false);
        return true;
    }

    public boolean changeStatusTasks(String todo, boolean status) {
        if (!TodoList.containsKey(todo)) {
            return false;
        }
        TodoList.put(todo, status);
        return true;
    }

    public ArrayList<String> getCompletedTasks() {
        ArrayList<String> completedTasks = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : TodoList.entrySet()) {
            if (entry.getValue()) {
                completedTasks.add(entry.getKey());
            }
        }
        return completedTasks;
    }

    public String searchTask(String task) {
        if (TodoList.containsKey(task)) {
            return "Exists";
        }
        return "Does not exist";
    }

    public boolean removeTask(String task) {
        if (!TodoList.containsKey(task)) {
            return false;
        }
        TodoList.remove(task);
        return true;
    }

    public ArrayList<String> ascendingOrder() {
        ArrayList<String> ascendingOrder = new ArrayList<>(TodoList.keySet());
        Collections.sort(ascendingOrder);
        return ascendingOrder;
    }

    public ArrayList<String> descendingOrder() {
        ArrayList<String> descendingOrder = new ArrayList<>(TodoList.keySet());
        descendingOrder.sort(Collections.reverseOrder());
        return descendingOrder;
    }

}
