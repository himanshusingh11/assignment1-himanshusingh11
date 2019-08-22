package question5;

import java.util.Scanner;

public class solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        int ascii = (int) c;
        int ascii1 = (int) d;
        if (ascii > ascii1) {
            System.out.println(d + " " + c);
        } else {
            System.out.println(c + " " + d);
        }


    }
}
