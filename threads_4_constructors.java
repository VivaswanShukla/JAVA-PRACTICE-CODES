package com.codes;

class MyThreads extends Thread{
    public MyThreads(String name){
        super(name);
    }
}
public class threads_4_constructors {
    public static void main(String[] args) {
        MyThreads t = new MyThreads("Vivaswan");
        MyThreads t2 = new MyThreads("Reet");
        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        t.start();

        System.out.println("ID: " + t2.getId());
        System.out.println("Name: " + t2.getName());
    }
}
