package com.java.javaExceptions;

public class TrhowAndThrows {

    /**
     *
     * 1. Throws clause is used to declare an exception, which means it works like Try_catch
     *    block, for throw keyword is used to throw an exception explicitly.
     *
     * 2. Throws word used on method signature vs Throw used in method body.
     *
     * 3. Throw you can create one exception at one time vs Throws you can handle
     *      multiple exceptions
     *

     */

       public int division (int a , int b) throws ArithmeticException{
           int c = a/b;

           return c;
       }

       public int divisionDemo(int a , int b){
           int c = a/b;
           if(a == 0 || b == 0){
               throw new ArithmeticException("ArithmeticException");
           }
           else {
               return  c;
           }
       }

    public static void main(String[] args) {
        TrhowAndThrows obj = new TrhowAndThrows();

        System.out.println(obj.division(2,0));
        System.out.println(obj.divisionDemo(2,0));

    }




}
