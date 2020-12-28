package com.get.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.get.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

	@Query("select r from Role r")
	List<Role> getAll();
	
}
