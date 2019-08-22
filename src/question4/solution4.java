package question4;

import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        sc.close();


    }
}
