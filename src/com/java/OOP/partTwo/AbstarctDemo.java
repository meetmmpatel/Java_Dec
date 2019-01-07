package com.java.OOP.partTwo;

public class AbstarctDemo extends Sum {

	@Override
	public int sumOfTwo(int numOne, int numTwo) {
		// TODO Auto-generated method stub
		return numOne + numTwo;
	}

	@Override
	public int sumofThree(int numOne, int numTwo, int numThree) {
		// TODO Auto-generated method stub
		return numOne + numTwo + numThree;
	}

	public static void main(String[] args) {
		Sum obj = new AbstarctDemo();

		System.out.println(obj.sumOfTwo(12, 12));
		System.out.println(obj.sumofThree(10, 10, 10));
		obj.display();

	}

}

abstract class Sum {
	public abstract int sumOfTwo(int numOne, int numTwo);

	public abstract int sumofThree(int numOne, int numTwo, int numThree);

	public void display() {
		System.out.println("This is abstract class");
	}

}
