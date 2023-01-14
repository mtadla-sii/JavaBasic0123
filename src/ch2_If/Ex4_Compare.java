package ch2_If;

import java.util.Scanner;

public class Ex4_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prosze podaj liczbe");
        int x = sc.nextInt();

        System.out.println("prosze podaj liczbe");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("x > y");
        } else if (x < y) {
            System.out.println("x < y");
        } else {
            System.out.println("x == y");
        }

        System.out.println("koniec programu");
    }
}
