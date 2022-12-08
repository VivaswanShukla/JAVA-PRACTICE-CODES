package com.codes;
import java.util.Scanner;

public class try_catch_nested_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        try{
            System.out.println("Hello nested");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("This index does not exists");
            }
        }catch(Exception e)
        {
            System.out.println("The exception is: " + e);
        }
        System.out.println("CODE ENDED");
    }
}
