package com.agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the date of birth:");
		String dob=input.next();
		String[] splitdate=dob.split("/");
		
		LocalDate localDate = LocalDate.of(Integer.parseInt(splitdate[2]),Integer.parseInt(splitdate[1]),Integer.parseInt(splitdate[0]));
		
		LocalDate currentdate=localDate.now();
		
		Period period=Period.between(localDate, currentdate);
		
		System.out.println("You are "+period.getYears()+" years, "+period.getMonths()+" months, "+period.getDays()+" days old");
		
	}

}
