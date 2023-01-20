package com.userlogin.app.response;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.userlogin.app.entity.User;

public class UserResponse {
	
	private int id;
	
	private String name;
	
	private String password;
	
	private String mobileNumber;
	
	private String email;
	
	private String dateOfBirth;
	
	private String gender;
	
	private int pincode;
	
	private String city;

	private String state;
	
	private String country;
	
	public UserResponse(User user) {
		this.id=user.getId();
		this.name=user.getName();
		this.password=user.getPassword();
		this.mobileNumber=user.getMobileNumber();
		this.email=user.getEmail();
		this.dateOfBirth=user.getDateOfBirth();
		this.gender=user.getGender();
		this.pincode=user.getPincode();
		this.city=user.getCity();
		this.state=user.getState();
		this.country=user.getCountry();
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
