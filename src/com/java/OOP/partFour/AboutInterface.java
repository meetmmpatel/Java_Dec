package com.java.OOP.partFour;

 interface AboutInterface {

    /**
     1. We can't create an instance of an interface, so there is
     no object creation.

     2. Interface class has abstractions as none of it's method
     have the body.

     3. To use an interface you need to use keyword
     "implements"

     4.While providing implementation in class of any method in
     interface , it needs to be mentioned as public

     5. Class that implements an interface must implement all the
     methods from interface.

     6. Interface can not be declared as private or protected.

     7. All the interface methods are by default abstract and public.

     8. Variables declared in interface are public static and final.

     9. Interface variables must be initialized at the time of declaration

     10. Interface can extend only one another Interface

     11. If there is two interface with same method name and class is implementing
     both the interface than class can only have one method from interface.

     12. If an two interfaces with same method but one method have return type
     and another method has no return type than it's compilation error.


     */

    int a = 10;

    //int a is always public static and final



}
