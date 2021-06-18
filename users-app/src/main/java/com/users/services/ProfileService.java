package com.users.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.users.entities.Profile;
import com.users.entities.User;
import com.users.repository.ProfileRepository;
import com.users.repository.UserRepository;

@Service
public class ProfileService {


	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	public Profile create(Integer userId,Profile profile) {
		Optional<User> result = userRepository.findById(userId);
		if (result.isPresent()) {
			profile.setUser(result.get());
			return profileRepository.save(profile);
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User %d not Foundenchion", userId));
		}
	}


	public Profile getByIdAndProfileId(Integer userId, Integer profileId) {

		return profileRepository.findByUserIdAndProfileId(userId,profileId)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Profile not foundeichon %d and profile %d", userId,profileId)));
	}
	
	
	
	
	
	

}
