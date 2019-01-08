package com.java.javaExceptions;

public class ArithmeticException_Demo {


    public static void main(String[] args) {

        try {
            int a = 40/0;

        }catch (ArithmeticException e){
            System.out.println("This is Arithmetic exceptions");

        }


    }
}
