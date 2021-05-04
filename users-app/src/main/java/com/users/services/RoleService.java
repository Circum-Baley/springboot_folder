package com.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.entities.Role;
import com.users.repository.RoleRepository;

@Service
public class RoleService{
	
	@Autowired
	private RoleRepository repository;
	
	public Iterable<Role> getRoles(){
		return repository.findAll();
	}

}
