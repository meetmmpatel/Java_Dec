package com.java.OOP;

public class LunchDemo {

    public String bread;
    public String drink;
    public String pasta;
    public String water;
    public String chips;

    public LunchDemo(String bread, String drink, String water) {
        this.bread = bread;
        this.drink = drink;
        this.water = water;
    }

    public LunchDemo(String bread, String drink, String pasta, String water, String chips) {
        this.bread = bread;
        this.drink = drink;
        this.pasta = pasta;
        this.water = water;
        this.chips = chips;
    }

    public static void main(String[] args) {

       LunchDemo obj = new LunchDemo("brown","cola","normal");
        System.out.println(obj.bread);
        System.out.println(obj.drink);
        System.out.println(obj.water);

        LunchDemo objOne =
                new LunchDemo("Brown","coke","Hot","normal","chitoz");
        System.out.println(objOne.bread +" " + objOne.water +" "+ objOne.pasta);

    }

}
