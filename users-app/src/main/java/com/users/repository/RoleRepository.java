package com.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.users.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{


	@Query("Select r FROM Role r WHERE r.address.profile.user.id=?1 AND r.address.profile.id=?1")
	Optional<Role> findRoleByAddressIdProfileIdAndUserId(Integer userId, Integer profileId);

	
}
