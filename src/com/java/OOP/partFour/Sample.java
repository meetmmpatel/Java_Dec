package com.java.OOP.partFour;

public class Sample {

    public int num;
    protected int numOne;
    private int numTwo;
     int numThree;


}


abstract class SampleOne extends Sample{

    public void getInfo(){
        System.out.println("Some Method");
    }

    public abstract void getNum();

}

 interface SampleInterface{
    public void getInfo();

}
