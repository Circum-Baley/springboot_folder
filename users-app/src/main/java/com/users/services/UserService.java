package com.users.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.users.entities.User;
import com.users.repository.UserRepository;

@Service
public class UserService{

	private static final Logger log = LoggerFactory.getLogger(User.class);
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(Integer userId) {
		return userRepository.findById(userId).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("User %d not foudenchion", userId)));
	}
	
	@CacheEvict("users")
	public void deleteUserByUsername(String username) {
		User user = getUserByUsername(username);
		userRepository.delete(user);
	}
	
	@Cacheable("users")
	public User getUserByUsername(String username) {
		log.info("Obteniendo datos del usuario {} ",username);
		try {
			//hace que funcione o no en el cliente
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return userRepository.findByUsername(username).orElseThrow(
				()->new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("User %s not foudenchion", username)));
	}
	public User getUserByUsernameAndPassword(String username,String password) {
		return userRepository.findByUsernameAndPassword(username,password).orElseThrow(
				()->new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("User %d not foudenchion", username)));
	}
}

