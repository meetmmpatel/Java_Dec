package com.java.javaExceptions;

import java.io.IOException;

public class ThrowsExample {


    public static void main(String[] args) {

        ThrowsExample obj = new ThrowsExample();

        try {
           obj.myMethod(12);
       }catch (IOException | ClassNotFoundException e){
            System.out.println("IO Exception or ClassNotFoundException ");
        }

    }

    public void myMethod(int num) throws IOException,ClassNotFoundException {
        if(num == 1){
            throw new IOException("IO Exception Occured");
        }
        else {
            throw new ClassNotFoundException("ClassNotFoundException ");
        }


    }



}
