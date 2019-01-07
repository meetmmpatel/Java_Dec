package com.java.method;

public class MethodIntro {


    /**
     * Static and Non-static methods
     * void and non-void methods
     * method with parameter(arguments) or without parameters
     */

    String str = "Test";
    static MethodIntro obj = new MethodIntro();

    public static void main(String[] args) {

        System.out.println(obj.str);

        obj.getInfo();
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
