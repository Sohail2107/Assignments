package com.createuser.app.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class CreateUserRequest {
	
	
	private Long id;
	
	@Size(min=3,max=50)
	private String name;
	
	@Size(min=5,max=10)
	private String password;
	
	//@Size(min=10,max=10)
	private String mobileNumber;
	
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	@NotNull(message = "The date of birth is required.")
	//@Past(message = "The date of birth must be in the past.")
	private String dateOfBirth;
	
	@NotBlank(message = "Gender is mandatory")
	private String gender;
	
	
	private int pincode;
	
	@Size(min=6,max=20)
	private String city;
	
	@Size(min=6,max=20)
	private String state;
	
	@Size(min=6,max=20)
	private String country;

	public CreateUserRequest(Long id, @Size(min = 3, max = 50) String name, @Size(min = 5, max = 10) String password,
			 String mobileNumber, @NotBlank(message = "Email is mandatory") String email,
			@NotNull(message = "The date of birth is required.")  String dateOfBirth,
			@NotBlank(message = "Gender is mandatory") String gender, int pincode,
			@Size(min = 6, max = 20) String city, @Size(min = 6, max = 20) String state,
			@Size(min = 6, max = 20) String country) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
