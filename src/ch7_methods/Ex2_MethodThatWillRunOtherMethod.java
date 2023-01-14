package ch7_methods;

import java.util.Scanner;

public class Ex2_MethodThatWillRunOtherMethod {
    public static void main(String[] args) {
        System.out.println("start");
        introduce();
        System.out.println("end");
    }

    public static void introduce() {
        String name = getName();
        System.out.println("Hello " + name);
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        printTextToUser();
        return sc.nextLine();
    }

    public static void printTextToUser() {
        System.out.println("Please give me your name");
    }
}
