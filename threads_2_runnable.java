package com.codes;



class MyThread1Runnable implements Runnable
{
    public void run() {
        int i = 0;
        while(i<40)
        {
            System.out.println("I AM THREAD 1 RUNNABLE");
            i++;
        }
    }
}
class MyThread2Runnable implements Runnable
{
    public void run()
    {
        int i = 0;
        while(i < 40) {
            System.out.println("I AM THREAD 2 RUNNNABLE");
            i++;
        }
    }
}
public class threads_2_runnable {
    public static void main(String[] args) {
        MyThread1Runnable t1 = new MyThread1Runnable();
        Thread s1 = new Thread(t1);

        MyThread2Runnable t2 = new MyThread2Runnable();
        Thread s2 = new Thread(t2);

        s1.start();
        s2.start();
    }
}
