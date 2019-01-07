package com.java.OOP.partFour;



interface myInterface {

    /**
     * Can not creat an instance of an interface
     * You can implements multiple interfaces in Single class
     * You can have abstract method in interface .
     */

}

interface Scan{

}
interface Fax{

}

class Printer  implements Scan, Fax {

}
