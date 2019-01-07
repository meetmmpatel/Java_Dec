package com.java.OOP;

public class JavaExample extends DemoClass {

	void display() {
		System.out.println("This is Child Constructor");
		super.display();
	}

	public static void main(String[] args) {
		JavaExample obj = new JavaExample();
		obj.display();

	}

}

class DemoClass {

	public DemoClass() {
		System.out.println("This is super constructor");
	}

	void display() {
		System.out.println("Super Mehtod");

	}

}
