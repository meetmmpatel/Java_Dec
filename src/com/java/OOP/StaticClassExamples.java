package com.java.OOP;

public class StaticClassExamples {
	
	static String str = "Java Static Class";
	
	//Static class
	
	
	static class MyNestedStaticClass {
		
		public void disply() {
			System.out.println(str);
		}
		
	}
	
	public static void main(String[] args) {
		StaticClassExamples.MyNestedStaticClass obj = 
				new StaticClassExamples.MyNestedStaticClass();
		
		obj.disply();
	}
	
	

}
