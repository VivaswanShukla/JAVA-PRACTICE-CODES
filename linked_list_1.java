package com.codes;

import java.util.LinkedList;

public class linked_list_1 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        
        l.addFirst(10);
        l.addLast(60);
        System.out.println(l);
    }
}
