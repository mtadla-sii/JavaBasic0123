package ch7_methods;

import java.util.Scanner;

public class UserInputHelper {
    public static int getNumber() {
        System.out.println("please give me number");
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("it was not a number");
            }
        }
    }

    public static String getName() {
        System.out.println("Podaj swoje imie");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
