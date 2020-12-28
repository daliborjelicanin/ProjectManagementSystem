package com.get.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.get.model.Project;
import com.get.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@RequestMapping("/projects")
	public ModelAndView projects() {
		ModelAndView mav = new ModelAndView("project/projects");
		
		List<Project> projects = projectService.getAll();
		mav.addObject("projects", projects);
		
		return mav;
	}
}
