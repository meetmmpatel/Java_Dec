package com.java.OOP.partTwo;

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Dog makes sounds");
		
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
