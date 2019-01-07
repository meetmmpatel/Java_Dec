package com.java.method;

public class VoidNonVoidMethods {

    static VoidNonVoidMethods obj = new VoidNonVoidMethods();

    public static void main(String[] args) {

         obj.getNum();
        System.out.println(obj.getString());
        System.out.println(getBoolean());

        if(getBoolean()){
            System.out.println("this is true condition");
        }

        System.out.println(obj.getNum());

    }

    /**
     * What is void and what is non-void ??
     * void == no return
     *
     */

    public void someValue(){
       if (true){

       }
    }

    public String getString(){
        return "This is String";
    }

    public int getNum(){
        return 12 + 12;
    }

    public void getNumSum(){
       int num = 12;
       int numOne = 12;
       int sum = num + numOne;
    }

    public float getFloat(){
        return 12.99f;
    }
    public static boolean getBoolean(){
        return true;
    }

    public static double getDouble(){
        return 34.58;
    }


}
