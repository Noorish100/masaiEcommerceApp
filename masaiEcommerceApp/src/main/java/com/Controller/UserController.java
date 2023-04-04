package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.User;
import com.Exception.UserException;
import com.Services.UserServiceImpl;
import com.Services.UserServices;

@RestController
@RequestMapping("/masaiEcommerce")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException {

		User registerUser = userServiceImpl.register(user);

		return new ResponseEntity<User>(registerUser, HttpStatus.CREATED);

	}
}
