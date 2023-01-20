package com.createcoach.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createcoach.app.entity.Coach;
import com.createcoach.app.repository.CoachRepository;
import com.createcoach.app.request.CreateCoachRequest;
import com.createcoach.app.response.CoachResponse;

@Service
public class CoachService {
	
	@Autowired
	CoachRepository coachRepository;
	
	public int createCoach(CreateCoachRequest createCoachRequest) {

		Coach coach =new Coach();
		coach.setName(createCoachRequest.getName());
		coach.setPassword(createCoachRequest.getPassword());
		coach.setDateOfBirth(createCoachRequest.getDateOfBirth());
		coach.setGender(createCoachRequest.getGender());
		coach.setMobileNumber(createCoachRequest.getMobileNumber());
		coach.setSpeciality(createCoachRequest.getSpeciality());
		
		coach = coachRepository.save(coach);
		
		return coach.getId();
	}
	
	 public CoachResponse getById (int id) {
			
		Coach coach = coachRepository.findById(id).get();
		CoachResponse coachResponse = new CoachResponse(coach);
		return coachResponse;
	}

}
