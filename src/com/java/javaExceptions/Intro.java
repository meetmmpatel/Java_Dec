package com.java.javaExceptions;

public class Intro {


    public static void main(String[] args) {

        int numOne = 10;
        int numTwo = 2;
        Object num = 12.00;
                Object number = "Test";

       try {
           System.out.println(numOne/numTwo);

       }catch (Exception foo){
           System.out.println("you can not divide the number with zero");

       }

        System.out.println("Out of Try catch block");


    }
}
