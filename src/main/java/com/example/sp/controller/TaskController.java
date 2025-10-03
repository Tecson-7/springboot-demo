package com.example.sp.controller;

import com.example.sp.model.task;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    // Temporary "database"
    private List<task> tasks = new ArrayList<>(Arrays.asList(
            new task(1L, "Learn Spring Boot", false),
            new task(2L, "Practice GitHub", true)
    ));

    // GET - read all tasks
    @GetMapping
    public List<task> getAllTasks() {
        return tasks;
    }

    // GET - read a single task
    @GetMapping("/{id}")
    public task getTaskById(@PathVariable Long id) {
        return tasks.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    // POST - create a new task
    @PostMapping
    public task createTask(@RequestBody task task) {
        tasks.add(task);
        return task;
    }

    // PUT - update an existing task
    @PutMapping("/{id}")
    public task updateTask(@PathVariable Long id, @RequestBody task updatedTask) {
        for (task t : tasks) {
            if (t.getId().equals(id)) {
                t.setTitle(updatedTask.getTitle());
                t.setCompleted(updatedTask.isCompleted());
                return t;
            }
        }
        return null;
    }

    // DELETE - delete a task
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        tasks.removeIf(t -> t.getId().equals(id));
        return "Task with id " + id + " deleted!";
    }
}
