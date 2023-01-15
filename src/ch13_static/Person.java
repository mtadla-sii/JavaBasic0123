package ch13_static;

public class Person {
    private static int counter;
    private String name;

    public Person(String name) {
        this.name = name;
        counter++;
    }

    public static void print() {
        System.out.println(counter);
    }

    public void printName() {
        System.out.println(name);
    }
}
