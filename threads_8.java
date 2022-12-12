package com.codes;

class thread_8 implements Runnable{
    @Override
    public void run() {
        int i;
        for (i = 0; i <= 30; i++){
            System.out.println("Thread 1");
        }
    }
}
class thread_8_1 implements Runnable{
    @Override
    public void run() {
        int i;
        for(i = 0; i <= 30; i++){
            System.out.println("Thread 2");
        }
    }
}
public class threads_8 {
    public static void main(String[] args) {
        thread_8 t1 = new thread_8();
        Thread th = new Thread(t1);
        thread_8_1 t2 = new thread_8_1();
        Thread th1 = new Thread(t2);
        th.start();
        th1.start();
    }
}
