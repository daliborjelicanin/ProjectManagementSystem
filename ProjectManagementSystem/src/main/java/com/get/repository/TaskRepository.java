package com.get.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.get.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

	
	//@Query(value = "SELECT t.id, t.deadline, t.description, t.progress, t.status FROM Task t JOIN Users u ON(t.user_id = u.user_id)", nativeQuery = true)
	//@Query(value = "SELECT t.id, t.deadline, t.description, t.progress, t.status FROM Task t", nativeQuery = true)
	//@Query(value = "SELECT t.description FROM Task t", nativeQuery = true)
	@Query("SELECT t.id, u.name FROM Task t JOIN t.assignee u")
	List<Task> getAll();
}
