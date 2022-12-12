package com.codes;
class OuterClass{
   class InnerClass{
       public void printShow(){
           System.out.println("This is Inner Class");
       }
   }
   public void printShow(){
       System.out.println("This is Outer Class");
   }
}
public class nested_class_1 {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.printShow();
        oc.printShow();
    }
}
