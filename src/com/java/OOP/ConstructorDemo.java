package com.java.OOP;

public class ConstructorDemo {

    /**
     * Constructor ??
     *
     * Constructor is always public
     * Same name is class name.
     *
     */

    //no-arg Constructor
    public ConstructorDemo(){

    }

    public String str;
    public int numOne;
    public  boolean b1;


    public ConstructorDemo(String str, int numOne, boolean b1) {
        this.str = str;
        this.numOne = numOne;
        this.b1 = b1;
    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo objOne = new ConstructorDemo("str",12,true);

    }


}
