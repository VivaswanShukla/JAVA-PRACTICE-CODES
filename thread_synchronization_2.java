package com.codes;
class table{
    synchronized void display(int n){
        for(int i = 0; i <= 10; i++){
            System.out.println(n*i);
        }
    }
}
class myThread11 extends Thread{
    table t;
    myThread11(table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.display(12);
    }
}
class myThread21 extends Thread{
    table t;
    myThread21(table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.display(15);
    }
}
public class thread_synchronization_2 {
    public static void main(String[] args) {
        table t1 = new table();
        myThread11 m1 = new myThread11(t1);
        myThread21 m2 = new myThread21(t1);
        m1.start();
        m2.start();
    }
}
