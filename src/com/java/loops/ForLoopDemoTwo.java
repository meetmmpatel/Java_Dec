package com.java.loops;

public class ForLoopDemoTwo {
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21
	
	public static void main(String[] args) {
		int count = 8;
		int  numOne = 0;
		int numTwo = 1;
		
		
		for (int i = 1; i <= count; i++) {
			
			System.out.println(numOne + " ");
			int sumOfPrevTwo = numOne + numTwo;
			numOne = numTwo;
			numTwo = sumOfPrevTwo;
			
			
			
		}
		
		
	}

}
