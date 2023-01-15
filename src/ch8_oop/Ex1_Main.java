package ch8_oop;

public class Ex1_Main {

    public static void main(String[] args) {
        Car audi = new Car();
        Car bmw = new Car();

        audi.drive();
        bmw.drive();

        audi.color = "blue";
        audi.horsePower = 100;


        audi.drive();
        bmw.drive();

        bmw.color = "red";
        bmw.horsePower = 150;

        audi.drive();
        bmw.drive();


    }
}
