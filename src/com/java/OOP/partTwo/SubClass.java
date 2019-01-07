package com.java.OOP.partTwo;

public class SubClass extends ParentClass {

	public SubClass() {
		super();
		System.out.println("this is sub class constuctor");
	}

	public SubClass(int num) {
		super(10);
		System.out.println("this is subclass with num" + num);
	}

	public void display() {
		super.display();
		super.getInfo("Test");
		System.out.println("this is child display method");
		System.out.println(super.num);
	}

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.display();
		SubClass objOne = new SubClass(20);
		objOne.display();
		objOne.getInfo("Info");
	}

}

class ParentClass {
	
	int num = 100;

	public ParentClass() {
		System.out.println("This is super class Constucture");
	}

	public ParentClass(int num) {
		System.out.println("this is super class with num" + num);
	}

	public void display() {
		System.out.println("This is display method in super class");
	}

	public void getInfo(String str) {
		System.out.println("This is info Method with Str value " + str);
	}

}
