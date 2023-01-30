package com.createcoach.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createcoach.app.request.CreateCoachRequest;
import com.createcoach.app.response.CoachResponse;
import com.createcoach.app.service.CoachService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/coach")
public class CoachController {
	
	@Autowired
	CoachService coachService;
	
	@PostMapping("/createCoach")
	public int createCoach(@Valid @RequestBody CreateCoachRequest createCoachRequest) {
		int id=coachService.createCoach(createCoachRequest);
		return id;
	}
	
	@GetMapping("/getCoach/{id}")
	public CoachResponse getById (@PathVariable int id) {
		return coachService.getById(id);
	}

}
