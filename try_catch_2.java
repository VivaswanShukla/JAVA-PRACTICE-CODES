package com.codes;
import java.util.*;
public class try_catch_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first int: ");
            int a = sc.nextInt(); // will take 1000 as first int
            System.out.println("Enter the second int: ");
            int b = sc.nextInt(); // will give x as the input
            int c = a / b;
            System.out.println("The value is: " + c);
        }
        catch (Exception e){
            System.out.println("The exception is: " + e);//code will run successfully and will print the exception as InputMismatchException
        }
    }
}
