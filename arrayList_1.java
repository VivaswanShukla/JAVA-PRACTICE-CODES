package com.codes;

import java.util.ArrayList;

public class arrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
//        add() adds an element to the list
        l2.add(1);
        l2.add(3);
        l2.add(5);
        l2.add(7);

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);

//        add(index, element) adds the element to the given index
        l1.add(3, 70);
        l1.add(3, 80);

//        addAll() adds another list into the existing list ,, addAll(index, l2) adds the elements from the given index
        l1.addAll(0, l2);

        l1.remove(3);  //removes the element present on the particular index
//        l1.clear(); clears the list
        System.out.println(l1);
        System.out.println(l1.contains(55));// returns boolean value
        System.out.println(l1.clone());
        System.out.println("The index is: " + l1.indexOf(50)); // returns the index at which the element is present
        for (int i  = 0; i< l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
