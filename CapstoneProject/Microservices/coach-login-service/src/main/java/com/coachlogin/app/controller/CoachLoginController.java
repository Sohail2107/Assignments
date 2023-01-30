package com.coachlogin.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coachlogin.app.response.CoachResponse;
import com.coachlogin.app.service.CoachService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/coach")
public class CoachLoginController {
	
	@Autowired
	CoachService coachService;
	
	@GetMapping("/coachlogin/{id}/{password}")
    public ResponseEntity<String> coachlogin(@PathVariable int id,@PathVariable String password) {
        CoachResponse coachResponse = coachService.validateCoachDetails(id);
        if ((coachResponse.getId()==id) &&  coachResponse.getPassword().equalsIgnoreCase(password)) {
            return new ResponseEntity<>("Coach Login Success", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Coach Login Failed", HttpStatus.BAD_REQUEST);
        }

    }

}
