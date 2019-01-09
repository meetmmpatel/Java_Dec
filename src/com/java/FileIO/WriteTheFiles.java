package com.java.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTheFiles {


    public static void main(String[] args)throws IOException {
        usingBufferWritter();

    }

    private static void usingBufferWritter() throws IOException{

        String fileContent = "Welcome to file IO";
        BufferedWriter bufferedWriter = new BufferedWriter
                (new FileWriter("TextFileOne.txt"));

        bufferedWriter.write(fileContent);
        bufferedWriter.close();


    }



}
