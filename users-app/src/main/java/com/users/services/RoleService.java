package com.users.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.users.entities.Address;
import com.users.entities.Profile;
import com.users.entities.Role;
import com.users.repository.RoleRepository;

@Service
public class RoleService{
	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> getRoles(){
		return roleRepository.findAll();
	}
	
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}
	
	public Role createRole(Integer userId, Integer profileId, Address ad)
	
	//
	public Address createAddress(Integer userId, Integer profileId, Integer addressId,Role role) {
		Optional<Profile> result = roleRepository.findRoleByAddressIdProfileIdAndUserId(userId, profileId,addressId);
		if(result.isPresent()) {
			role.setRole(result.get());
			return roleRepository.save(role);
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Profile %d and User %d not fundeichon", profileId,userId));
		}
	}
	
	//
	public Role updateRoles(Integer roleId,Role role) {
		Optional<Role> result = roleRepository.findById(roleId);
		if(result.isPresent()) {
			return roleRepository.save(role);
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Role id %d doesn't exists", roleId));
		}
	}
	
	public void deleteRole(Integer roleId) {
		Optional<Role>result=roleRepository.findById(roleId);
		if(result.isPresent()) { 
			roleRepository.delete(result.get());
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("El Rol %d no esta ", roleId));
		}
		
	}
}
