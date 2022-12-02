package com.quadraticequation;

import java.util.Scanner;

public class Quad {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter a: ");  
		double a = input.nextDouble();  
		System.out.print("Enter b: ");  
		double b = input.nextDouble();  
		System.out.print("Enter c: ");  
		double c = input.nextDouble();  
		
		double r1,r2;
		
		double discriminant=b * b - 4 * a * c;
		
		if(discriminant>0) {
			r1=(-b+Math.sqrt(discriminant))/(2*a);
			r2=(-b-Math.sqrt(discriminant))/(2*a);
			System.out.println("the root are :"+r1+" "+r2);
		}
		else if(discriminant==0) {
			r1=r2=-b/(2*a);
			System.out.println("the root is :"+r1);
		}
		else {
			System.out.println("The equations does not have real roots.");
		}

	}

}
