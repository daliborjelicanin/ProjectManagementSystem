package com.get.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.get.model.Task;
import com.get.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	TaskService taskService;

	@RequestMapping("/tasks")
	public ModelAndView tasks() {
		ModelAndView mav = new ModelAndView("task/tasks");

		List<Task> tasks = taskService.getAll();
		mav.addObject("tasks", tasks);

		return mav;
	}
}
