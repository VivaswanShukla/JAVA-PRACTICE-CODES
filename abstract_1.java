package com.codes;
abstract class parent2{
    parent2(){
        System.out.println("HELLO I AM CONSTRUCTOR");
    }
    abstract public void printSum();
}
class child2 extends parent2{
    int a;
    int b;
    int c;
    public void printSum(){
         int a = 101;
         int b = 202;
         int c=a+b;
        System.out.println(c);
    }
}
public class abstract_1 {
    public static void main(String[] args) {
        child2 c2 = new child2();
//        c2.printSum();
        //       c2.show(c2.printSum());
        c2.printSum();

    }
}
