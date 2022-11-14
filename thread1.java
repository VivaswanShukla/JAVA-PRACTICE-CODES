package com.codes;
class Mythread1 extends Thread{
    public void run()
    {int i=0;
        while(i<10)
        {
            System.out.println("I AM IN THREAD 1");
            i++;
        }
    }
    public void print()
    {
        System.out.println("HEYYY");
    }
}
class Mythread2 extends Thread{
        public void run()
        {int i=0;
            while(i<10)
            {
                System.out.println("I AM IN THREAD 2");
                i++;
            }
        }
        public void print1()
        {
            System.out.println("HELLIO");
        }
}
public class thread1 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
        t1.print();
        t2.print1();
    }
}
