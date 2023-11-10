package com.wit.todo.model;

import com.wit.todo.enums.Priority;
import com.wit.todo.enums.Status;

import java.util.Objects;

public class Task {

    private String project;
    private String description;
    private String assignee;
    private Status status;
    private Priority prio;

    public Task(String project, String description, String assignee, Status status, Priority prio) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.prio = prio;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPrio() {
        return prio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getProject(), task.getProject()) && Objects.equals(getDescription(), task.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProject(), getDescription());
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", status=" + status.name() +
                ", prio=" + prio.name() +
                '}';
    }
}
