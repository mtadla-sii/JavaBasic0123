package ch14_ObjectAsFiled;

public class Ex_CarMain {

    public static void main(String[] args) {
        Engine diesel = new Engine(120, "diesel");

        Car audi = new Car("audi", "yellow", diesel);
        Car bmw = new Car("bmw", "blue", diesel);
        Car ford = new Car("form", "red", new Engine(200, "petrol"));

        System.out.println(audi.getEngine().getFuel());
        System.out.println(bmw.getEngine().getFuel());
        System.out.println(ford.getEngine().getFuel());

        diesel.setFuel("electric");

        System.out.println("update.....");
        System.out.println(audi.getEngine().getFuel());
        System.out.println(bmw.getEngine().getFuel());
        System.out.println(ford.getEngine().getFuel());
    }
}
