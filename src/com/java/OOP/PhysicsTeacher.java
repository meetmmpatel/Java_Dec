package com.java.OOP;

public class PhysicsTeacher extends Teacher {
	public static void main(String[] args) {

		PhysicsTeacher obj = new PhysicsTeacher();
		obj.name = "Mike";
		System.out.println(obj.schoolName = "Tj");
		obj.does();

	}

}

class Teacher {
	String designation;
	String name;
	String schoolName;

	void does() {
		System.out.println("Teaching");
	}

}
