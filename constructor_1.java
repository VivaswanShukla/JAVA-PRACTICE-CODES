package com.codes;
class base {
    base()
    {
        System.out.println("I AM IN BASE AND I AM AN CONSTRUCTOR");
    }
}

class derived extends base{
    derived(){
        System.out.println("I AM IN DERIVED AND I AM AN CONSRTUCTOR");
    }
}

public class constructor_1 {
    public static void main(String[] args) {
//        base b = new base();
        derived d = new derived();
    }
}
