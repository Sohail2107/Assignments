package com.test;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		
		    Author author1 =new Author("John", 37, "Male");
	        Author author2 =new Author("Ron",23, "Male");
	        Author author3 =new Author("Jenny", 28, "Female");
	        Author author4 =new Author("Tom", 46, "Male");
	        Author author5 =new Author("Jack", 67, "Male");
	        
	        Book[] book =new Book[5];
	        book[0] =new Book("Life", author1, 100, 500, 10);
	        book[1] =new Book("Water", author2, 300, 1600, 12);
	        book[2] =new Book("Earth", author3, 300, 700, 13);
	        book[3] =new Book("Sun", author4, 00,900, 14);
	        book[4] =new Book("Moon", author5, 178, 450, 15);
	        
	        try {
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter book index number :");
	        int indexnumber = scanner.nextInt();
	        System.out.println("Details of the book:"+book[indexnumber]);
	        }catch(Exception e) {
	            System.out.println(e.getMessage());
	        }

	    }

}


