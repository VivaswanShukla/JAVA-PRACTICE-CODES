package com.codes;
class exception extends Exception{
    public exception(String str){
        super(str);
    }
}
public class custom_exception {
    static void validate(int age) throws exception{
        if(age < 18){
            throw new exception("Age is not valid");
        }
        else{
            System.out.println("You are ready to vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(13);
        }
        catch(exception ex){
            System.out.println("Error occurred " + ex);
        }
        System.out.println("Thankk you!");
    }
}
