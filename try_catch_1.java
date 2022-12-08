package com.codes;
import java.util.*;
public class try_catch_1 {
    public static void main(String[] args) {
        try {
            int a = 1000;
            int b = 0;
            int c = a / b;
            System.out.println("The value is: " + c);
        }
        catch (Exception e){
            System.out.println("The exception is: " + e);
        }
    }
}
