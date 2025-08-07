package com.join.tab.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.join.tab.service.TaskService;

@Controller
public class TaskController {
	
	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("tasks", taskService.getAllTasks());
		return "index";
	}

	@PostMapping("/form")
	public String submitTust(@RequestParam("text") String taskText) {
		taskService.createTask(taskText);
		return "redirect:/";
	}

	@PostMapping("/tasks/delete")
	public String deleteTask(@RequestParam("id") UUID id) {
		taskService.deleteTask(id);
		return "redirect:/";
	}

}
