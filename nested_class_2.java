package com.codes;
class nested_class_2{
    static int a = 10;
    public static void display() {
        System.out.println(a);
    }
     static class InnerClass_1{
        InnerClass_1() {
            System.out.println("This is Constructor of InnerClass");
        }
    }
    public static void main(String[] args) {
        System.out.println(nested_class_2.a);
        nested_class_2.display();

        nested_class_2.InnerClass_1 ob =new InnerClass_1();
    }
}
