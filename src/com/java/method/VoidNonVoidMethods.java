package com.java.method;

public class VoidNonVoidMethods {



    public static void main(String[] args) {

        // To access the static void and non-void methods
        getName();
        getSum();

        // To access non static void and non-void methods.
        VoidNonVoidMethods obj = new VoidNonVoidMethods();
        obj.getNumSum();
        obj.getInformation();

    }

    /**
     * What is void and what is non-void ??
     * void == no return
     *
     */


    // Static method with void and non- void
    public static void getName(){
        System.out.println("This is static void method");
    }

    //Non void method you must mentioned data types.
    public static int getSum(){
        System.out.println(12);
        return 12;
    }


    public  void getInformation(){
        System.out.println("This is static method");
    }

    public int getNumSum(){

        return 12;
    }





}
