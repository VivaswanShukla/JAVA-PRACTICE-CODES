package com.codes;

import java.util.Scanner;

interface Bike{
    void speedUp(int increment);
    void speedDown(int decrement);
}
class RoyalEnfield implements Bike{
    int speed = 0;
    RoyalEnfield(int Speed){
        speed = Speed;
    }
    void show(){
        System.out.println("I AM CLASSIC 350");
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("The increased speed: " + speed);
    }

    @Override
    public void speedDown(int decrement) {
        speed  = speed - decrement;
        System.out.println("The decreased speed is: " + speed);
    }
}
public class interface_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed:");
        int speed = sc.nextInt();
        RoyalEnfield rf = new RoyalEnfield(speed);
        rf.speedUp(5);
    }
}
