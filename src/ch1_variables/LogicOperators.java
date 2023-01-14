package ch1_variables;

import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("prosze podaj liczbe");

        int x = sc.nextInt();
        System.out.println("podana liczba " + x);

        System.out.println(x > 3);
        System.out.println(x < 3);
        System.out.println(x <= 3);
        System.out.println(x >= 3);
        System.out.println(x == 3);

        System.out.println("proszę podaj kolejną liczbę");
        int y = sc.nextInt();

        System.out.println("bede dzialac na liczbie " + x + " oraz " + y);


        System.out.println(x>3 && y<5);
        System.out.println(x>=3 || y==5);
    }
}
