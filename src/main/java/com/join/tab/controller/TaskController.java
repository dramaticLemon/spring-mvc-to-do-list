package com.join.tab.controller;

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
	@GetMapping("/form")
	public String index(Model model) {
		
		return "index";
	}

	@PostMapping("/form")
	public String submitTust(@RequestParam("text") String taskText) {
		taskService.createTask(taskText);
		return "redirect:/form";
	}

	// @GetMapping("/api/tasks")
	// @ResponseBody
	// public List<Task> getAllTask() {
	// 	return tasks;
	// }
}
