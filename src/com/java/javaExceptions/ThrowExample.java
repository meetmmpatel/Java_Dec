package com.java.javaExceptions;

public class ThrowExample {

    // Class will checking that age of student
    // if student age is < 12 and weight < 40 for join program
    // Write the java code that support this eligible criteria;


    public static void main(String[] args) {
        System.out.println("Welcome to Enrollment process");
        checkEligiblilty(14,44);
        System.out.println("Have a nice day");
    }



    public static void checkEligiblilty(int age, int weight){

        if(age < 12 && weight < 40){
            throw new ArithmeticException("Student is not eligible for enrollment");
        }else {
            System.out.println("Student is Valid to enrollment");
        }



    }


}
