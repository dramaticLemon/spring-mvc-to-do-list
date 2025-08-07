package com.join.tab.service;

import java.util.List;
import java.util.UUID;

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

	public void deleteTask(UUID id) {
		taskRepository.deleteById(id);
	}
	
	public Task findById(UUID id) {
		return taskRepository.getTask(id);
	}

	@Transactional
    public void updateTaskText(UUID id, String newText) {
        Task task = findById(id);
        if (task != null) {
            task.setText(newText);
            taskRepository.updateTask(task);
        }
    }
}
