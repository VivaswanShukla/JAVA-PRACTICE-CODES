package com.codes;
class Bike1{
    int wheels = 2;
}
class hero extends Bike1{
    void display(){
        System.out.println("hero motocorps");
        System.out.println("No of wheels: " + super.wheels);
    }
}
public class super_2 {
    public static void main(String[] args) {
        hero obj = new hero();
        obj.display();
    }
}
