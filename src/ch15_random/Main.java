package ch15_random;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);

        Warehouse.update(number);
        System.out.println(number);
        // 5 -> 5

        Ship ship = new Ship("Titianic");
        System.out.println(ship.name);

        Warehouse.update(ship);
        System.out.println(ship.name);
        // Titianic -> Britanic
    }
}
