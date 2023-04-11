package com.bldea.encapsulation.pkg1;

class Dog{
	String name;
	int cost;
	String breed;
	Dog(){
		this("tommy");
		System.out.println("Inside cons-1");
	}
	Dog(String name){
		this("rocky",5000);
		System.out.println("Inside cons-2");
	}
	Dog(String name, int cost){
		this("snoofy",8000,"GR");
		System.out.println("Inside cons-3");
	}
	Dog(String name, int cost, String breed){
		super();
		System.out.println("Inside cons-4");
	}
}

public class Launch1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
	}
}
