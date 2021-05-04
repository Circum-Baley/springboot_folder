package com.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.users.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>{

}
