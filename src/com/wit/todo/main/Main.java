package com.wit.todo.main;

import com.wit.todo.enums.Priority;
import com.wit.todo.enums.Status;
import com.wit.todo.model.Task;
import com.wit.todo.model.TaskData;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("java collecs", "Write List", "ann", Status.ASSIGNED, Priority.LOW);
        Task task2 = new Task("java collecs", "Write Set", "bob", Status.IN_QUEUE, Priority.MED);
        Task task3 = new Task("java collecs", "Write Map", "carol", Status.IN_PROGRESS, Priority.HIGH);
        Task task4 = new Task("java collecs", "Write Queue", "Bella", Status.ASSIGNED, Priority.LOW);
        Task task5 = new Task("java collecs", "Write Stack", "Pamela", Status.IN_QUEUE, Priority.MED);
        Task task6 = new Task("java collecs", "Write Collection", "Bilge", Status.IN_PROGRESS, Priority.HIGH);

        Set<Task> totalss = new HashSet<>();
        totalss.add(task1);
        totalss.add(task2);
        totalss.add(task3);
        totalss.add(task4);
        totalss.add(task5);
        totalss.add(task6);

        Set<Task> anns = new LinkedHashSet<>();
        anns.add(task1);
        anns.add(task2);

        Set<Task> bobs = new LinkedHashSet<>();
        bobs.add(task3);
        bobs.add(task2);

        Set<Task> carols = new LinkedHashSet<>();
        carols.add(task2);
        carols.add(task4);

        Set<Task> unassigned = new LinkedHashSet<>();
        unassigned.add(task2);

        TaskData taskData = new TaskData(anns, bobs, carols, unassigned);

        System.out.println(taskData.getTasks("ann"));
        System.out.println(taskData.getTasks("bob"));
        System.out.println(taskData.getTasks("carol"));
        System.out.println(taskData.getTasks("all"));
        System.out.println(taskData.getTasks("Bilge"));

    }
}