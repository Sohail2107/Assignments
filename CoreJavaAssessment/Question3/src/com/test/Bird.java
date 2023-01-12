package com.test;

public class Bird extends Animal{

	@Override
    public void eat() {
        
        System.out.println("Bird eat");
    }

    @Override
    public void sleep() {
        
        System.out.println("Bird sleep");
    }
	public void fly()
    {
        System.out.println("in fly method");

    }
}
