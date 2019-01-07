package com.java.method;

public class Boy {

   static Boy obj = new Boy();
    public static void main(String[] args) {
        Human.walk();

         obj.talking();

    }

    public void talking() {
        System.out.println("Boy is talking");
    }
}
