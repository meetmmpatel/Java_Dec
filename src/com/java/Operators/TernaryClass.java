package com.java.Operators;

public class TernaryClass {

	// variable name = (expression) ? if true : false

	public static void main(String[] args) {
		int numOne = 10;
		System.out.println(numOne);
		int numTwo;
		
		numOne = 25;
		System.out.println(numOne);
		
		numTwo = (numOne == 25) ? 100 : 200;
		
		System.out.println(numTwo);
		
		int num1 = 100;
		int num2 = 109;
		int num3 = 189;
		
		int temp = (num1 > num2) ?num1: num2;
		System.out.println(temp);
		
		int result = (num3 > temp)? num3 : temp;
		System.out.println(result);

	}
	
	
	// num1 = 100
	// num 2 = 109
	// num 3 = 189;
	
	// use ternary oprator and find the largest value.??

}
