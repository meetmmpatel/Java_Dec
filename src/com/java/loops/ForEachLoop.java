package com.java.loops;

import java.util.Arrays;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		//Datetype []name = {}, or [5];
		
		int arr[] = {2,3,4,5,6,7};
		String[] str = {"Test","One","Two"};
		
		System.out.println(Arrays.toString(arr));

		double drr[] = {12.99,45.99,87.90};
		
		for (int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//For each loop
		
		for(int n : arr) {
			System.out.println("For each loop " + n);
		}
		
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println(arr.length);
		
		
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		System.out.println(my_array1);
		System.out.println(Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println(Arrays.toString(my_array1));

		
	}

}
