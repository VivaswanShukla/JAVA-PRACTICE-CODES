package com.codes;

class animal{
    animal(){
        System.out.println("Hello, this is na animal");
    }
}
class dog extends animal{
    dog(){
        super();
        System.out.println("I AM A PUG ");
    }
    void bark(){
        System.out.println("Barkinn");
    }
}
public class super_3 {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
    }
}
