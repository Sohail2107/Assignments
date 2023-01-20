package com.createuser.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createuser.app.request.CreateUserRequest;
import com.createuser.app.response.UserResponse;
import com.createuser.app.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/createUser")
	public int createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
		int id=userService.createUser(createUserRequest);
		return id;
	}
	
	@GetMapping("/getUser/{id}")
	public UserResponse getById (@PathVariable int id) {
		return userService.getById(id);
	}

}
