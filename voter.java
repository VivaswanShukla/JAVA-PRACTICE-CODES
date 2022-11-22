import java.util.*;

public class voter {
    public static void eligvote(int age) {
        if (age > 18)
            System.out.println("ELIGIBLE TO VOTE");
        else
            System.out.println("VOTER NOT ELIGIBLE");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        eligvote(age);
    }
}
