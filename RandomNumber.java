import java.util.*;

public class RandomNumber {
    public static void main(String args[]) {
        int a, b, i, flag = 0;
        Random rand = new Random();
        int upperbound = 100;
        a = rand.nextInt(upperbound);
        Scanner sc = new Scanner(System.in);
        // System.out.println(a);
        for (i = 0; i < 3; i++) {
            System.out.println("Guess a number");
            b = sc.nextInt();
            if (b == a) {
                System.out.println("You Have guessed the right number");
                flag = 1;
                break;
            } else if (b < a) {
                System.out.println("please guess higher");
            } else {
                System.out.println("please guess lower");
            }
        }
        if (flag == 0) {
            System.out.println("You Lost!!!");
        }
    }
}