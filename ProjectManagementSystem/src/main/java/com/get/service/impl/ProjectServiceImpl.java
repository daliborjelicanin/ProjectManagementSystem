package com.get.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.model.Project;
import com.get.repository.ProjectRepository;
import com.get.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public List<Project> getAll() {
		return projectRepository.getAll();
	}

}
