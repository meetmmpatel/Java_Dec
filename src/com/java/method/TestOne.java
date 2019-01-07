package com.java.method;

public class TestOne {
    public static void main(String[] args) {

        System.out.println(smallestValue(23, 45, 67));
        System.out.println(largestValue(3,5,7));
        System.out.println(middleValue("java is good coding language"));
        System.out.println(vowels("Write a Java method to count all vowels in a string"));

    }

    public static int smallestValue(int numOne, int numTwo, int numThree) {

        int temp = (numOne < numTwo) ? numOne : numTwo;
        int result = (temp < numThree) ? temp : numThree;

        return result;


    }
    public static int largestValue(int numOne, int numTwo, int numThree) {

        int temp = (numOne > numTwo) ? numOne : numTwo;
        int result = (temp > numThree) ? temp : numThree;

        return result;


    }

    public static String middleValue(String str){
        int position;
        int length;

        if(str.length() % 2 == 0){
            position = str.length()/2 - 1;
            length = 2;
        }
        else {
            position = str.length()/2;
            length = 1;
        }
        return str.substring(position,position + length);


    }

    public static int vowels(String string){

        int count = 0;

        for (int i = 0; i < string.length(); i++){

            if(string.charAt(i) == 'a'
                    || string.charAt(i) == 'e'
                    || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o'
                    || string.charAt(i) == 'u')
            {
            count ++;
            }

        }
        return count;

    }





}
