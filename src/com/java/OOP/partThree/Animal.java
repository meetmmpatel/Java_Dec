package com.java.OOP.partThree;

public class Animal {

    public void sound(){
        System.out.println("Animal is making sound");
    }
}

class Horse extends Animal{

    @Override
    public void sound(){
        System.out.println("Horse makes horse sound");
    }



}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat makes cat sound");
    }
}
