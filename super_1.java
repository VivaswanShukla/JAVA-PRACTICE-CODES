package com.codes;

class base2 {
    int print(int x, int y){
        int z = x+y;
        System.out.println(z);
        return z;
    }
}
class derived2 extends base2{
    int print(int x, int y){
        super.print(5, 6);
        int z = x + y;
        System.out.println(z);
        return z;
    }
}
public class super_1 {
    public static void main(String[] args) {
        derived2 d = new derived2();
        d.print(7, 8);
    }
}
