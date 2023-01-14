package ch2_If;

import java.util.Scanner;

public class Ex3_IfElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prosze podaj liczbe");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("jest to liczba dodatania");
        } else if (x < 0) {
            System.out.println("jest to liczba ujemna");
        } else {
            System.out.println("jest to zero");
        }

        System.out.println("koniec programu");
    }
}
