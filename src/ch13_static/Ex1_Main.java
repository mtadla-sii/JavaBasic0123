package ch13_static;

public class Ex1_Main {
    public static void main(String[] args) {
        Person adam = new Person("Adam");
        Person karol = new Person("Karol");
        Person mat = new Person("mat");
        Person sara = new Person("sara");

        Person.print();
        sara.printName();
    }
}
