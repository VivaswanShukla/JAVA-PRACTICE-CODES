package com.codes;

class MyThreads2 extends Thread{
    public MyThreads2(String name){
        super(name);
    }
    public void run(){
        while (true)
        {
            System.out.println(this.getName());
        }
    }
}
public class threads_5_priorities {
    public static void main(String[] args) {
        MyThreads2 t1 = new MyThreads2("Vivaswan");
        MyThreads2 t2 = new MyThreads2("Shukla");
        MyThreads2 t3= new MyThreads2("Reet");
        MyThreads2 t4 = new MyThreads2("Sinha");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
