package com.get.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.model.Task;
import com.get.repository.TaskRepository;
import com.get.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepository taskRepository;
	
	@Override
	public List<Task> getAll() {
		return taskRepository.getAll();
	}

}
