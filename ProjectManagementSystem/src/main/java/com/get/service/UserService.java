package com.get.service;

import java.util.List;

import com.get.model.User;

public interface UserService {
	
	User findByUsername(String username); 
	
	List<User> getAll();
}
