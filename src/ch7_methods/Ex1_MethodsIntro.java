package ch7_methods;

public class Ex1_MethodsIntro {

    public static int getNumber() {
        System.out.println("This is my first method with return!");
        int x = 10;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("START");
        printHelloWorld();
        int x = getNumber();
        System.out.println(x);
        printHelloWorld();
        System.out.println(getNumber());
        System.out.println("END");
    }

    public static void printHelloWorld() {
        System.out.println("this is my first method ever!");
        System.out.println("Hello world!");
    }
}
