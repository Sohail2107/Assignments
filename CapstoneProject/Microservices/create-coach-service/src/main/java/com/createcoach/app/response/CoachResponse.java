package com.createcoach.app.response;

import com.createcoach.app.entity.Coach;

public class CoachResponse {
	
	
	private int id;
	
	private String name;
	
	private String password;
	
	private String mobileNumber;
	
	private String dateOfBirth;
	
	private String gender;
	
	private String speciality;
	
	public CoachResponse(Coach coach) {
		this.id=coach.getId();
		this.name=coach.getName();
		this.password=coach.getPassword();
		this.mobileNumber=coach.getMobileNumber();
		this.dateOfBirth=coach.getDateOfBirth();
		this.gender=coach.getGender();
		this.speciality=coach.getSpeciality();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	


}
