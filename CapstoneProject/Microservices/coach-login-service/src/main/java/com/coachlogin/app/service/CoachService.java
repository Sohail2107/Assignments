package com.coachlogin.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coachlogin.app.entity.Coach;
import com.coachlogin.app.repository.CoachRepository;
import com.coachlogin.app.response.CoachResponse;

@Service
public class CoachService {
	
	@Autowired
	CoachRepository coachRepository;
	
	 public CoachResponse validateCoachDetails (int id) {
			
		Coach coach = coachRepository.findById(id).get();
		CoachResponse coachResponse = new CoachResponse(coach);
		return coachResponse;
	}

}
