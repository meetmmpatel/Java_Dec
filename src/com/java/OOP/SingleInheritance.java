package com.java.OOP;

public class SingleInheritance extends Child {

	public SingleInheritance(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public static void main(String[] args) {

		SingleInheritance obj = new SingleInheritance(20, "Mike", "smith");
		System.out.println(obj);

	}

}

class Child {

	int id;
	String firstName;
	String lastName;

	public Child(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Child{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}
}
