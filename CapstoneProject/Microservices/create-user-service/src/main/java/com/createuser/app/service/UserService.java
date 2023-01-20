package com.createuser.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createuser.app.entity.User;
import com.createuser.app.repository.UserRepository;
import com.createuser.app.request.CreateUserRequest;
import com.createuser.app.response.UserResponse;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public int createUser(CreateUserRequest createUserRequest) {

		User user =new User();
		user.setName(createUserRequest.getName());
		user.setPassword(createUserRequest.getPassword());
		user.setMobileNumber(createUserRequest.getMobileNumber());
		user.setEmail(createUserRequest.getEmail());
		user.setDateOfBirth(createUserRequest.getDateOfBirth());
		user.setGender(createUserRequest.getGender());
		user.setPincode(createUserRequest.getPincode());
		user.setCity(createUserRequest.getCity());
		user.setState(createUserRequest.getState());
		user.setCountry(createUserRequest.getCountry());
		
		user = userRepository.save(user);
		
		return user.getId();
	}
	
       public UserResponse getById (int id) {
		
		User user = userRepository.findById(id).get();
		UserResponse userResponse = new UserResponse(user);
		
		return userResponse;
	}

}
