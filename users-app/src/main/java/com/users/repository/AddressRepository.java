package com.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.entities.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{
	@Query("SELECT a FROM Address a WHERE a.profile.user.id=?1 AND a.profile.id=?1")
	List<Address>findAddressesByProfileAndUserId(Integer userId, Integer profileId);
}
