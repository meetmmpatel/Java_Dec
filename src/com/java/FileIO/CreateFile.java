package com.java.FileIO;

import java.io.*;
import java.nio.file.Files;

import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        createFileUsingFileClass();
        createFileUsingFileOutPutClass();
        createFileWithNewFileIOClass();
    }

    private static void createFileUsingFileClass()throws IOException {
        File file = new File("TextFileOne.txt");

        //Create The File
        if(file.createNewFile()){
            System.out.println("File is created");
        }
        else {
            System.out.println("File is already exists");
        }
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write("This is test data one file");
        fileWriter.close();

    }
    private static void createFileUsingFileOutPutClass()throws IOException{

        String data = "This is test data for file number two";

        FileOutputStream fileOutputStream = new FileOutputStream("TestFileTwo.txt");
        fileOutputStream.write(data.getBytes());
        fileOutputStream.close();

    }

    private static void createFileWithNewFileIOClass()throws IOException{

        String data = "This is test data for file number three";
        Files.write(Paths.get("TestFileThree.txt"),data.getBytes());
    }

}
