package com.java.loops;

public class DoWhileLoop {
	
	/**
	do
		{
		   statement(s);
		} while(condition);
	 */
	
	public static void main(String[] args) {
		
		int i = 10;
		do {
			System.out.println(i);
			i--;
		}while(i >= 100);
		
		int arr[] = {3,4,5,6,7,8};
		
		int j = 0;
		do {
			System.out.println(arr[j]);
			j++;
		}while(j < arr.length);
		
		
		
	}
	
	

}
