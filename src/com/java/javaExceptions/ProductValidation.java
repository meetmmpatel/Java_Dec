package com.java.javaExceptions;

public class ProductValidation {

    /**

     1. Create your own exception class and name it as InvalidProductException
     2. Create Constructor in InvalidProductException class and provide String as input
        parameter

     3. Create another class ProductValidation
     4. Create the method that validate product weight, if weight is more than 100 pound
        throw InvalidProductException
     5. You need call in your main method.

     */

    public void productCheck(int weight) throws InvalidProductException {
        if(weight > 100){
            throw new InvalidProductException("Product is invalid");

        }
        else {
            System.out.println("Product is valid");
        }
    }

    public static void main(String[] args) {
        ProductValidation obj = new ProductValidation();
        try {
            obj.productCheck(90);
        }catch (InvalidProductException ex){
            System.out.println(ex.getMessage());
        }
    }

}

class InvalidProductException extends Exception{
     public InvalidProductException(String str){
         super(str);
     }


}
