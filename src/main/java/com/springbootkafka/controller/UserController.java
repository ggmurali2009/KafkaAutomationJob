package com.springbootkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootkafka.DAO.UserStorageDAO;
import com.springbootkafka.domain.User;

@RestController
public class UserController {

	
@Autowired	
@Qualifier("mongouserdetails")
private UserStorageDAO test;

@PostMapping(value="/user",consumes = "application/json")
public User createUser(@RequestBody User user) {
	
	return test.save(user);	
}

@PutMapping(value="/user",consumes="application/json")
public User updateUser(@RequestBody User user) {
	
	return test.save(user);
	
}
	
@DeleteMapping(value="/user",consumes="application/json")
public boolean deleteUser(@RequestBody User user) {
	
	test.delete(user);
			return true;

}
}
