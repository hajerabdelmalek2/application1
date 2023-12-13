package com.flouci.application1.senrvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flouci.application1.model.Task;
import com.flouci.application1.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	TaskRepository taskRepository;

	public void sendTask(Task task) {
		String url = "http://localhost:8081/task/calculate";

		ResponseEntity<String> response = restTemplate.postForEntity(url, task, String.class);

		if (response.getStatusCode() == HttpStatus.OK) {
			System.out.println("Task sent successfully!");
		} else {
			System.err.println("Failed to send task. Status code: " + response.getStatusCode());
		}
	}

	public void save(Task task) {
		taskRepository.save(task);

	}
}
