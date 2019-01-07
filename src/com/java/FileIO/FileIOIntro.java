package com.java.FileIO;

import java.io.File;

public class FileIOIntro {

    public static void main(String[] args) {
        File file = new File("/Library/Documentation");
        String[] fileList = file.list();
        for(String name: fileList){
            System.out.println(name);
        }
    }
}
