package com.java.OOP.partFour;

public class DemoTwo implements MyIntTwo {


    @Override
    public void methodOne() {

    }

    @Override
    public void methodTwo() {

    }
}

interface MyIntOne{
    public void methodOne();

}

interface MyIntTwo extends MyIntOne{

    public void methodTwo();
}
