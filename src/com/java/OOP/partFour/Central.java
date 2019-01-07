package com.java.OOP.partFour;

public class Central implements A {


    @Override
    public int move(int a) {
        return 0;
    }
}


interface A{

    public int move(int a);
}

interface B{
    public void move(int b);
}
