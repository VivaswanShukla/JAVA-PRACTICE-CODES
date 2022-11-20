package com.codes;
class base1{
    base1() {
        System.out.println("I AM A CONSTRUCTOR IN BASE CLASS");
    }
    base1(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }
}
class derived1 extends base {
    derived1() {
        System.out.println("I AM A CONTRUCTOR IN DERIVED CLASS");
    }
    derived1(int x, int y, int z) {
        int a = x * y * z;
        System.out.println(a);
    }
}
public class constructor_2_overloading {
    public static void main(String[] args) {
//        base1 b = new base1(5, 6);
//        base1 b = new base1();
        derived1 d = new derived1(2, 3, 4);
        derived1 d1 = new derived1();

    }
}
