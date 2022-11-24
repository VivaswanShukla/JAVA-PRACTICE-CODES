package com.codes;
import java.util.HashSet;
public class hashing_1 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>(10, 0.75f);
        hash.add(2);
        hash.add(33);
        hash.add(46);
        hash.add(55);
        hash.add(67);
        hash.add(89);
        System.out.println(hash);
        System.out.println(hash.isEmpty());
        System.out.println(hash.size());
        System.out.println(hash.iterator());
        System.out.println(hash.contains(8));
        System.out.println(hash.contains(67));
        System.out.println(hash.clone());
        hash.clear();
        System.out.println(hash);
    }
}
