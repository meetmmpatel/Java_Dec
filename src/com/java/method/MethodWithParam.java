package com.java.method;

public class MethodWithParam {

    public static void main(String[] args) {

        sumOfTwo(12,12);
        System.out.println(multiply(12,12));
        System.out.println(getNum(23.89,12.99f,true));
    }


    public static void sumOfTwo(int numOne, int numTwo){
        System.out.println(numOne + numTwo);

    }

    public static int multiply(int numOne, int numTwo){
        return numOne * numTwo;
    }

    public static int getNum(double d, float f, boolean b){

        int sum = (int) ( d + f);
        return sum;
    }


}
