package com.java.loops;

public class BreakExample {
	
	public static void main(String[] args) {
		
		int num =0;
		while(num <= 100) {
			System.out.println(num);
			
			if (num == 5) {
				break;
			}
			num ++;

		}
		System.out.println("Out of the loop");
		System.out.println("One");
		System.out.println("Two");
		System.out.println("Three");
		
	}
	
	

}
