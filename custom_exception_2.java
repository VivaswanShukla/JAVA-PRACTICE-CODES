package com.codes;
class excpetion1 extends Exception{
    public excpetion1(String str){
        super(str);
    }
}
public class custom_exception_2 {
    static void check(int no) throws excpetion1{
        if(no < 10){
            throw new excpetion1("NO is Inavlid");
        }
        else{
            System.out.println("okayyyy");
        }
    }

    public static void main(String[] args) {
        try{
            check(1);
        }
        catch(excpetion1 ex){
            System.out.println("Erorrrrrr" + ex);
        }
        System.out.println("You are here");
    }
}
