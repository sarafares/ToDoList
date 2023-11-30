package com.example.todolist.Service;


import com.example.todolist.Model.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class TaskService {

    private  List<Task> list;
    public TaskService() {

        list = new ArrayList<>();

        Task t1 = new Task(1,"t1","d1","open", LocalDate.parse("2023-12-12"));
        Task t2 = new Task(2,"t2","d2","closed",LocalDate.parse("2023-12-13"));
        Task t3 = new Task(3,"t3","d3","open",LocalDate.parse("2023-12-14"));

        list.addAll(Arrays.asList(t1,t2,t3));


    }

    public Task getTask(Integer id)
    {
        for(Task t:list)
        {
            if(id == t.getID())
                return t;
        }
        return null;
    }

    public List<Task> getAllTasks() {
        return list;
    }

    public void  createTask(Task newTask)
    {
        newTask.setID(this.getLastID()+1);
        list.add(newTask);
    }

    private Integer getLastID()
    {
        return list.get(list.size()-1).getID();
    }




}
