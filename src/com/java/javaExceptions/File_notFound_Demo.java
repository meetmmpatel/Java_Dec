package com.java.javaExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_notFound_Demo {
    public static void main(String[] args) {

        try
        {
            File file = new File("/Test.txt");
            FileReader fileReader = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println("File not found exceptions");
        }

    }

}
