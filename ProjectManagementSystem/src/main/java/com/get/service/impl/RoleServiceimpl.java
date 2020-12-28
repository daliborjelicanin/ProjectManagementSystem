package com.get.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.model.Role;
import com.get.repository.RoleRepository;
import com.get.service.RoleService;

@Service
public class RoleServiceimpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public List<Role> getAll() {
		return roleRepository.getAll();
	}
	
}
