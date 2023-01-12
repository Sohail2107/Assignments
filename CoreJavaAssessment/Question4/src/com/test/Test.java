package com.test;

import javax.xml.validation.Validator;

public class Test {
	
	public void validateAge(Candidate candidate) throws AgeException {
		
		if(candidate.getAge()<21) {
			throw new AgeException("Under Age");
		}else if(candidate.getAge()>60) {
			throw new AgeException("Over Age");
		}else {
			System.out.println("Age entered is accepted");
		}
	}
     public void validateEducation(Candidate candidate) throws EduException {
		
		if(!candidate.getEducation().equals("BTech")) {
			throw new EduException("Sorry, invalid education");
		}else {
			System.out.println("Educationcal Degree is Accepted");
		}
	}
	
	public static void main(String[] args) throws AgeException, EduException {
		
		Candidate candidate = new Candidate();
		candidate.setAge(23);
		candidate.setName("John");
		candidate.setEducation("BTech");
		
		Test test = new Test();
		test.validateAge(candidate);
		test.validateEducation(candidate);
	}
}
