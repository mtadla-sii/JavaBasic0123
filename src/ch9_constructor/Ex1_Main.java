package ch9_constructor;

public class Ex1_Main {
    public static void main(String[] args) {
        Vehicle audi = new Vehicle("blue", 100);
        Vehicle bmw = new Vehicle("red", 150);

        audi.drive();
        bmw.drive();
    }
}
