package com.java.OOP;

public class Car {
	
	public String engineType;
	public int    wheels;
	public String color;
	
	public Car(String engineType, int wheels, String color) {
		super();
		this.engineType = engineType;
		this.wheels = wheels;
		this.color = color;
	}

	public Car() {
		super();
	}

	public Car(int wheels, String color) {
		super();
		this.wheels = wheels;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [engineType=" + engineType + ", wheels=" + wheels + ", color=" + color + "]";
	}
	
	
	
	
	

}
