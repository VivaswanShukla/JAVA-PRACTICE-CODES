package com.codes;
import java.util.Scanner;
abstract class parent3{
    parent3(){
        System.out.println("Hello");
    }
    abstract void printOutput();
}
class child3 extends parent3{
    public void printOutput(){
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println("The value is: " + c);
    }
}
public class abstract_2 {
    public static void main(String[] args) {
        child3  c3 = new child3();
        c3.printOutput();
    }
}
