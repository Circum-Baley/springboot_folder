package com.users.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.users.entities.Address;
import com.users.entities.Profile;
import com.users.repository.AddressRepository;
import com.users.repository.ProfileRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
		

	@Autowired 
	private ProfileRepository profileRepository;
	
	public List<Address> findAddressesByProfileAndUserId(Integer userId,Integer profileId){
		return addressRepository.findAddressesByProfileAndUserId(userId, profileId);
	}


	public Address createAddress(Integer userId, Integer profileId, Address address) {
		Optional<Profile> result = profileRepository.findByUserIdAndProfileId(userId, profileId);
		if(result.isPresent()) {
			address.setProfile(result.get());
			return addressRepository.save(address);
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Profile %d and User %d not fundeichon", profileId,userId));
		}
	}
	
	
}
