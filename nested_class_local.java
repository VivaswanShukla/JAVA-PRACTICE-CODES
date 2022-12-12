package com.codes;

public class nested_class_local {
        int a = 10;
        public void display() {
            System.out.println("hello");
            int b = 20;
            class local_inner {
                public void show() {
                    System.out.println(a + b);
                }
            }
            local_inner li = new local_inner();
            li.show();
        }

    public static void main(String[] args) {
        nested_class_local ncl = new nested_class_local();
        ncl.display();
    }
}
