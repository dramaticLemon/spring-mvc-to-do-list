package com.join.tab.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.join.tab.domen.Task;

@Controller
public class TaskController {
	
	List<Task> tasks = new ArrayList<>();
	
	@GetMapping("/form")
	public String index(Model model) {
		model.addAttribute("task", new Task());
		model.addAttribute("tasks", tasks);
		return "index";
	}

	@PostMapping("/form")
	public String submitTust(@ModelAttribute Task task) {
		tasks.add(task);
		return "redirect:/form";
	}

}
