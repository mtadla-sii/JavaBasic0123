package ch7_methods;

public class Calculator {
    public static float add(float a, float b) {
        System.out.println("I will add " + a + " and " + b);
        return a + b;
    }

    public static float subtract(float a, float b) {
        System.out.println("I will subtract " + a + " and " + b);
        return a - b;
    }

    public static float multiply(float a, float b) {
        System.out.println("I will multiply " + a + " and " + b);
        return a * b;
    }

    public static float divide(float a, float b) {
        System.out.println("I will divide " + a + " and " + b);
        return a / b;
    }
}
