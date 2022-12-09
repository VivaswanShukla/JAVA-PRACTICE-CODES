package com.codes;
class this1{
    int a;
    int b;

    public int getA() {
        return a;
    }
    public int getB(){
        return b;
    }

    this1(int x, int y){
        this.a = x;
        this.b = y;
    }
}
public class this_1 {
    public static void main(String[] args) {
        this1 t1 = new this1(10, 30);
        System.out.println("The value of a is: " + t1.getA());
        System.out.println("The value of b is: " + t1.getB());
    }
}
