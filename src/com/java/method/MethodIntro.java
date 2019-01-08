package com.java.method;

public class MethodIntro {

    /**
     * Static and Non-static methods
     * void and non-void methods
     * method with parameter(arguments) or without parameters
     */

    public static void main(String[] args) {

        //To access non-static method
        MethodIntro obj = new MethodIntro();
        obj.getInfo();

        // To access static method.
        getStatic();
    }

    public void getInfo() {
        System.out.println("This is non static method");
        getStatic();
    }

    public static void getStatic() {
        System.out.println("This is static method");

    }


}
