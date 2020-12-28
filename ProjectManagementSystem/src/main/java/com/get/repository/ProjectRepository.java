package com.get.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.get.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{

	@Query("SELECT p FROM Project p")
	List<Project> getAll();
}
