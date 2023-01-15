package ch8_oop;

public class Company {
    public static void main(String[] args) {
        Employee jan = new Employee();
        Employee adam = new Employee();
        Employee anna = new Employee();

        jan.firstName = "Jan";
        jan.lastName = "Kowalski";
        jan.age = 30;

        adam.firstName = "Adam";
        adam.lastName = "Nowak";
        adam.age = 34;

        anna.firstName = "Anna";
        anna.lastName = "Kowalska";
        anna.age = 30;

        jan.printInfo();
        adam.printInfo();
        anna.printInfo();
    }
}
