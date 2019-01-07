package com.java.OOP;

public class StaticJavaExample {
	
	static int i = 100;
	static String str = "Java OOP Concepts";
	
	static void display() {
		System.out.println(i);
		System.out.println(str);
	}
	
	void function() {
		display();
	}
	
	
	public static void main(String[] args) {
		
		StaticJavaExample obj = new StaticJavaExample();
		obj.function();
		
		display();
		
	}

}
