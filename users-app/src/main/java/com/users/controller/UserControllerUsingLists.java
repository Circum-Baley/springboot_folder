//package com.users.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.users.model.User;
//import com.users.services.UserServiceUsingLists;
//@RestController
////Definicion De Recursos
//@RequestMapping("/v1/usuarios")
//public class UserControllerUsingLists  {
//	@Autowired
//	private UserServiceUsingLists userServiceUsingLists;
//	@GetMapping("/list")
//	// Metodo HTTp + recurso -> Handler methods
//	public ResponseEntity<List<User>> getUsers(){
//		return new ResponseEntity<List<User>>(userServiceUsingLists.getListUsers(),HttpStatus.OK);
//	}
//	public ResponseEntity<List<User>> getUsers(@RequestParam(value="startWith",required = true)String startWith){
//		return new ResponseEntity<List<User>>(userServiceUsingLists.getUsers(startWith),HttpStatus.OK);
//	}
//	@GetMapping(value="/{username}")
//	public ResponseEntity<User> getByUserName(@PathVariable("username") String username){
//		return new ResponseEntity<User>(userServiceUsingLists.getUserByUserName(username),HttpStatus.OK);
//	}
//	
//	@PostMapping
//	public ResponseEntity<User> createUser(@RequestBody User user){
//		return new ResponseEntity<User>(userServiceUsingLists.createUser(user),HttpStatus.CREATED);
//	}
//	@PutMapping(value="/{username}")
//	public ResponseEntity<User> userUpdate(@PathVariable("username")String username,@RequestBody User user){
//		return new ResponseEntity<User>(userServiceUsingLists.userUpdate(user, username),HttpStatus.OK);	
//	}
//	@DeleteMapping("/{username}")
//	public ResponseEntity<User> deleteUser(@PathVariable("username")String username){
//		userServiceUsingLists.deleteUser(username);
//		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	}
//	
//}