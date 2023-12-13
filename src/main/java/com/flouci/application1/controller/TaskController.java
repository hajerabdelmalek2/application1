package com.flouci.application1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flouci.application1.model.Task;
import com.flouci.application1.senrvice.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	TaskService taskService;

	@PostMapping("/create")
	public ResponseEntity<String> createTask(@RequestBody Task task) {
		taskService.save(task);
		return ResponseEntity.ok("Task calculated successfully");
	}

	@PostMapping("/calculate")
	public ResponseEntity<String> calculateTask(@RequestBody Task task) {
		taskService.sendTask(task);
		return ResponseEntity.ok("Task calculated successfully");
	}
}
