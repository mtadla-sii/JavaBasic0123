package ch9_constructor;

public class Vehicle {
    String color;
    int horsePower;

    // tutaj powinna byc konstrukcja z 'this.' -> patrz klasa Peson
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
