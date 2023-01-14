package ch3_swtich;

import java.util.Scanner;

public class Ex1_BasicSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prosze podaj liczbe");

        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("byla to liczba 1");
                break;
            case 2:
                System.out.println("byla to liczba 2");
                break;
            case 3:
                System.out.println("byla to liczba 3");
                break;
            default:
                System.out.println("wypisałeś liczbę której nie znam: " + x);
        }

        System.out.println("koniec programu");
    }
}
