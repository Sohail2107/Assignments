package com.userlogin.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userlogin.app.entity.User;
import com.userlogin.app.repository.UserRepository;
import com.userlogin.app.response.UserResponse;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
       public UserResponse validateUserDetails (int id) {
		
		User user = userRepository.findById(id).get();
		UserResponse userResponse = new UserResponse(user);
		
		return userResponse;
	}

}
