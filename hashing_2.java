package com.codes;

import java.util.HashSet;

public class hashing_2 {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>(5, 0.75f);
        HashSet<String> h2 = new HashSet<>(2, 0.75f);
        h1.add("Vivaswan");
        h1.add("Kushagra");
        h1.add("Vasu");

        h2.add("Reet");
        h2.add("Madhav");

        h1.addAll(h2);
        System.out.println(h1);
//        h1.remove("Kushagra");
//        System.out.println(h1);
//        h1.removeAll(h2);
        System.out.println(h1);
        h1.clone();

    }
}
