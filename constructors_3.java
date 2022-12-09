package com.codes;
class gparent{
    gparent(){
        System.out.println("HI, I AM THE GRANDPARENT");
    }
}
class parent extends gparent{
    parent(){
        System.out.println("HI, I AM THE PARENT");
    }
}
class child extends parent{
    child(){
        System.out.println("HI, I AM THE CHILD");
    }
}
public class constructors_3 {
    public static void main(String[] args) {
        child c1 = new child();
//        parent p1 = new parent();
    }
}
