package com.java.OOP;

public class ClassA {
    public static void main(String[] args) {
        int value = B.numOne;
        System.out.println(value);
        String s = B.str;
        System.out.println(s);

    }   
    
}

class B{
    static int numOne = 10;
    static String str = "Test";
    
}
