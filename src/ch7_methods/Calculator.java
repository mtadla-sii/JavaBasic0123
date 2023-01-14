package ch7_methods;

public class Calculator {
    public static int add(int a, int b) {
        System.out.println("I will add " + a + " and " + b);
        return a + b;
    }

    public static int subtract(int a, int b) {
        System.out.println("I will subtract " + a + " and " + b);
        return a - b;
    }

    public static int multiply(int a, int b) {
        System.out.println("I will multiply " + a + " and " + b);
        return a * b;
    }

    public static int divide(int a, int b) {
        System.out.println("I will divide " + a + " and " + b);
        return a / b;
    }
}
