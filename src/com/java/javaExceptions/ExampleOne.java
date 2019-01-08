package com.java.javaExceptions;

public class ExampleOne {

    public static void main(String[] args) {
        int numOne = 5;
        double numTwo;
        numOne = 0;

        try {

            numTwo = 60/numOne;
            System.out.println(numTwo);
            System.out.println("This is the end of Try block");

        }catch (ArithmeticException e){
            System.out.println("There is an arithmetic exception occurred");

        }catch (NullPointerException e){
            System.out.println("Value is not provided ");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

    }
}
