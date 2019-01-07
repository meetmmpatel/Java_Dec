package com.java.dayone;

public class DemoDayOne {

	/**
	 * Method(functions) variables
	 * 
	 * void = no return
	 */
	
	int number = 24;
	public static void main(String[] args) {

		// Data type variable name = value
		int num = 12;

		System.out.println("2 + 2");
		System.out.print("This is method");
		System.out.print(10 / 5);
		System.out.println(45 - 23);
		System.out.println(num);

		VariableDemo obj = new VariableDemo();
		obj.getNumbers();
		VariableDemo.foo();
		int value = VariableDemo.a;
		
	}
	
	public  void someMethod() {
		System.out.println("I am some method");
	}

	
}
