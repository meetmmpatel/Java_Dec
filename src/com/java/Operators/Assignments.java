package com.java.Operators;

public class Assignments {
	
	//Assignments operators in java are: =, +=, -=, *=, /=, %=
	
	//Auto-increment and * Auto-decrement Operators
	
	public static void main(String[] args) {
		
		int numOne = 10;
		int numTwo = numOne;
	
		System.out.println(numTwo);
		
		numTwo += numOne;
		System.out.println(numTwo);
		
		numTwo -= numOne;
		System.out.println(numTwo);
		
		numTwo *= numOne;
		System.out.println(numTwo);
		
		numTwo /= numOne;
		System.out.println(numTwo);
		
		numTwo %= numOne;
		System.out.println(numTwo);
		
		numTwo ++;
		System.out.println(numTwo);
		
		++ numTwo;
		System.out.println(numTwo);
		
		numTwo --;
		System.out.println(numTwo);
		
		-- numTwo;
		System.out.println(numTwo);
		
	}

}
