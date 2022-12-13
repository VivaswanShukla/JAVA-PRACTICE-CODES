package com.codes;
class nested_class_static{
    static int a = 10;
     int b = 9;
     static void display(){
         System.out.println("hello oc");
     }
     public void display1(){
         System.out.println("me---non static");
     }
     static class innerclass1{
         void method(){
             System.out.println("non static method inside a static class");
             System.out.println(nested_class_2.a);
             display();
         }
     }
    public static void main(String[] args) {
        innerclass1 ic = new innerclass1();
        ic.method();
    }
}
