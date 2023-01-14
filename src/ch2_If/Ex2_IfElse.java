package ch2_If;

import java.util.Scanner;

public class Ex2_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prosze podaj liczbe");

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("wszedłeś do bloku z spelnionym warunkiem");
            System.out.println("jest to liczba parzysta");
        } else {
            System.out.println("wszedłeś do bloku z niespelnionym warunkiem");
            System.out.println("nie jest to liczba parzysta");
        }

        System.out.println("koniec programu");
    }
}
