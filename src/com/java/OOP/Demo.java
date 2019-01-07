package com.java.OOP;

public class Demo {
	
	public String str;
	public boolean b1;
	
	public Demo() {
		
	}

	public Demo(String strOne, boolean b11) {
	
		this.str = strOne;
		this.b1 = b11;
	}
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		Demo objOne = new Demo("Foo",true);
		System.out.println(objOne.str);
		System.out.println(objOne.b1);
		
		Car carOne = new Car("V8",4,"Black");
		System.out.println(carOne);
		Car carTwo = new Car(4,"Silver");
		System.out.println(carTwo);
		
	}
	
	
	

}
