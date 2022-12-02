package com.constructorproblem;

public class Example2 {

	public Example2() {
		System.out.println("1");
	}
	public Example2(int a) {
		this();
		System.out.println("2");
	}
	public Example2(int a,int b) {
		this(2);
		System.out.println("3");
	}
	public Example2(int a,int b,int c) {
		this(2,3);
		System.out.println("4");
	}
	public static void main(String[] args) {
		Example2 example2 = new Example2(4,5,6);
		
	}

}
