package com.java.OOP.partFour;

public class Demo implements MyInterface {

    static final int number = 15;

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.methodOne();
        obj.methodTwo();
        System.out.println(number);


    }

    @Override
    public void methodOne() {
        System.out.println("This is method one");

    }

    @Override
    public void methodTwo() {
        System.out.println("This is method two");

    }
}


interface MyInterface{

    /**
     * Compiler will treat all the methods in Interface as abstract
     * method
     *
     * We must override the abstract methods
     * abstract will not have body
     *
     */

    public void methodOne();
    public void methodTwo();

}
