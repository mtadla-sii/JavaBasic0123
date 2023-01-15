package ch9_constructor;

public class Vehicle {
    String color;
    int horsePower;

    public Vehicle(String colorToSet, int horsePowerToSet) {
        color = colorToSet;
        horsePower = horsePowerToSet;
    }

    public void drive() {
        System.out.println("I'm driving "
                + color +
                " car using hp: "
                + horsePower);
    }
}
