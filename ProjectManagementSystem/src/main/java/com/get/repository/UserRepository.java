package com.get.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.get.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	@Query("SELECT u FROM User u WHERE u.username =:username")
	User getByUsername(@Param("username") String username);
	
	//@Query("select u from User u")
	@Query(value="select * from Users u", nativeQuery = true)
	List<User> getAll();
}
