package com.codes;

class MyThreads3 extends Thread{
    public void run(){
        int i = 0;
        while (i < 7){
            System.out.println("I AM THREAD 1");
            i ++;
        }
    }
}
class Mythreads4 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i < 6){
            System.out.println("I AM THREAD 2");
            i++;
        }
    }
}
public class threads_6_methods {
    public static void main(String[] args) {
        MyThreads3 t1 = new MyThreads3();
        Mythreads4 t2 = new Mythreads4();

        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
