package com.java.OOP.partThree;

public class Ford  extends CarClass {

    @Override
    public int speedLimit() {
        return 90;
    }

    public static void main(String[] args) {

        CarClass car = new Ford();
         int num = car.speedLimit();
        System.out.println(num);

    }


}


class CarClass{

    public int speedLimit(){
        return 70;
    }

}
