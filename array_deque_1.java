package com.codes;

import java.util.ArrayDeque;

public class array_deque_1 {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>(5);
        ad.add("Vivaswan");
        ad.add("Kushagra");
        ad.add("Madhav");
        ad.addFirst("Reet");
        ad.addLast("Vasu");

        System.out.println(ad);
    }
}
