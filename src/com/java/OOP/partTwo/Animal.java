package com.java.OOP.partTwo;

public abstract class Animal {
	
	/**
	1) Abstract method has no body.
	2) Always end the declaration with a semicolon(;).
	3) It must be overridden. An abstract class must be extended and in a 
		same way abstract method must be overridden.
	4) A class has to be declared abstract to have abstract methods.
	 */
	
	
	public abstract void sound();
	public abstract void move();
	
	
	
	public void getInfo() {
		System.out.println("This is not a abstarct method");
	}

}
