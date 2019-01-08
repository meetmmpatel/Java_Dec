package com.java.javaExceptions;

public class ExampleTwo {

    public static void main(String[] args) {

        try{
            int arr[] = new int[7];
            arr[44] = 30/1;
            System.out.println("End of Try block");

        }catch (ArithmeticException e){
            e.printStackTrace();
            e.getMessage();
            System.out.println("it's an Arithmetic exceptions");}

         catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the index range is out side of an array");

        }catch (Exception e){
            System.out.println("something went wrong");
        }


        System.out.println("out side of try catch block");


    }




}
