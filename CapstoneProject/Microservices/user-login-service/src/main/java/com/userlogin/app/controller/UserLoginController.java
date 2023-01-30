package com.userlogin.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userlogin.app.response.UserResponse;
import com.userlogin.app.service.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/user")
public class UserLoginController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/userlogin/{id}/{password}")
    public ResponseEntity<String> userlogin(@PathVariable int id,@PathVariable String password) {
        UserResponse userResponse = userService.validateUserDetails(id);
        if ((userResponse.getId()==id) &&  userResponse.getPassword().equalsIgnoreCase(password)) {
            return new ResponseEntity<>("Login Success", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Login Failed", HttpStatus.BAD_REQUEST);
        }

    }

}
