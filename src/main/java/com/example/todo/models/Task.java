package com.example.todo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Task", schema = "todo")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo.task_id_seq")
    @SequenceGenerator(name = "task_id_seq")
    private Long id;
    private String task;
    private boolean completed;

    public Task() {
    }

    public Task(String task, boolean completed) {
        this.task = task;
        this.completed = completed;
    }


    public Long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
