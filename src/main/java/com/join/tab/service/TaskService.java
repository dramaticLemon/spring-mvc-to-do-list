package com.join.tab.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.join.tab.domen.Task;
import com.join.tab.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	@Transactional
	public void createTask(String taskText) {
		Task task = new Task(taskText);
		taskRepository.save(task);
		System.out.println("create task is: " + task);
	}

	public List<Task> getAllTasks() {
		return taskRepository.getAllTask();
	}
	
}
