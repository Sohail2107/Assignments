package com.test;

public class Test {

	public static void main(String[] args) {
		Bird bird= new Bird();
	    System.out.println("Bird methods using bird Instance");
	    bird.eat();
	    bird.sleep();
	    bird.fly();

	    WildAnimal wildAnimal= new WildAnimal();
	    System.out.println("Wild Animal using wildanimal Instance");
	    wildAnimal.eat();
	    wildAnimal.sleep();
	    wildAnimal.Kill();

	    System.out.println("Calling Bird method with animal instance");
	    Animal birdAnimal=new Bird();
	    birdAnimal.eat();
	    birdAnimal.sleep();

	    System.out.println("Calling WildAnimal method with animal instance");
	    Animal animal=new WildAnimal();
	    animal.eat();
	    animal.sleep();   
	    }
	}


