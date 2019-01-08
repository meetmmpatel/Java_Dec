package com.java.javaExceptions;

public class TryCatchFinally {

    /**

     try {
     //Statements that may cause an exception
     }
     catch {
     //Handling exception
     }
     finally {
     //Statements to be executed
     }
     */

    public static void main(String[] args) {
        try{
            int num = 120/0;
            System.out.println(num);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        finally {
            System.out.println("Print this statement anyway!!");
        }


    }

}
