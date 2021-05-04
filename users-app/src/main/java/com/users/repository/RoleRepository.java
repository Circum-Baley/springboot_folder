package com.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
