package com.example.todolist.Model;

import java.time.LocalDate;
import java.util.Date;


public class Task {
    private Integer ID;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
    public Task(Integer ID, String title, String description, String status, LocalDate dueDate)
    {
        this.ID=ID;
        this.description=description;
        this.title=title;
        this.dueDate=dueDate;
        this.status=status;
    }

    public Integer getID()
    {
        return this.ID;
    }
    public String getDescription() { return this.description; }
    public String getTitle()
    {
        return this.title;
    }
    public String getStatus()
    {
        return this.status;
    }

    public LocalDate getDueDate()
    {
        return this.dueDate;
    }

    public void setID(Integer ID)
    {
        this.ID=ID;
    }
    public void setDescription(String description) { this.description = description; }
    public void setTitle(String title)
    {
         this.title=title;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setDueDate(LocalDate dueDate) { this.dueDate=dueDate;}


}
