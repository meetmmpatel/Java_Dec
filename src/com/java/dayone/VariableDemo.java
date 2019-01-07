package com.java.dayone;

public class VariableDemo {

	/**
	 * There are three types of variables in Java. 
	 * 1) Local variable 
	 * 2) Static (or class) variable 3) Instance variable
	 */

	// Globle Variable
	static String myVar = "this is class";
	static int numOne = 24;
	static int a = 12;

	public static void main(String[] args) {

		foo();
		// Local Variable
		String myVar = "This is method";
		int a = 10;
		System.out.println(myVar);
		System.out.println(numOne);
		System.out.println(a);

		// Class name refName = new Class name;
		VariableDemo obj = new VariableDemo();
		obj.getNumbers();
		
		DemoDayOne objOne = new DemoDayOne();
		objOne.someMethod();
	}

	public static void foo() {
		System.out.println(myVar);
		System.out.println(a);
	}
	
	public void getNumbers() {
		System.out.println( 10 + 4);	
	}

}
