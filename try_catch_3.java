package com.codes;
import java.util.Scanner;

public class try_catch_3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int [] marks = new int[5];
            for(int i = 0; i < 5; i++){
                System.out.println("Enter the value for index " + i + ": ");
                marks[i] = sc.nextInt();
            }
            System.out.println("Enter the index: ");
            int ind = sc.nextInt();

            System.out.println("Enter the no with which you want to divide the value: ");
            int num = sc.nextInt();

            System.out.println("The value in the array at index " + ind + "is: " + marks[ind]); // will enter 6 as index
            System.out.println("The value of marks[ind]/num is: " + marks[ind]/num);
        }
        catch (Exception e){
            System.out.println("Some error occurred");
            System.out.println("The error is: " + e);// prints ArrayIndexOutOfBoundsException
        }
        System.out.println("Program ends");//code runs successfully
    }
}
