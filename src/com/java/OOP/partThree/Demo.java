package com.java.OOP.partThree;

public class Demo extends SimpleCalculator {


    /**
     * Compile Time or Static Polymorphism
     * @ example of Compile time polymorphism is method overloading
     *
     * Runtime or Dynamic Polymorphism
     * @ Example of Dynamic polymorphism is method over riding.
     */
    public static void main(String[] args) {

        SimpleCalculator obj = new SimpleCalculator();

        System.out.println( obj.add(12,12));
        System.out.println(obj.add(34,56,78));


    }



}


class SimpleCalculator{

    int add (int a , int b){
        return a + b;
    }

    int add (int a , int b , int c){
        return a + b + c;
    }



}
