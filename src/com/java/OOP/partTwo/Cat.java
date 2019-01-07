package com.java.OOP.partTwo;

public class Cat extends Animal {

	@Override
	public void sound() {
	System.out.println("Cat Sound");
		
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
