package com.createcoach.app.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateCoachRequest {

	
	private int id;
	
	@Size(min=3,max=50)
	private String name;
	
	@Size(min=5,max=10)
	private String password;
	
	private String mobileNumber;
	
		
	//@NotNull(message = "The date of birth is required.")
	private String dateOfBirth;
	
	@NotBlank(message = "Gender is mandatory")
	private String gender;
	
	@Size(min=3,max=50)
	private String speciality;

	public CreateCoachRequest(int id, @Size(min = 3, max = 50) String name, @Size(min = 5, max = 10) String password,
			String mobileNumber,  String dateOfBirth,
			@NotBlank(message = "Gender is mandatory") String gender, @Size(min = 3, max = 50) String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.speciality = speciality;
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
