package com.test;

public class WildAnimal extends Animal {

	@Override
    public void eat() {
        
        System.out.println("Animal eat");
    }

    @Override
    public void sleep() {
        
        System.out.println("Animal sleep");
    }

    public void Kill()
    {
        System.out.println("Animal Kill");

    }
}
