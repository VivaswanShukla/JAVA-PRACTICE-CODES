package com.codes;

class even extends Thread
{

    @Override
    public void run() {
        int a = 8;
        for(int i = 0; i < a; i++)
        {
            if (i % 2 == 0)
                System.out.println(i + " is an even number");
        }
    }
}
class odd extends Thread
{
    @Override
    public void run() {
        int a = 8;
        for(int i = 0; i < a; i++)
            if(i % 2 != 0)
                System.out.println(i + " is an odd number");
    }
}
public class threads_3_oddeve {
    public static void main(String[] args)
    {
        even e1 = new even();
        e1.start();

        odd o1 = new odd();
        o1.start();
    }
}
