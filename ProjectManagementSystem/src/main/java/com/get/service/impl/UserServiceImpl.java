package com.get.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.model.User;
import com.get.repository.UserRepository;
import com.get.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findByUsername(String username) {
		return userRepository.getByUsername(username);
	}

	@Override
	public List<User> getAll() {
		return userRepository.getAll();
	}

}
