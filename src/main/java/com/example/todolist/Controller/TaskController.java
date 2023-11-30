package com.example.todolist.Controller;


import com.example.todolist.Service.TaskService;
import com.example.todolist.Model.Task;
import com.example.todolist.Utilities.DateValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService)
    {
        this.taskService=taskService;
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<Task> getTask (@PathVariable("id") Integer id)
    {
        try {
            Task task = taskService.getTask(id);
            if(task != null)
                return new ResponseEntity<>(task, HttpStatus.OK);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks ()
    {
        try{
            List<Task> allTasks = taskService.getAllTasks();
            if(allTasks.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(allTasks, HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/task")
    public ResponseEntity<String> createTask(@RequestBody Task newTask)
    {
        try{
                taskService.createTask(newTask);
                return new ResponseEntity<>("Created successfully", HttpStatus.CREATED);

        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



}
