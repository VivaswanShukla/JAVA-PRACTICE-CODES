package com.codes;
class Table{
    synchronized void display(int n){
        for(int i = 0; i <= 10; i++){
            System.out.println(n * i);
        }
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class myThread10 extends Thread{
    Table t;
    myThread10(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.display(5);
    }
}
class myThread20 extends Thread{
    Table t;
    myThread20(Table t){
        this.t = t;
    }
    public void run(){
        t.display(10);
    }
}
public class thread_synchronization {
    public static void main(String[] args) {
        Table obj = new Table();
        myThread10 t1 = new myThread10(obj);
        myThread20 t2 = new myThread20(obj);
        t1.start();
        t2.start();
    }
}
