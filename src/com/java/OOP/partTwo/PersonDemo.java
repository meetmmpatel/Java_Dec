package com.java.OOP.partTwo;

public class PersonDemo extends Person {

	
	

	public static void main(String[] args) {
		
		PersonDemo demo = new PersonDemo();
		demo.setAge(30);
		System.out.println(demo.getAge());
		demo.setSsn(8989);
		System.out.println(demo.getSsn());
		demo.setName("Steve");
		System.out.println(demo.getName());
		demo.setAddress("120 Main st");
		System.out.println(demo.getAddress());
		
		
		
	}

}
